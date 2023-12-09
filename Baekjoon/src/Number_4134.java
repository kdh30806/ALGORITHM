import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_4134 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++) {
			int N = Integer.parseUnsignedInt(br.readLine());
			while(true) {
				if(isPrime(N)) {
					bw.write(String.valueOf(N) + "\n");
					break;
				}
				N++;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static boolean isPrime(int a) {
		
		if (a < 2) {
	        return false;
	    }
		
		for(int i = 2 ; i <= Math.sqrt(a) ; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
