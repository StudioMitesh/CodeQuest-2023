import java.util.*;
public class FindingNimo{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<Integer> answers = new ArrayList<Integer>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                String[] arr = b.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals("Nimo")) {
                        answers.add(i+1);
                        break;
                    }
                }
            }
            for (int a : answers) {
                System.out.println(a);
            }
        }
    }
}