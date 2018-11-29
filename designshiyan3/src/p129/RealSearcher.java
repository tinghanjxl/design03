package p129;
import org.apache.log4j.Logger;
public class RealSearcher implements ISearcher{

	static Logger logger=Logger.getLogger(RealSearcher.class);
	public String doSearch(String userId, String keyword) {
		
		logger.info("用户"+userId+"'使用关键词'"+keyword+"查询信息!");
		return "贾雪磊返回具体内容";	
	}

}
