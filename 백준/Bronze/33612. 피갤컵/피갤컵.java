 import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()) * 7;
        int year = 2024;
        int month = 1 + num;
        while(month > 12){
            year++;
            month -= 12;
        }
        bw.write(""+year+" "+month);
        br.close();
        bw.flush();
        bw.close();
	} 
}