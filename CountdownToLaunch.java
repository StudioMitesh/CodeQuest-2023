import java.util.*;
public class CountdownToLaunch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            ArrayList<String> list = new ArrayList<String>();
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                boolean t = false;
                boolean f = true;
                int s = Integer.parseInt(input.nextLine()); 
                for (int x = 0; x < s; x++) {
                    String b = input.nextLine();
                    String[] arr = b.split(" ");
                    if (Integer.parseInt(arr[2]) > 1000)
                        continue;
                    double w = Double.parseDouble(arr[3]);
                    int d = Integer.parseInt(arr[4]);
                    if (f && Math.abs(w*Math.sin(Math.toRadians(d))) <= 40 && Math.abs(w*Math.cos(Math.toRadians(d))) <= 20) {
                        list.add(arr[0]+" "+arr[1]);
                        t = true;
                        f = false;
                    }
                }
                if (!t) {
                    list.add("ABORT LAUNCH");
                }
            }
            for (String y : list) {
                System.out.println(y);
            }
        }
    }
}