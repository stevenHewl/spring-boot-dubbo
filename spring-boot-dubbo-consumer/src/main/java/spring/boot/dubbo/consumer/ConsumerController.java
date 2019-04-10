package spring.boot.dubbo.consumer;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.dubbo.entity.User;
import spring.boot.dubbo.service.UserService;

@RestController
public class ConsumerController {
	/**
	 * 使用dubbo的注解 org.apache.dubbo.config.annotation.Reference。进行远程调用service
	 */
	@Reference(version = "${demo.service.version}")
	private UserService userService;

	@RequestMapping("/user")
	public String getuser(String userId) {
		String resultStr = userService.sayHello(userId);
		List list = userService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				resultStr += "<br>" + JSONObject.wrap(list.get(i));
			}
		}

		List<User> userlist = userService.getUserList();
		if (userlist != null && userlist.size() > 0) {
			for (User user : userlist) {
				resultStr += "<br>" + JSONObject.wrap(user);
			}
		}

		return resultStr;
	}
}
