import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1934 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for(int i = 0 ; i < T ; i++) {
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			
			int multiple = N;
			while(true) {
				if(N % M == 0) {
					result.append(N).append("\n");
					break;
				}else {
					N += multiple;
				}
			}
		}
		
		bw.write(result.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
