import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        int val = 0;
        int val2 = 0;
        int battle = 0;
        for(int i=0;i<length;i++){
            battle++;
            val = 0;
            val2 = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            val += (Integer.parseInt(st.nextToken())*1);
            val += (Integer.parseInt(st.nextToken())*2);
            val += (Integer.parseInt(st.nextToken())*3);
            val += (Integer.parseInt(st.nextToken())*3);
            val += (Integer.parseInt(st.nextToken())*4);
            val += (Integer.parseInt(st.nextToken())*10);
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            val2 += (Integer.parseInt(st2.nextToken())*1);
            val2 += (Integer.parseInt(st2.nextToken())*2);
            val2 += (Integer.parseInt(st2.nextToken())*2);
            val2 += (Integer.parseInt(st2.nextToken())*2);
            val2 += (Integer.parseInt(st2.nextToken())*3);
            val2 += (Integer.parseInt(st2.nextToken())*5);
            val2 += (Integer.parseInt(st2.nextToken())*10);
            if(val == val2){
                bw.write("Battle "+battle+": No victor on this battle field\n");
            }else if(val > val2){
                bw.write("Battle "+battle+": Good triumphs over Evil\n");
            }else if(val2 > val){
                bw.write("Battle "+battle+": Evil eradicates all trace of Good\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}