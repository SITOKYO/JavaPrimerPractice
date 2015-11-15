package list02_05;

import java.time.*;
import java.time.format.*;

/**
 * 日付と時間の取り扱い
 */
public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2012,1,1);
        LocalDate d2 = LocalDate.of(2012,1,4);
    
        // 3日間を表すPeriodを2通りの方法で生成
        Period p2 = Period.between(d1, d2);

        // d2のさらに3日後を計算する
        System.out.println("期間" + p2.getDays());
        
    }
}

