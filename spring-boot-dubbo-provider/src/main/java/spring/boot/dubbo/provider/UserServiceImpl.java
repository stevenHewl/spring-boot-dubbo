package spring.boot.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import spring.boot.dubbo.entity.User;
import spring.boot.dubbo.service.UserService;

@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

	@Value("${dubbo.application.name}")
	private String serviceName;

	@Override
	public String sayHello(String name) {
		// return "Hello " + name;
		return String.format("[%s] : Hello, %s", serviceName, name);
	}

	@Override
	public List getUsers() {
		List list = new ArrayList();
		list.add(new User("jack", 20, "男"));
		list.add(new User("tom", 21, "女"));
		list.add(new User("rose", 19, "女"));
		return list;
	}

	@Override
	public List<User> getUserList() {
		List list = new ArrayList();
		list.add(new User("李白", 20, "男"));
		list.add(new User("习近平", 21, "女"));
		list.add(new User("李清照", 19, "女"));
		return list;
	}
}
