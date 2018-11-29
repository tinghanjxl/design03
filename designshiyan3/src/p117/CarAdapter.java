package p117;
import org.apache.log4j.Logger;
import org.junit.Test;
public class CarAdapter extends CarController {
	Logger logger=Logger.getLogger(CarAdapter.class);
	public CarAdapter(Sound sound,Lamp lamp)
	{
		sound=new ConcreteSound();
		lamp=new ConcreteLamp();
		lamp=new ConcreteLamp();
		lamp.twinkle();	
	}
	public void sound() {
		
		logger.info("¼ÖÑ©ÀÚÉùÒô²¥·Å");
		
	}
	
	public void light() {
		logger.info("¼ÖÑ©ÀÚµÆ¹âÉÁË¸");
		
	}
}
