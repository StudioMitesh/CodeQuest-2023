import java.util.*;
public class Ellipse{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> answers = new ArrayList<String>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                String[] arr = b.split(" ");
                double x1 = Double.parseDouble(arr[0]);
                double y1 = Double.parseDouble(arr[1]);
                double x2 = Double.parseDouble(arr[2]);
                double y2 = Double.parseDouble(arr[3]);
                double w = Double.parseDouble(arr[4]);
                double n = Double.parseDouble(arr[5]);
                for (int i = 0; i < n; i++) {
                    String test = input.nextLine();
                    String[] a = test.split(" ");
                    double xp1 = Double.parseDouble(a[0]);
                    double yp1 = Double.parseDouble(a[1]);
                    double dist1 = Math.sqrt(Math.pow(xp1-x1,2) + Math.pow(yp1-y1,2));
                    double dist2 = Math.sqrt(Math.pow(xp1-x2,2) + Math.pow(yp1-y2,2));
                    double dist = dist1+dist2;
                    String ans ="";
                    if(dist <= w) { ans = "1";}
                    else { ans = "0";}
                    answers.add(ans);
                }
            }
            
            for (String a : answers) {
                System.out.println(a);
            }
        }
    }
}