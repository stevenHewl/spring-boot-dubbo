package spring.boot.dubbo.service;

import java.util.List;

import spring.boot.dubbo.entity.User;

public interface UserService {
	String sayHello(String name);

	List getUsers();

	List<User> getUserList();
}
