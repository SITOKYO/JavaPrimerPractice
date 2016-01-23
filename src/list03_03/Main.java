package list03_03;

import java.util.*;

/**
 * コレクションフレームワーク（List）繰り返し
 */
public class Main {
    public static void main(String[] args) {
	List<String> colors = new ArrayList<String>();	
        colors.add("赤");
        colors.add("青");
	colors.add("黄");
        colors.add(null);
	colors.add("黄");
	
        // イテレータによる繰り返し
        Iterator<String> iterator = colors.iterator();
	while (iterator.hasNext()) {
	    String color = iterator.next();
	    System.out.println(color);
	}
    }
}
