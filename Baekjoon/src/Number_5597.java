import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_5597 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] student = new int[31];
		boolean[] flag = new boolean[31];
		
		for(int i = 1 ; i <= 30 ; i++) {
			student[i] = i;
			flag[i] = false;
		}
		
		for(int i = 1 ; i <= 28 ; i++) {
			int n = Integer.parseInt(br.readLine());
			flag[n] = true;
		}
		
		for(int i = 1 ; i <= 30 ; i++) {
			if(!flag[i]) {
				bw.write(String.valueOf(student[i]) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
