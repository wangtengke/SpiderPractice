package weibo4j.examples.comment;

import com.pachong.entity.clearlove_weibocomment;
import com.pachong.service.clearloveWeibocommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import weibo4j.Comments;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.Comment;
import weibo4j.model.CommentWapper;
import weibo4j.model.Paging;
import weibo4j.model.WeiboException;

import java.util.List;
import java.util.Map;
@Controller
public class GetCommentById {
//	private static clearloveWeibocommentService clearloveWeibocommentService;
ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	clearloveWeibocommentService clearloveWeibocommentService= ac.getBean(clearloveWeibocommentService.class);
	clearlove_weibocomment clearloveWeibocomment =new clearlove_weibocomment();
	String access_token = "2.00Vp7dEEeYcbDB399a287a87jsJhJC";
	String id = "4226684565293736";

	public void getComment(){
		Comments cm = new Comments(access_token);
		for(int k=1;k<11;k++) {
			try {
				Paging page = new Paging();
				page.setCount(200);
				page.setPage(k);
				CommentWapper comment = cm.getCommentById(id, page, 0);
				List<Comment> s = comment.getComments();
				for (int i = 0; i < s.size(); i++) {
					String Text = s.get(i).getText();
					String ScreenName = s.get(i).getUser().getScreenName();
					String Location = s.get(i).getUser().getLocation();
					String gender = s.get(i).getUser().getGender();

					clearloveWeibocomment.setText(Text);
					clearloveWeibocomment.setScreenname(ScreenName);
					clearloveWeibocomment.setLocation(Location);
					clearloveWeibocomment.setGender(gender);
					clearloveWeibocommentService.saveMsg(clearloveWeibocomment);
				}
//			Log.logInfo(comment.toString());
			} catch (WeiboException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		GetCommentById c=new GetCommentById();
		c.getComment();
	}

}
