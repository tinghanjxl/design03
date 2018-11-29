package util;
import java.io.File;
import java.util.List;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class XMLUtil {

	//��־
    Logger logger = Logger.getLogger(XMLUtil.class);
    
    static //�ܵ������ڽ��������ļ����뵽�ڴ��У�Doument��
    SAXReader sAXReader = new SAXReader();
    //Doument�������ڴ��У���״�ṹ����Σ�
    static Document document;
    //����XML�ļ������÷������ɶ���
    public static  Object getObject(String xMLFileName) throws DocumentException, InstantiationException, IllegalAccessException, ClassNotFoundException {

    	//���ùܵ���������ĳһ�ļ����뵽�ڴ�Doucument������
        document = sAXReader.read(new File(xMLFileName));

        //��ȡ���С�className���Ľڵ㣨������ǡ����Եȣ�������һ��List��
        List<?> nodes = document.selectNodes("//className");

        //ȡ������List�е�һ���ڵ�Ԫ��
        Element element =  (Element) nodes.get(0);;
        
        //��ȡԪ�ص����ݣ���ֹ����м���ı���
        String objectName = element.getText();
        
        //���ɸ��ı�����Ӧ���Class�����
        Class<?> cls = Class.forName(objectName);
        
        //���÷��䣬���ɶ���
        Object object = cls.newInstance();
        
        //���ض���
        return object;

    }
}



