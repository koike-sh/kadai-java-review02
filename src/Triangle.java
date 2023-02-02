
public class Triangle {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        // 不等辺三角形を判定する処理
        if (a != b && b != c && a!= c) {
            System.out.println("不等辺三角形です。");
        }

        // 二等辺三角形を判定する処理
        else if (a == b && a != c || b == c && b != a || a == c && a != b) {
            System.out.println("二等辺三角形です。");
        }

        // 正三角形を判定する処理
        else {
            System.out.println("正三角形です。");
        }
    }

}
