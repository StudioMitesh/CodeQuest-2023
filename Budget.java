import java.util.*;
import java.text.DecimalFormat;
public class Budget{

    private static final DecimalFormat df = new DecimalFormat(".00");
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> answers = new ArrayList<String>();
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                int len = Integer.parseInt(b);
                double variance =0;
                String budget = input.nextLine();
                String[] bs = budget.split(" ");
                String spent = input.nextLine();
                String[] ss = spent.split(" ");
                double[] bs1 = new double[len];
                double[] ss1 = new double[len];
                for (int ix = 0; ix < len; ix++) {
                    bs1[ix] = Double.parseDouble(bs[ix]);
                    ss1[ix] = Double.parseDouble(ss[ix]);
                }
                for (int i = 0; i < len; i++) {
                    double diff = ss1[i]-bs1[i];
                    variance+=diff;
                }
                double avg = variance/len;
                
                String ans = df.format(avg);
                answers.add(ans);
            }
            
            for (String a : answers) {
                System.out.println(a);
            }
        }
    }
}