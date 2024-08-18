import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1037 {

	static Integer[] fibonacci0 = new Integer[41];
	static Integer[] fibonacci1 = new Integer[41];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int max = Integer.parseInt(arr[0]);;
		int min = Integer.parseInt(arr[0]);;
		
		for(int i = 0 ; i < N ; i++) {
			int num = Integer.parseInt(arr[i]);
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		bw.write(String.valueOf(max * min));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
