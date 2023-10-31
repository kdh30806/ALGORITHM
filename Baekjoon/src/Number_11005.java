import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Number_11005 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NB = br.readLine().split(" ");
		int N = Integer.parseInt(NB[0]);
		int B = Integer.parseInt(NB[1]);
		
		List<Character> array = new ArrayList<>();
		while(N > 0) {
			if(N % B < 10) {
				array.add((char)(N % B + '0'));
			}else {
				array.add((char)(N % B - 10 + 'A'));
			}
			
			N /= B;
		}
		
		for (int i = array.size() - 1; i >= 0; i--) {
            bw.write(array.get(i));
        }
		
		br.close();
		bw.flush();
		bw.close();
	}

}
