package p129;
import org.apache.log4j.Logger;
public class Logger1 {

	Logger logger=Logger.getLogger(Logger1.class);
	public void log(String userId)
	{
		if(userId.equals("贾雪磊"))
		{
			logger.info("更新数据库，用户"+userId+"查询次数加1!");
		}
		
	}
}
