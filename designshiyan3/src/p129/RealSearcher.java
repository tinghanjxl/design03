package p129;
import org.apache.log4j.Logger;
public class RealSearcher implements ISearcher{

	static Logger logger=Logger.getLogger(RealSearcher.class);
	public String doSearch(String userId, String keyword) {
		
		logger.info("�û�"+userId+"'ʹ�ùؼ���'"+keyword+"��ѯ��Ϣ!");
		return "��ѩ�ڷ��ؾ�������";	
	}

}
