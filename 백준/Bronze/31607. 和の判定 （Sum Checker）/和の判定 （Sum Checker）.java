import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        int val3 = Integer.parseInt(br.readLine());
        int chk = 0;
        if(val == (val2 + val3)){
            chk++;
        }else if(val2 == (val+val3)){
            chk++;
        }else if(val3 == (val+val2)){
            chk++;
        }
        if(chk > 0){
            bw.write("1");
        }else{
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}