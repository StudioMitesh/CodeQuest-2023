import java.util.*;
public class Template{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> answers = new ArrayList<String>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                String[] arr = b.split(",");
            }
            
            for (String a : answers) {
                System.out.println(a);
            }
        }
    }
}