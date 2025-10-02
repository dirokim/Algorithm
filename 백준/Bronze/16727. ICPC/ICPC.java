import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int nump = Integer.parseInt(st.nextToken());
        int nums = Integer.parseInt(st.nextToken());
        int val = nums;
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        nums += Integer.parseInt(st2.nextToken());
        int val2 = Integer.parseInt(st2.nextToken());
        nump += val2;
        if(nump == nums){
            if(val == val2){
                bw.write("Penalty");
            }else if(val > val2){
                bw.write("Esteghlal");
            }else if(val2 > val){
                bw.write("Persepolis");
            }
        }else if(nump > nums){
            bw.write("Persepolis");
        }else if(nums > nump){
            bw.write("Esteghlal");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}