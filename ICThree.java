import java.io.*;
import java.util.*;

public class ICThree {
    public static void main(String[] args) throws Exception {
        File newfile = new File("C:\\Users\\mites\\Documents\\codequest\\practiceCode\\src\\ic3input.in");
        FileInputStream fs = new FileInputStream(newfile);
        
        DataInputStream in = new DataInputStream(fs);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;

        br.readLine();
        while ((strLine = br.readLine()) != null) {
            iseethree(strLine);
        }
        in.close();
    }

    public static void iseethree(String line) {
        String[] numsS = line.split(" ");
        List<Integer> nums = new ArrayList<Integer>();
        for (String s : numsS) {
            nums.add(Integer.parseInt(s));
        }
        nums.sort(Comparator.naturalOrder());
        for (int i = 0; i < nums.size()-2; i++) {
            if (nums.get(i) == nums.get(i+1) && nums.get(i) == nums.get(i+2)) {
                System.out.println("TRUE");
                return;
            }
        }
        System.out.println("FALSE");
    }
}
