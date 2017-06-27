package proj.platform.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "userInfo")
public class UserInfo {
	private String userName;	//用户账号不超过50个字符
	private String password;
	
	public UserInfo() {
		super();
	}
	public UserInfo(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	@Id
	@GenericGenerator(name = "generator",strategy = "assigned")
	@Generated(value = "generator")
	@Column(name = "userName",length = 50)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
