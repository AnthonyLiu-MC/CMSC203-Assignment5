
import java.io.*;
import java.util.Arrays;

public class TestClass {
	
	public static void main(String[] args) throws FileNotFoundException {
		File outputFile = new File("TestOut.txt");
		File a = new File("district5.txt");
		double[][] test2 = {{1,2,3},{1,2,3}{1,2,3,4,5,6}};
		TwoDimRaggedArrayUtility.writeToFile(test2, outputFile);
		double[][] test = TwoDimRaggedArrayUtility.readFile(a);
		
		for (int i =0 ; i< test.length; i ++) {
			for (int k = 0; k < test[i].length; k++) {
				System.out.print(test[i][k] + " ");
			}
			System.out.println();
		}
		
	
	}

}