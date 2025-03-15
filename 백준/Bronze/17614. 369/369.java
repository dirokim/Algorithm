import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String sum = "";
        int answer = 0;
        for(int i=1;i<=num;i++){
            sum = ""+i;
            for(int j=0;j<sum.length();j++){
                if(sum.charAt(j)=='3'){
                    answer++;
                }else if(sum.charAt(j)=='6'){
                    answer++;
                }else if(sum.charAt(j)=='9'){
                    answer++;
                }
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}