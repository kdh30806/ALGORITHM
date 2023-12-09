import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1003 {

	static Integer[] fibonacci0 = new Integer[41];
	static Integer[] fibonacci1 = new Integer[41];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		fibonacci0[0] = 1;
		fibonacci0[1] = 0;
		fibonacci1[0] = 0;
		fibonacci1[1] = 1;
		
		for(int i = 0 ; i < T ; i++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(getFibonacci0(N) + " " + String.valueOf(getFibonacci1(N))) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public static int getFibonacci0(int n) {	
    	if(fibonacci0[n] != null) {
    		return fibonacci0[n];
    	}else {
    		fibonacci0[n - 1] = getFibonacci0(n - 1);
    		fibonacci0[n - 2] = getFibonacci0(n - 2);
    		return fibonacci0[n - 1] + fibonacci0[n - 2];
    	}
	}
	
	public static int getFibonacci1(int n) {	
    	if(fibonacci1[n] != null) {
    		return fibonacci1[n];
    	}else {
    		fibonacci1[n - 1] = getFibonacci1(n - 1);
    		fibonacci1[n - 2] = getFibonacci1(n - 2);
    		return fibonacci1[n - 1] + fibonacci1[n - 2];
    	}
	}
}
