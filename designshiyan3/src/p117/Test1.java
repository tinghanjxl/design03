package p117;

import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.Test;
public class Test1 {
	Logger logger=Logger.getLogger(Test1.class);
	private Sound sound;
	private Lamp lamp;
	CarAdapter ca;
	long t=System.currentTimeMillis()+2016144209;
	Random r=new Random(t);
	@Test
	public void test()
	{
		long t2=r.nextLong();
		logger.info("贾雪磊生成的随机数"+t2);
		ca=new CarAdapter(sound,lamp);
		ca.move();
		ca.light();
		ca.sound();
	}
}
