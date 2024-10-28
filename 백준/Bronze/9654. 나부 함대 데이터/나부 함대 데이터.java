import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        input += "SHIP NAME      CLASS          DEPLOYMENT IN SERVICE"+"\n";
        input += "N2 Bomber      Heavy Fighter  Limited    21        "+"\n";
        input += "J-Type 327     Light Combat   Unlimited  1         "+"\n";
        input += "NX Cruiser     Medium Fighter Limited    18        "+"\n";
        input += "N1 Starfighter Medium Fighter Unlimited  25        "+"\n";
        input += "Royal Cruiser  Light Combat   Limited    4         ";
        bw.write(input);
        br.close();
        bw.flush();
        bw.close();
	} 
}