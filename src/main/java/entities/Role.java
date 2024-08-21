package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	@Id
	@Column(name = "roleid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "rolename")
	private String rolename;
	
	@OneToMany(mappedBy = "role")
	private Set<AccountRole> accountroles;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Set<AccountRole> getAccountroles() {
		return accountroles;
	}

	public void setAccountroles(Set<AccountRole> accountroles) {
		this.accountroles = accountroles;
	}
	
}
