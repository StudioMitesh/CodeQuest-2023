import java.util.*;
public class TheBottomLine{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> answers = new ArrayList<String>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                String[] arr = b.split(" ");
                int n1 = Integer.parseInt(arr[0]);
                int n2 = Integer.parseInt(arr[1]);
                if (n1 > n2) {
                    int diff = n1-n2;
                    answers.add("Cassowary Craft sold " + diff + " more aircraft");
                }
                else if (n1 < n2) {
                    int diff = n2-n1;
                    answers.add("Lead Balloons Ltd sold " + diff + " more aircraft");
                }
                if (n1 == n2) {
                    answers.add("Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft");
                }
            }
            
            for (String a : answers) {
                System.out.println(a);
            }
        }
    }
}