import java.util.*;
public class PastIsPrologue {
    public static void main(String[] args) {
        ArrayList<String> events = new ArrayList<String>();
        ArrayList<Integer> days = new ArrayList<Integer>();
        ArrayList<Integer> nights = new ArrayList<Integer>();
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String b = input.nextLine();
                String[] arr = b.split(",");
                if (!(events.contains(arr[3]))) {
                    events.add(arr[3]);
                    days.add(0);
                    nights.add(0);
                }
                if (arr[2].equals("Day")) {
                    if (arr[4].equals("true")) {
                        int i = events.indexOf(arr[3]);
                        int g = days.get(i);
                        days.set(i, g+1);
                    }
                }
                else if (arr[2].equals("Night")) {
                    if (arr[4].equals("true")) {
                        int i = events.indexOf(arr[3]);
                        int g = nights.get(i);
                        nights.set(i, g+1);
                    }
                }
            }
            for (int i = 0; i < events.size(); i++) {
                System.out.println(events.get(i) + "," + days.get(i) + "," + nights.get(i));
            }
        }
    }
}