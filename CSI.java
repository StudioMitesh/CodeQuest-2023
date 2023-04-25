import java.io.*;

public class CSI {
    public static void main(String[] args) throws Exception {
        File newfile = new File("C:\\Users\\mites\\Documents\\codequest\\practiceCode\\src\\[file]");
        FileInputStream fs = new FileInputStream(newfile);
        
        DataInputStream in = new DataInputStream(fs);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;

        br.readLine();
        while ((strLine = br.readLine()) != null) {
            //function
        }
        in.close();
    }
}
