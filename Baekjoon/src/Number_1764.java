import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class Number_1764 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		TreeSet<String> list = new TreeSet<>();
		
		for(int i = 0 ; i < N ; i++) {
			list.add(br.readLine());
		}
		
		TreeSet<String> result = new TreeSet<>();
		for(int i = 0 ; i < M ; i++) {
			String name = br.readLine();
			if(list.contains(name)) result.add(name);
		}
		
		bw.write(String.valueOf(result.size()) + "\n");
		result.forEach(name -> {
			try {
				bw.write(name + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		br.close();
		bw.flush();
		bw.close();
	}
}
