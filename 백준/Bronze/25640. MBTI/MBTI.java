import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String mbti = br.readLine();
        String input = br.readLine();
        int num = 0;
        while((input = br.readLine()) != null){
            if(mbti.equals(input)){
                num++;
            }
        }
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}