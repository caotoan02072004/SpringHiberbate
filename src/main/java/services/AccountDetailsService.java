package services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dao.impl.AccountDAO;
import entities.Account;
import entities.AccountDetails;
import entities.AccountRole;

@Service
public class AccountDetailsService implements UserDetailsService {
	@Autowired 
	private AccountDAO accountDAO;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return getAccount(username);
	}
	//Lấy thông tin chi tiết của tài khoản người dùng theo username
	private AccountDetails getAccount(String username) {
		Account acc = accountDAO.get(username);
        if (acc==null){
            return null;
        }
        //xử lý lấy roles của người dùng đưa bào Authority
        Collection<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        Set<AccountRole> roles = acc.getAccountroles();
        for (AccountRole accountRole : roles) {
        	String rolename=accountRole.getRole().getRolename();
        	grantedAuthoritySet.add(new SimpleGrantedAuthority(rolename));
		}
        return new AccountDetails(grantedAuthoritySet, acc.getEmail(), acc.getFullName(), acc.getPassWord(), acc.getUserName(), acc.getGender(), acc.getAvatar(), acc.getPhone(), acc.getActive(),true,true,true);
	}

}
