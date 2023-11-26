import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_9063 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int max_x = -10001;
		int min_x = 10001;
		int max_y = -10001;
		int min_y = 10001;
		
		for(int i = 0 ; i < N ; i++) {
			String[] xy = br.readLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			
			max_x = Math.max(max_x, x);
			max_y = Math.max(max_y, y);
			min_x = Math.min(min_x, x);
			min_y = Math.min(min_y, y);
		}
		
		bw.write(String.valueOf((max_x - min_x) * (max_y - min_y)));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
