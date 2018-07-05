package weibo4j.examples.user;

import weibo4j.Users;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.User;
import weibo4j.model.WeiboException;

public class ShowUser {

	public static void main(String[] args) {
		String access_token = "2.00Vp7dEEeYcbDB399a287a87jsJhJC";
		String uid = "5235726837";
//		String uid = args[1];
		Users um = new Users(access_token);
		try {
			User user = um.showUserById(uid);
			Log.logInfo(user.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
