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
        
        // 関数による繰り返し（Java8以降）
        colors.keySet().stream().forEach((key) -> {
            String value = colors.get(key);
            System.out.println(key + "の漢字は、" + value);
        });
    }
}