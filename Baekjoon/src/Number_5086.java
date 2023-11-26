import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_5086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			
			if(N == M && N == 0) {
				break;
			}
			
			if(N % M == 0) {
				bw.write("multiple\n");
			}else if(M % N == 0) {
				bw.write("factor\n");
			}else {
				bw.write("neither\n");
			}
		}
		

		br.close();
		bw.flush();
		bw.close();
	}

}
