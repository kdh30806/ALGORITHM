import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_2747 {

	static int[] N_array;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		N_array = new int[N + 1];
		Arrays.fill(N_array, -1);
		N_array[0] = 0;
		N_array[1] = 1;
		bw.write(String.valueOf(Fibonacci(N)));
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int Fibonacci(int N) {
	
		if(N_array[N] != -1) {
			return N_array[N];
		}else {
			return N_array[N] = Fibonacci(N - 1) + Fibonacci(N - 2);
		}
	
		
	}

}
