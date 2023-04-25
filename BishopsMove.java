import java.util.*;
public class BishopsMove {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            ArrayList<String> list = new ArrayList<String>();
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                String[] board = b.split(",");
                int b1 = Integer.parseInt(board[0]);
                int b2 = Integer.parseInt(board[1]);
                String s = input.nextLine();
                String[] arr = s.split(",");
                String f = input.nextLine();
                String[] arr2 = f.split(",");
                int s1 = Integer.parseInt(arr[0]);
                int s2 = Integer.parseInt(arr[1]);
                int f1 = Integer.parseInt(arr2[0]);
                int f2 = Integer.parseInt(arr2[1]);
                if (s2-s1 == f2-f1 && s1<=b1 && s2<=b2 && f1<=b1 && f2<=b2) {
                    list.add("Yes");
                    continue;
                }
                list.add("No");
            }
            for (String y : list) {
                System.out.println(y);
            }
        }
    }
}