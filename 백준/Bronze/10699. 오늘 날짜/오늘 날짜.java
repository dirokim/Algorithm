import java.io.*; 
import java.util.*;
import java.text.SimpleDateFormat;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String date = formatter.format(now);
        bw.write(date);
        br.close();
        bw.flush();
        bw.close();
	} 
}