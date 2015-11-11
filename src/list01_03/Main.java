package list01_03;

/**
 * 文字列の操作（基本）
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "Java Programing";
        System.out.println("文字列s1の3文字目以降は" +
           s1.substring(3));            // ⇒ a Programing
        System.out.println("文字列s1の3～8文字目以降は" +
           s1.substring(3, 8));         // ⇒ a Prog
    }
}