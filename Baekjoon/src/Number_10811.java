import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10811 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		int[] baguni = new int[N+1];
		
		for(int i = 1 ; i <= N ; i++) {
			baguni[i] = i;
		}
		
		for(int i = 0 ; i < M ; i++) {
			String[] AB = br.readLine().split(" ");
			int A = Integer.parseInt(AB[0]);
			int B = Integer.parseInt(AB[1]);
			
			
			while(A < B) {
				int temp = baguni[A];
				baguni[A++] = baguni[B];
				baguni[B--] = temp;
			}
		}
		
		for(int i = 1 ; i <= N ; i++) {
			bw.write(String.valueOf(baguni[i]) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
