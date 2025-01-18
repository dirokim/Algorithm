import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        String sum = "";
        String answer = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num = Integer.parseInt(st.nextToken());
            sum = st.nextToken();
            answer = "";
            for(int i=0;i<sum.length();i++){
                for(int j=0;j<num;j++){
                    answer += ""+sum.charAt(i);
                }
            }
            bw.write(answer+"\n");
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}