import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void solution()throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        br.close();
        for(int i=1;i<=n;i++){
            System.out.println(""+i);
        }
	}
	public static void main(String[]args) throws IOException{
		solution();
	}
}

