package util;
import java.io.File;
import java.util.List;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class XMLUtil {

	//日志
    Logger logger = Logger.getLogger(XMLUtil.class);
    
    static //管道，用于将磁盘上文件读入到内存中（Doument）
    SAXReader sAXReader = new SAXReader();
    //Doument对象，在内存中，树状结构（层次）
    static Document document;
    //解析XML文件，利用反射生成对象
    public static  Object getObject(String xMLFileName) throws DocumentException, InstantiationException, IllegalAccessException, ClassNotFoundException {

    	//利用管道将磁盘上某一文件读入到内存Doucument对象中
        document = sAXReader.read(new File(xMLFileName));

        //读取带有“className”的节点（包括标记、属性等），放在一个List中
        List<?> nodes = document.selectNodes("//className");

        //取读到的List中第一个节点元素
        Element element =  (Element) nodes.get(0);;
        
        //读取元素的内容（起止标记中间的文本）
        String objectName = element.getText();
        
        //生成该文本所对应类的Class类对象
        Class<?> cls = Class.forName(objectName);
        
        //利用反射，生成对象
        Object object = cls.newInstance();
        
        //返回对象
        return object;

    }
}



