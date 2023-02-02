
public class TriangleKaitou {

    public static void main(String[] args) {
        // 代入する数値は自由に変更してください
        int a = 8;
        int b = 8;
        int c = 8;

        if(a == b && b == c && c == a) {
            System.out.println("この三角形は正三角形です。");
        } else if(a == b || b == c || c == a) {
            System.out.println("この三角形は二等辺三角形です。");
        } else {
            System.out.println("この三角形は不等辺三角形です。");
        }
    }
}