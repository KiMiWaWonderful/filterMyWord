package javaWeb;

import java.util.ArrayList;
import java.util.List;

public class WordsUtil {

	private static List<String> list = new ArrayList<String>();
    static{
        //����Ӧ�ô����ݿ��е������дʵģ����������ֱ���ô���ģ����
        list.add("����");
        list.add("sb");
        list.add("fuck");
    }
    public static List<String> getWords(){
        return list;
    }
    public static void reBuild(){
       //��list�е����ݴ洢�����ݿ�---ÿһ��ʱ��洢һ��
    }

}
