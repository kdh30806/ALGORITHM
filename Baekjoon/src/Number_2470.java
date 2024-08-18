import java.io.*;
import java.util.*;

public class Number_2470 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int array[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		
		int max_pointer = N - 1;
		int min_pointer = 0;
		int min = Math.abs(array[max_pointer] + array[min_pointer]);
		int result[] = new int[2];
		result[0] = array[min_pointer];
		result[1] = array[max_pointer];
		
		while(min_pointer < max_pointer) {
			int sum = array[max_pointer] + array[min_pointer];
			if(min > Math.abs(sum)) {
				result[0] = array[min_pointer];
				result[1] = array[max_pointer];
				min = Math.abs(sum);
			}
			
			if(sum > 0) {
				max_pointer--;
			}else if(sum < 0) {
				min_pointer++;
			}else {
				break;
			}
		
		}
		
		System.out.println(result[0] + " " + result[1]);
		br.close();
	}

}
