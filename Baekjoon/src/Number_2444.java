import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2444 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int max = 2*N-1;
		
		for(int i = 1 ; i <= 2*N-1 ; i++ ) {
			int whiteSpaceCount = Math.abs(max - (2*i-1));
			int starCount = max - whiteSpaceCount;

			for(int i2 = 0 ; i2 < whiteSpaceCount/2 ; i2++) {
				bw.write(" ");
			}
			
			for(int i2 = 0 ; i2 < starCount ; i2++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
