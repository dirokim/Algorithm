import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num  = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num  = Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            if(num == 1){
                bw.write("C"+"\n");
            }else if(num == 2){
                bw.write("B"+"\n");
            }else if(num == 3){
                bw.write("A"+"\n");
            }else if(num == 4){
                bw.write("E"+"\n");
            }else if(num == 0){
                bw.write("D"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}