package list01_08;

public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String w = s.replaceAll("[beh]", "X");
        System.out.println(w);  // =>aXc,dXf:gXi
    }
}       /* 最初の1つだけを置換するreplaceFirst()もある */