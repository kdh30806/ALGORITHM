import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Number_25305 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int k = Integer.parseInt(NM[1]);
		
		String[] array = br.readLine().split(" ");
		Integer[] grade = new Integer[N];
		
		for(int i = 0 ; i < N ; i++) {
			grade[i] = Integer.parseInt(array[i]);
		}
		
		Arrays.sort(grade, Collections.reverseOrder());
		
		bw.write(String.valueOf(grade[k - 1]));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
