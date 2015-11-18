package list03_03;

import java.util.*;

/**
 * コレクションフレームワーク（List）繰り返し
 */
public class Main {
    public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
        names.add("John ");
        names.add("Paul ");
	names.add("Michel ");
	
        System.out.println("従来型の繰り返し");
        for (int i=0; i < names.size(); i++) {
            System.out.print(names.get(i));
        }
        
        System.out.println("\nIteratorによる繰り返し");
        Iterator<String> iterator = names.iterator();
	while (iterator.hasNext()) {
	    String name = iterator.next();
	    System.out.print(name);
	}
        
        System.out.println("\n拡張for文による繰り返し");
	for (String name: names) {
	    System.out.print(name);
	}
        
        System.out.println("\n関数型とラムダ式による繰り返し");
        names.forEach(name -> System.out.print(name));
    }
}