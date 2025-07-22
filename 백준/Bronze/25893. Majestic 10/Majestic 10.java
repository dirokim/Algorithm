import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int chk  = 0;
        int val  = 0;
        int val2 = 0;
        int val3 = 0;
        while((input = br.readLine()) != null){
            chk = 0;
            StringTokenizer st = new StringTokenizer(input," ");
            val = Integer.parseInt(st.nextToken());
            val2 = Integer.parseInt(st.nextToken());
            val3 = Integer.parseInt(st.nextToken());
            if(val >= 10){
                chk++;
            }
            if(val2 >= 10){
                chk++;
            }
            if(val3 >= 10){
                chk++;
            }
            bw.write(input+"\n");
            if(chk == 0){
                bw.write("zilch"+"\n"+"\n");
            }else if(chk == 1){
                bw.write("double"+"\n"+"\n");
            }else if(chk == 2){
                bw.write("double-double"+"\n"+"\n");
            }else if(chk == 3){
                bw.write("triple-double"+"\n"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}