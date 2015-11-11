package list03_02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * コレクションフレームワーク（List）
 */
public class Main {
    public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
        names.add("湊");
	names.add("朝香");
	names.add("菅原");
        
	Iterator<String> it = names.iterator(); /* イテレータの取得 */
        
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}