import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        String name = "";
        String name2 = "";
        int num = 0;
        int num2 = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            name2 = st.nextToken();
            num2 = Integer.parseInt(st.nextToken());
            if(num < num2){
                num = num2;
                name = name2;
            }
        }
        bw.write(name);
        br.close();
        bw.flush();
        bw.close();
	} 
}