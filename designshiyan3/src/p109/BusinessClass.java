package p109;

import org.apache.log4j.Logger;

public class BusinessClass implements IAbstractLog {

	Logger logger=Logger.getLogger(BusinessClass.class);
	public void method() {
		
		logger.info("贾雪磊调用真实业务方法");
	}

}
