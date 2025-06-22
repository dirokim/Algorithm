import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String val = "";
        String val2 = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            val = st.nextToken();
            val2 = st.nextToken();
            if(val.equals(val2)){
                bw.write("OK"+"\n");
            }else{
                bw.write("ERROR"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}