import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_27433 {
	
	static Long[] facto = new Long[21];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(factorial(N)));
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static Long factorial(int n) {
		if(n == 1 || n == 0) {
			facto[n] = 1L;
			return facto[n];
		}
		
		if(facto[n] != null) {
			return facto[n];
		}
		
		facto[n] = n * factorial(n - 1);
		return facto[n];
	}

}
