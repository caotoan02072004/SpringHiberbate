package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // mã tự động tăng
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Image")
	private String image;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Birthday")
	private Date birthday;

	@Column(name = "Address")
	private String address;

	@Column(name = "Phone")
	private String phone;

	@Column(name = "Rank")
	private String rank;

	@Column(name = "Salary")
	private Float salary;

	@Column(name = "Status")
	private Integer status;

	@Column(name = "Department_id")
	private Integer department_id;

	@Column(name = "Level_id")
	private Integer level_id;

	@Column(name = "Certificate_id")
	private Integer certificate_id;

	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Department department;

	@ManyToOne
	@JoinColumn(name = "certificate_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Certificate certificate;

	@ManyToOne
	@JoinColumn(name = "level_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Level level;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getLevel_id() {
		return level_id;
	}

	public void setLevel_id(Integer level_id) {
		this.level_id = level_id;
	}

	public Integer getCertificate_id() {
		return certificate_id;
	}

	public void setCertificate_id(Integer certificate_id) {
		this.certificate_id = certificate_id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", image=" + image + ", birthday=" + birthday + ", address="
				+ address + ", phone=" + phone + ", rank=" + rank + ", salary=" + salary + ", status=" + status
				+ ", department_id=" + department_id + ", level_id=" + level_id + ", certificate_id=" + certificate_id
				+ ", department=" + department + ", certificate=" + certificate + ", level=" + level + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getImage()=" + getImage() + ", getBirthday()="
				+ getBirthday() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", getRank()="
				+ getRank() + ", getSalary()=" + getSalary() + ", getStatus()=" + getStatus() + ", getDepartment_id()="
				+ getDepartment_id() + ", getLevel_id()=" + getLevel_id() + ", getCertificate_id()="
				+ getCertificate_id() + ", getDepartment()=" + getDepartment() + ", getCertificate()="
				+ getCertificate() + ", getLevel()=" + getLevel() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
