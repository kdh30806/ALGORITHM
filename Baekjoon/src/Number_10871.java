import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NX = br.readLine().split(" ");
		int N = Integer.parseInt(NX[0]);
		int X = Integer.parseInt(NX[1]);
		String[] array = br.readLine().split(" ");
		
		for(int i = 0 ; i < array.length ; i++) {
			int temp = Integer.parseInt(array[i]);
			if(X > temp) {
				bw.write(String.valueOf(temp) + " ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
