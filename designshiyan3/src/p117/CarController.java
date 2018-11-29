package p117;

import org.apache.log4j.Logger;
public abstract class CarController {
	Logger logger=Logger.getLogger(CarController.class);
	public void move()
	{
		logger.info("贾雪磊的汽车在移动");
	}
	public abstract void sound();
	public abstract void light();

}
