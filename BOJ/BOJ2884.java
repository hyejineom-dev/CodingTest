//BaekJoon2884
//�ۼ��� : yazbyz

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2884 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int H, M;
		String h, m;
		
		String HAndM = br.readLine();
		 
		String array[] = HAndM.split(" ");
		
	    H = Integer.parseInt(array[0]);
	    M = Integer.parseInt(array[1]);

		if(M < 45) {
			H -= 1;
			M += 60;
			
			if(H < 0) {
				H = 23;
			}	
		}
		M -= 45;
		
		h = Integer.toString(H);
		m = Integer.toString(M);
		
		
		System.out.println(h + " " + m);
		
		
	}
}
