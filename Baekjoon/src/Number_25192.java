import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Number_25192 {

	static Integer[] fibonacci0 = new Integer[41];
	static Integer[] fibonacci1 = new Integer[41];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> list = new HashSet<>();
		int count = 0;
		
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			
			if(str.equals("ENTER")) {
				list = new HashSet<>();
			}else {
				if(!list.contains(str)) {
					count++;
					list.add(str);
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
