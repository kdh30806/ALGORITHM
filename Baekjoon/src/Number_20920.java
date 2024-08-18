import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Number_20920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			if(str.length() >= M) {
				map.put(str, map.getOrDefault(str, 0) + 1);
			}
		}
		
		List<String> book = new ArrayList<>(map.keySet());
		
		Collections.sort(book, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
	            if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
			}
		});
		
		StringBuilder sb = new StringBuilder();
        for (String str : book) {
            sb.append(str + "\n");
        }
       
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
