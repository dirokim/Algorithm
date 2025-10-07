import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String val = br.readLine();
        String val2 = br.readLine();
        int answer = 0;
        if(val.equals(val2)){
            bw.write("0");
        }else{
            for(int i=0;i<num;i++){
                if(val.charAt(i) != val2.charAt(i)){
                    answer++;
                }
            }
            bw.write(""+answer);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}