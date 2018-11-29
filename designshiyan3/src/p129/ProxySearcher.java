package p129;

public class ProxySearcher implements ISearcher{

	private AccessValidator validator;
	private RealSearcher searcher=new RealSearcher();          //维持对一个真实主题的引用
	private Logger1 logger;
	
	public String doSearch(String userId, String keyword) {
		//如果身份验证成功，则执行查询
		if(this.validate(userId))
		{
			String result=searcher.doSearch(userId, keyword);      //调用真实主题对象的查询方法
			this.log(userId);     //记录查询日志
			return result;          //返回查询结果
		}
		else
		{
			return null;
		}
		
	
	}
	
	//创建访问验证对象并调用其validate方法实现身份验证
	public boolean validate(String userId)
	{
		validator=new AccessValidator();
		return validator.validate(userId);
		
	}
	//创建日志记录对象并调用其log方法实现日志记录
	public void log(String userId)
	{
		logger=new Logger1();
		logger.log(userId);
	}

}
