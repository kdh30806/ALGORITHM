import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2738 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			String[] array = br.readLine().split(" ");
			for(int i2 = 0 ; i2 < M ; i2++) {
				int temp = Integer.parseInt(array[i2]);
				A[i][i2] = temp;
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			String[] array = br.readLine().split(" ");
			for(int i2 = 0 ; i2 < M ; i2++) {
				int temp = Integer.parseInt(array[i2]);
				B[i][i2] = temp;
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int i2 = 0 ; i2 < M ; i2++) {
				bw.write(String.valueOf(A[i][i2] + B[i][i2]) + " ");
			}
			
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
