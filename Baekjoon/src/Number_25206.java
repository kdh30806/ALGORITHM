import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Number_25206 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, Double> gradeInfo = new HashMap<>();
		gradeInfo.put("A+", 4.5);
		gradeInfo.put("A0", 4.0);
		gradeInfo.put("B+", 3.5);
		gradeInfo.put("B0", 3.0);
		gradeInfo.put("C+", 2.5);
		gradeInfo.put("C0", 2.0);
		gradeInfo.put("D+", 1.5);
		gradeInfo.put("D0", 1.0);
		gradeInfo.put("F", 0.0);
		
		double totalCredit = 0.0;
		double totalCreditGrade = 0.0;
		
		for(int i = 0 ; i < 20 ; i++) {
			String[] array = br.readLine().split(" ");
			if(array[2].equals("P")) continue;
			
			double credit = Double.parseDouble(array[1]);
			double grade = gradeInfo.get(array[2]);
				
			totalCredit += credit;
			totalCreditGrade += credit * grade;
		}
		
		bw.write(String.valueOf(totalCreditGrade/totalCredit));

		br.close();
		bw.flush();
		bw.close();
	}

}
