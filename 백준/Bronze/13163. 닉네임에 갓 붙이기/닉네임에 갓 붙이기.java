import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = "";
        String answer = "";
        int num = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num = 0;
            while(st.hasMoreTokens()){
                num++;
                if(num == 1){
                    answer = st.nextToken();
                    answer = "god";
                }else{
                    answer+= st.nextToken();
                }
            }
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}