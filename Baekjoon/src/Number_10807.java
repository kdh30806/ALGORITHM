import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10807 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] intArray = br.readLine().split(" ");
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0 ; i < intArray.length ; i++) {
			int temp = Integer.parseInt(intArray[i]);
			if(temp == v) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
