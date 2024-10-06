import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int sum = Integer.parseInt(br.readLine());
        int num = 0;
        int count = 0;
        StringTokenizer st = new StringTokenizer(input," ");
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            if(num == sum){
                count+=1;
            }
        }
        br.close();
        bw.write(""+count);
        bw.flush();
        bw.close();
	} 
}