package p129;

import java.util.Random;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.junit.Test;
import util.XMLUtil;
public class Client {
	Logger logger=Logger.getLogger(Client.class);
	AccessValidator validate;
	long t=System.currentTimeMillis()+2016144209;
	Random r=new Random(t);
	@Test
	public void demo() throws InstantiationException, IllegalAccessException, ClassNotFoundException, DocumentException
	{
		long t2=r.nextLong();
		logger.info("��ѩ�����ɵ������"+t2);
		ISearcher searcher;    //��Գ����̣��ͻ�������ֱ���ʵ������ʹ�����
		searcher=(ISearcher)XMLUtil.getObject("src/config.xml");
		String result=searcher.doSearch("��ѩ��","2016144209");
		
		
	}

}
