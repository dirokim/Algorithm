import java.io.*; 
import java.util.*;
import java.time.LocalDate;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int date = now.getDayOfMonth();
        bw.write(""+year+"\n"+month+"\n"+date);
        br.close();
        bw.flush();
        bw.close();
	} 
}