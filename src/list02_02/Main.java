package list02_02;

import java.time.*;

/**
 * 日付と時間の取り扱い
 */
public class Main {
    public static void main(String[] args) {
        // ZonedDateTimeの生成方法
        ZonedDateTime z1 = ZonedDateTime.now();  /* 現在日時を取得 */

        // InstantとZoneDateTimeの相互変換
        Instant i3 = z1.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        // ZonedDateTimeの利用方法
        System.out.println("東京:" + 
            z1.getYear() + "年" + z1.getMonthValue() + "月" + z1.getDayOfMonth() + "日");
        System.out.println("ロンドン:" + 
            z3.getYear() + "年" + z3.getMonthValue() + "月" + z3.getDayOfMonth() + "日");
        if(z1.isEqual(z3)) {   /* 同じ瞬間の判定にはequals()ではなくisEqual()を使う */
            System.out.println("これらは同じ瞬間を指しています");
        }
    }
}

