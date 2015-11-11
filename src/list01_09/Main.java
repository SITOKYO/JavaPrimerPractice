package list01_09;

/**
 * 文字列の操作（書式整形）
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        
        final String FORMAT = "%8s %6s 所持金%,5d";
        String s = String.format(FORMAT, 
          hero.getName(), hero.getGold(), hero.getGold());
        System.out.println(s);   
    }
}