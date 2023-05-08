import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2587 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num_1 = Integer.parseInt(br.readLine());
		int num_2 = Integer.parseInt(br.readLine());
		int num_3 = Integer.parseInt(br.readLine());
		int num_4 = Integer.parseInt(br.readLine());
		int num_5 = Integer.parseInt(br.readLine());
		
		int[] numArray = {num_1, num_2, num_3, num_4, num_5};
		
		for(int i = 0 ; i < numArray.length - 1 ; i++) {
			for(int i2 = i + 1 ; i2 < numArray.length ; i2++) {
				if(numArray[i] > numArray[i2]) {
					int temp = numArray[i];
					numArray[i] = numArray[i2];
					numArray[i2] = temp;
				}
			}
		}
		
		bw.write(String.valueOf((num_1 + num_2 + num_3 + num_4 + num_5) / 5) + "\n");
		bw.write(String.valueOf(numArray[2]));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
