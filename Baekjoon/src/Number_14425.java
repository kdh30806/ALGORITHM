import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Number_14425 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		HashMap<String, String> S = new HashMap<>();
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			S.put(str, str);
		}
		
		int count = 0;
		for(int i = 0 ; i < M ; i++) {
			if(S.containsKey(br.readLine())) count++;	
		}
		
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
