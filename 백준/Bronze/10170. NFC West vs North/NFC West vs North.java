import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        input += "NFC West       W   L  T"+"\n";
        input += "-----------------------"+"\n";
        input += "Seattle        13  3  0"+"\n";
        input += "San Francisco  12  4  0"+"\n";
        input += "Arizona        10  6  0"+"\n";
        input += "St. Louis      7   9  0"+"\n"+"\n";
        input += "NFC North      W   L  T"+"\n";
        input += "-----------------------"+"\n";
        input += "Green Bay      8   7  1"+"\n";
        input += "Chicago        8   8  0"+"\n";
        input += "Detroit        7   9  0"+"\n";
        input += "Minnesota      5  10  1"+"\n";
        bw.write(input);
        br.close();
        bw.flush();
        bw.close();
	} 
}