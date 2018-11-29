package p129;
import org.apache.log4j.Logger;

public class AccessValidator{
	static Logger logger=Logger.getLogger(AccessValidator.class);
	public static boolean validate(String userId)
	{
		logger.info("验证用户"+userId+"是否为合法用户？");
		if(userId.equalsIgnoreCase("贾雪磊"))
		{
			logger.info(userId+"登陆成功!");
			return true;
		}
		else
		{
			logger.info(userId+"登陆失败!");
			return false;
		}
		
		
	}
	
	
}
