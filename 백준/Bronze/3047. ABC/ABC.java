import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int [] sum = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String answer = br.readLine();
        String sum2 = "";
        for(int i=0;i<sum.length;i++){
            sum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sum);
        if(answer.startsWith("A")){
            if(answer.endsWith("B")){
                sum2 = ""+sum[0]+" "+sum[2]+" "+sum[1];
            }else if(answer.endsWith("C")){
                sum2 = ""+sum[0]+" "+sum[1]+" "+sum[2];
            }
        }else if(answer.startsWith("B")){
            if(answer.endsWith("A")){
                sum2 = ""+sum[1]+" "+sum[2]+" "+sum[0];
            }else if(answer.endsWith("C")){
                sum2 = ""+sum[1]+" "+sum[0]+" "+sum[2];
            }
        }else if(answer.startsWith("C")){
            if(answer.endsWith("B")){
                sum2 = ""+sum[2]+" "+sum[0]+" "+sum[1];
            }else if(answer.endsWith("A")){
                sum2 = ""+sum[2]+" "+sum[1]+" "+sum[0];
            }
        }
        bw.write(sum2);
        br.close();
        bw.flush();
        bw.close();
	} 
}