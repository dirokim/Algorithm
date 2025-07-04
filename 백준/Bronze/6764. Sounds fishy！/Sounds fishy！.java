import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int val  = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        int val3 = Integer.parseInt(br.readLine());
        int val4 = Integer.parseInt(br.readLine());
        String answer = "No Fish";
        int chk = 0;
        int chk2 = 0;
        if(val < val2){
            chk++;
        }
        if(val2 < val3){
            chk++;
        }
        if(val3 < val4){
            chk++;
        }
        if(chk == 3){
            answer = "Fish Rising";
        }
        if(val > val2){
            chk2++;
        }
        if(val2 > val3){
            chk2++;
        }
        if(val3 > val4){
            chk2++;
        }
        if(chk2 == 3){
            answer = "Fish Diving";
        }
        if(val == val2 && val2 == val3 && val3 == val4){
            answer = "Fish At Constant Depth";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}