package p117;

import org.apache.log4j.Logger;
public abstract class CarController {
	Logger logger=Logger.getLogger(CarController.class);
	public void move()
	{
		logger.info("��ѩ�ڵ��������ƶ�");
	}
	public abstract void sound();
	public abstract void light();

}
