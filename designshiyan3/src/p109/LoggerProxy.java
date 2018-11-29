package p109;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.log4j.Logger;
import org.junit.Test;

public class LoggerProxy implements IAbstractLog {
	Logger logger=Logger.getLogger(LoggerProxy.class);
	BusinessClass bc;
	public LoggerProxy()
	{
		bc=new BusinessClass();
	}
	@Test
	public void method() {
		
		Calendar calendar=new GregorianCalendar();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(calendar.MONTH);
		int day=calendar.get(calendar.DAY_OF_MONTH);
		int hour=calendar.get(calendar.HOUR)+12;
		int minute=calendar.get(calendar.MINUTE);
		int second=calendar.get(calendar.SECOND);
		String datetime=year+"-"+month+"-"+day+"-"+hour+"-"+minute+"-"+second+"!";
		logger.info("贾雪磊的方法method()被调用的时间是"+datetime);
		try
		{
			bc.method();
			logger.info("贾雪磊的method()方法调用成功！");
		}catch(Exception e)
		{
			logger.info("贾雪磊的method()方法调用失败！");
		}
	}

}
