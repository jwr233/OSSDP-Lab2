import java.net.Socket;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner sc = new Scanner(System.in);
        String s0=sc.nextLine();
        sc.close();
        List<String> ANS=new ArrayList<String>();  // 这行声明可以保留，但不必要
        ANS = solution.findRepeatedDnaSequences(s0);  // 直接使用变量名 's'

        System.out.println(ANS);
    }
}
