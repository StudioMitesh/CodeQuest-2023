import java.util.*;
public class ShipHealthSummary{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<Double> answers = new ArrayList<Double>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                int i = Integer.parseInt(b);
                int total = 0;
                int weights = 0;
                for (int x = 0; x < i; x++) {
                    String a = input.nextLine();
                    String[] arr = a.split(" ");
                    int num = Integer.parseInt(arr[1]);
                    if (arr[0].equals("LOW")) {total += num; weights++;}
                    if (arr[0].equals("MEDIUM")) {total += 2*num; weights+=2;}
                    if (arr[0].equals("HIGH")) {total += 3*num; weights+=3;}
                    
                }   
                double avg = (double) total /weights;
                    avg *=10;
                    if (avg % 1 >= 0.5) {
                        avg+=0.5;
                    }
                    avg = Math.floor(avg);
                    answers.add(avg);
            }
            
            for (double a : answers) {
                System.out.println((int)a);
            }
        }
    }
}