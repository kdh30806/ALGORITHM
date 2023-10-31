import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2566 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int a = 0;
		int b = 0;
		
		for(int x = 1 ; x <= 9 ; x++) {
			String[] array = br.readLine().split(" ");
			for(int y = 1 ; y <= 9 ; y++) {
				int temp = Integer.parseInt(array[y - 1]);
				if(temp >= max) {
					max = temp;
					a = x;
					b = y;
				}
			}
		}
		
		bw.write(String.valueOf(max) + "\n");
		bw.write(String.valueOf(a) + " " + String.valueOf(b));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
