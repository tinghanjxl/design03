package p109;

import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Client {
	Logger logger=Logger.getLogger(Client.class);
	IAbstractLog al;
	long t=System.currentTimeMillis()+2016144209;
	Random r=new Random(t);
	@Test
	public void test()
	{
		long t2=r.nextLong();
		logger.info("贾雪磊生成的随机数"+t2);
		al=new LoggerProxy();
		al.method();
	}

}
