package list03_05;

import java.util.HashSet;
import java.util.Set;

/**
 * コレクションフレームワーク（Set）
 */
public class Main {
    public static void main(String[] args) {
	Set<String> colors = new HashSet<String>();
	colors.add("赤");
	colors.add("青");
	colors.add("黄");
        colors.add("黄");
        
        // 関数による繰り返し（Java8以降）
        colors.stream().forEach(System.out::println);
    }
}