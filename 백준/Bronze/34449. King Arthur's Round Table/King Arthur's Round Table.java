import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        double weight = Double.parseDouble(br.readLine()) * 3.14159d;
        double night = Double.parseDouble(br.readLine()) * Double.parseDouble(br.readLine());
        if(weight >= night){
            bw.write("YES");
        }else{
            bw.write("NO");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}