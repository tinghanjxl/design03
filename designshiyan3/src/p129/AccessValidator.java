package p129;
import org.apache.log4j.Logger;

public class AccessValidator{
	static Logger logger=Logger.getLogger(AccessValidator.class);
	public static boolean validate(String userId)
	{
		logger.info("��֤�û�"+userId+"�Ƿ�Ϊ�Ϸ��û���");
		if(userId.equalsIgnoreCase("��ѩ��"))
		{
			logger.info(userId+"��½�ɹ�!");
			return true;
		}
		else
		{
			logger.info(userId+"��½ʧ��!");
			return false;
		}
		
		
	}
	
	
}
