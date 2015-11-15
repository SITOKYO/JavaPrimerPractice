package list01_04;

/**
 * 文字列の操作（連結）
 */
public class Main {
    public static void main(String[] args) {

        // Stringでの文字列結合
        String string = "";
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            string = string + "Java";
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Stringで処理にかかった時間は..." +
		(end1-start1) + "ミリ秒でした");
        
        // StringBuilderでの文字列結合
        StringBuilder stringBuilder = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            stringBuilder.append("Java");
        }
        long end2 = System.currentTimeMillis();
        String s2 = stringBuilder.toString();
        System.out.println("StringBuilderで処理にかかった時間は..." +
		(end2-start2) + "ミリ秒でした");
        
        // StringBuilderでの文字列結合
        StringBuffer stringBuffer = new StringBuffer();
        long start3 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            stringBuffer.append("Java");
        }
        long end3 = System.currentTimeMillis();
        String s3 = stringBuffer.toString();
        System.out.println("StringBufferで処理にかかった時間は..." +
		(end3-start3) + "ミリ秒でした");
        
    }
}