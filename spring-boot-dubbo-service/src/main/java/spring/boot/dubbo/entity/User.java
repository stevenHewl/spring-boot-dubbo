package spring.boot.dubbo.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class User implements Serializable {

	private static final long serialVersionUID = 4822167809496329533L;

	public User() {
	}

	public User(String name, Integer age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Column(nullable = false, unique = true)
	public String name;

	@Column(nullable = false, unique = true)
	public Integer age;

	@Column(nullable = false, unique = true)
	public String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
