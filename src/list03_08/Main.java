package list03_08;

import java.util.*;

/**
 * コレクションフレームワーク（Map）
 */
public class Main {
    public static void main(String[] args) {
	Map<String, String> colors = new HashMap<String, String>();
	colors.put("red", "赤");
	colors.put("blue", "青");
	colors.put("yellow", "黄");
        
        // 拡張for文による繰り返し
        for(String key : colors.keySet()){
            String value = colors.get(key);
            System.out.println(key + "の漢字は、" + value);         
        }
    }
}