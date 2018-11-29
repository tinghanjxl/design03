package p129;

public class ProxySearcher implements ISearcher{

	private AccessValidator validator;
	private RealSearcher searcher=new RealSearcher();          //ά�ֶ�һ����ʵ���������
	private Logger1 logger;
	
	public String doSearch(String userId, String keyword) {
		//��������֤�ɹ�����ִ�в�ѯ
		if(this.validate(userId))
		{
			String result=searcher.doSearch(userId, keyword);      //������ʵ�������Ĳ�ѯ����
			this.log(userId);     //��¼��ѯ��־
			return result;          //���ز�ѯ���
		}
		else
		{
			return null;
		}
		
	
	}
	
	//����������֤���󲢵�����validate����ʵ�������֤
	public boolean validate(String userId)
	{
		validator=new AccessValidator();
		return validator.validate(userId);
		
	}
	//������־��¼���󲢵�����log����ʵ����־��¼
	public void log(String userId)
	{
		logger=new Logger1();
		logger.log(userId);
	}

}
