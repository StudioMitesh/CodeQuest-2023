import java.util.*;
public class FillInTheBlanks{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> answers = new ArrayList<String>();

            for(int testcase = 0; testcase < testCases; testcase++) {

                String b = input.nextLine();
                String[] arr = b.split(" ");

                int l = Integer.parseInt(arr[0]);
                int mess = Integer.parseInt(arr[1]);

                ArrayList<String> n = new ArrayList<String>();

                for (int i = 0; i < l; i++) {
                    n.add(input.nextLine());
                }

                String[] output = new String[mess];


                for(int i=0; i<mess; i++){
                    String line = input.nextLine();

                    output[i] = line;
                }

                for(int i=0; i<output.length; i++){
                    String[] currOuput = output[i].split(" ");

                    for(int j = 1; j < currOuput.length-1; j++){
                        if(currOuput[j].length() > 0&&currOuput[j].charAt(0) == '['){
                            for (String string : n) {
                                String[] vals = string.split(":");
                                String key = vals[0];
                                String value = vals[1].substring(1);

                                if(value.charAt(value.length()-1) == ' ') value.subSequence(1, value.length()-1);
                                
                                if(currOuput[j].equals("[" + key.split(" ")[0])){
                                    currOuput[j] = value;
                                }

                            }
                            currOuput[j+1] = currOuput[j+1].substring(currOuput[j+1].indexOf("]")+1);
                        }

                        if(currOuput[j+1].equals(" ")) currOuput[j] = "";

                       
                    }

                    for (int m = 0; m < currOuput.length; m++) {
                        for (int ab = 0; ab < currOuput[m].length(); ab++) {
                            if (currOuput[m].substring(ab,ab+1).equals(" ") && currOuput[m].substring(ab,ab+1).equals("1") && currOuput[m].substring(ab,ab+1).equals("2") && currOuput[m].substring(ab,ab+1).equals("3") && currOuput[m].substring(ab,ab+1).equals("4") && currOuput[m].substring(ab,ab+1).equals("5") && currOuput[m].substring(ab,ab+1).equals("6") && currOuput[m].substring(ab,ab+1).equals("7") && currOuput[m].substring(ab,ab+1).equals("8") && currOuput[m].substring(ab,ab+1).equals("9")) {
                                currOuput[m] = currOuput[m].substring(0, currOuput[m].length());
                            }
                        }
                    }

                    String s = "";

                    for(int e=0; e<currOuput.length; e++){
                        s+=currOuput[e].contains(" ") ? currOuput[e]: currOuput[e]+ " ";
                    }


                   if(s.equals("  ")) s = " ";

                    output[i] = s;
                }

                for(int i=0; i<output.length; i++){
                    if(output[i].equals("  ")) continue;
                    System.out.println(output[i]);
                }

                
            }

        }
    }
}