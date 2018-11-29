package p117;

import org.apache.log4j.Logger;

public class ConcreteSound extends Sound{

	Logger logger=Logger.getLogger(ConcreteSound.class);
	public void phonate() {
	
		logger.info("¼ÖÑ©ÀÚ½«ÉùÒô²¥·Å£¡");
	}

}
