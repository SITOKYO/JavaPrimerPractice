package list02_01;

import java.util.Date;		/* importしておくと便利 */

/**
 * 日付と時間の取り扱い
 */
public class Main {
    public static void main(String[] args) {
	Date now = new Date();
	System.out.println(now);
	System.out.println(now.getTime());
        
	Date past = new Date(1316622225935L);
	System.out.println(past);
    }
}

