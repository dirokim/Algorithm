import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int num = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(st.hasMoreTokens()){
             list.add(Integer.parseInt(st.nextToken()));
        }
        String answer = "";
        Collections.sort(list);
        for(Integer val : list){
            bw.write(""+val+" ");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}