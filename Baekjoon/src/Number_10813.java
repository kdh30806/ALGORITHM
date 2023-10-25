import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10813 {

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
			String[] ab =  br.readLine().split(" ");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			
			swap(baguni, a, b);
		}
		
		for(int i = 1 ; i <= N ; i++) {
			bw.write(String.valueOf(baguni[i]) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void swap(int[] array ,int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
