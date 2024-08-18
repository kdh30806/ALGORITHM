import java.io.*;
import java.util.*;

public class Number_3273 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int array[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		int x = Integer.parseInt(br.readLine());
		int check = 0;
		int i = 0;
		int j = N - 1;
		
		while(i < j) {
			int sum = array[i] + array[j];
			
			if(sum < x) i++;
			else if(sum > x) j--;
			else {
				check++;
				i++;
			}
		}
		
		System.out.println(check);
		br.close();
	}

}
