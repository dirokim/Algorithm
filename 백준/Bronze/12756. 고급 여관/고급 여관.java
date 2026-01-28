import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int atkinput = Integer.parseInt(st.nextToken());
        int hpinput = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int atkinput2 = Integer.parseInt(st2.nextToken());
        int hpinput2 = Integer.parseInt(st2.nextToken());
        while(hpinput > 0 && hpinput2 > 0){
            hpinput -= atkinput2;
            hpinput2 -= atkinput;
        }
        if(hpinput <= 0 && hpinput2 <= 0){
            bw.write("DRAW");
        }else if(hpinput <= 0){
            bw.write("PLAYER B");
        }else if(hpinput2 <= 0){
            bw.write("PLAYER A");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}