package p129;
import org.apache.log4j.Logger;
public class Logger1 {

	Logger logger=Logger.getLogger(Logger1.class);
	public void log(String userId)
	{
		if(userId.equals("��ѩ��"))
		{
			logger.info("�������ݿ⣬�û�"+userId+"��ѯ������1!");
		}
		
	}
}
