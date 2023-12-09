import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_13241 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		Long N = Long.parseLong(NM[0]);
		Long M = Long.parseLong(NM[1]);
		
		StringBuilder result = new StringBuilder();
		Long multiple = N;
		while(true) {
			if(N % M == 0) {
				result.append(N).append("\n");
				break;
			}else {
				N += multiple;
			}
		}
		
		bw.write(result.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
