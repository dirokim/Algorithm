import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        String input = "";
        for(int i=0;i<num;i++){
            sum = Integer.parseInt(br.readLine());
            input = br.readLine();
            if(input.equals("0")){
                
            }else{
                for(int j=0;j<Integer.parseInt(input);j++){
                    StringTokenizer st = new StringTokenizer(br.readLine()," ");
                    sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
                }
            }
            bw.write(""+sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}