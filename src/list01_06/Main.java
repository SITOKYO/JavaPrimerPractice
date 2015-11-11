package list01_06;

/**
 * 文字列の操作（正規表現）
 */
public class Main {

    /* リスト1-6 ここから */
    boolean isValidPlayerName(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");    /* 文字列パターン */
    }

    public static void main(String... args){
        Main main = new Main();
        System.out.println("AAAAAAAA:" + main.isValidPlayerName("AAAAAAAA"));
        System.out.println("AAAAAAAAA:" + main.isValidPlayerName("AAAAAAAAA"));
    }

}