import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Number_11478 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		HashSet<String> result = new HashSet<>();
		
		int beginIndex = 0;
		int subStringLength = 1;
		while(subStringLength < str.length() + 1) {
			result.add(str.substring(beginIndex, beginIndex + subStringLength));
			beginIndex++;
			
			if(beginIndex + subStringLength > str.length()) {
				beginIndex = 0;
				subStringLength++;
			}
		}
		
		bw.write(String.valueOf(result.size()));
		br.close();
		bw.flush();
		bw.close();
	}
}
