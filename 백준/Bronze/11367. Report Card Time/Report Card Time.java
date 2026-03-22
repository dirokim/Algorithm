import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = "";
        int num = 0;
        String sum2 = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            sum = st.nextToken();
            num = Integer.parseInt(st.nextToken());
            if(num > 96){
                sum2 = "A+";
            }else if(num > 89){
                sum2 = "A";
            }else if(num > 86){
                sum2 = "B+";
            }else if(num > 79){
                sum2 = "B";
            }else if(num > 76){
                sum2 = "C+";
            }else if(num > 69){
                sum2 = "C";
            }else if(num > 66){
                sum2 = "D+";
            }else if(num > 59){
                sum2 = "D";
            }else if(num > 0){
                sum2 = "F";
            }
            bw.write(sum+" "+sum2+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}