package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		readArrayList();
	}
	
	public static void readArrayList() throws IOException {
		int	nList = Integer.parseInt(br.readLine());
		
		String stListAux = "";
		String[] stList = null;
		double[] dbList = null;
		
		for(int i = 0; i<nList; i++) {
			stListAux = br.readLine();
			stList = stListAux.split(" ");
			dbList = new double [stList.length];
			
			for(int j = 0; j<stList.length; j++) {
				dbList[j] = Double.parseDouble(stList[j]);
			}
			String txt = bubbleSort(dbList);
			if(i==0)
				System.out.println("");
			System.out.println(txt);
		}
		br.close();
	}
	public static String bubbleSort(double[] db) {
		int ctrl = 0;
		int iter = 0;
	    for(int i = 1; i<db.length; i++) {
	    	for(int j = 0; j<db.length-i; j++) {
	            if (db[j] > db[j+1]) {
		            double temp = db[j];
		            db[j] = db[j+1];
		            db[j+1] = temp;
		            ctrl++;
	            }
	    	}
		   	iter++;
	    }
	    double average = ctrl*1.0/iter;
	    String averageSt = String.format("%.2f", average);
	    String space = averageSt+"-"; //later space will be only " ". Just a space
	    String toPrint = "";
        for (int i = 0; i<db.length; ++i) {
            toPrint = toPrint + space + db[i];
            space = " ";
        }
	    return toPrint;
	}
	
}




