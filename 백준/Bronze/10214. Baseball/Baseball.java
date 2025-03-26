import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sumA = 0;
        int sumB = 0;
        String input  = "";
        for(int i=0;i<num;i++){
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            input = br.readLine();
            sumA += Integer.parseInt(input.substring(0,1));
            sumB += Integer.parseInt(input.substring(2,3));
            if(sumA > sumB){
                bw.write("Yonsei\n");
            }else if(sumB > sumA){
                bw.write("Korea\n");
            }else if(sumA == sumB){
                bw.write("Draw\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}