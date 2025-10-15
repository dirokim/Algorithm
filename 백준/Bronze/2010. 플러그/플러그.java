import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 1;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num--;
            num += Integer.parseInt(st.nextToken());
        }
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}