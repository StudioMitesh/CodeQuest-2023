import java.util.*;
public class Detecting{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> answers = new ArrayList<String>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b1 = input.nextLine();
                String[] arr1 = b1.split(" ");
                String b2 = input.nextLine();
                String[] arr2 = b2.split(" ");
                Double[] arr1d = new Double[arr1.length];
                Double[] arr2d = new Double[arr1.length];
                ArrayList<Integer> indexes = new ArrayList<Integer>();
                int num = 0;
                for (int i = 0; i < arr1.length; i++) {
                    arr1d[i] = Double.parseDouble(arr1[i]);
                    arr2d[i] = Double.parseDouble(arr2[i]);
                }
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1d[i] >= 0.6 && arr1d[i] <= 0.85 && arr2d[i] >= 0.6 && arr2d[i] <= 0.85) {
                        num++;
                        indexes.add(i);
                    }
                }
                if (num == 0) {
                    answers.add("No multipaction events detected.");
                }
                if (num == 1) {
                    answers.add("A multipaction event was detected at time index " + indexes.get(0) + ".");
                }
                if (num > 1) {
                    String ans = "";
                    for (int f : indexes) {
                        ans = ans + f + " ";
                    }
                    ans = ans.substring(0, ans.length()-1);
                    answers.add(num + " multipaction events were detected at time indices: " + ans + ".");
                }
            }
            
            for (String a : answers) {
                System.out.println(a);
            }
        }
    }
}