import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		for(int i = 0 ; i < str.length - 1; i++) {
			int now = Integer.parseInt(str[i]);
			int next = Integer.parseInt(str[i+1]);
			
			if(!(((next - now) == 1) || ((next - now) == -1))) {
				bw.write("mixed");
				break;
			}
			
			if(i == str.length - 2) {
				if((next - now) == 1) {
					bw.write("ascending");
				}else {
					bw.write("descending");
				}
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
