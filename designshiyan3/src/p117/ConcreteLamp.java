package p117;

import org.apache.log4j.Logger;

public class ConcreteLamp extends Lamp {

	Logger logger=Logger.getLogger(ConcreteLamp.class);
	public void twinkle() {
		
		logger.info("¼ÖÑ©ÀÚ½«µÆ¹âÉÁË¸£¡");	
	}

}
