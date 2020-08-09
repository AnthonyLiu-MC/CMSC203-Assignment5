import java.io.*;
import java.util.Scanner;

public final class TwoDimRaggedArrayUtility {
	
	
	public static double[][] readFile(File file) {
		try {
			Scanner scan = new Scanner(file);
			double [][] output = new double[file.length()][2];
			while(scan.hasNext()) {
				String[] temp = scan.nextLine().split(" ");
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static double getTotal(double[][] data) {
		double total = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
			}
		}
		
		return total; 
	}
	
	public static double getAverage(double[][] data) {
		double total = 0; 
		int size = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
				size++;
			}
		}
		
		double average = total/size;
		
		return average;
		
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		
		for(int i = 0; i<data[row].length; i++) {
			total += data[row][i];
		}
		
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		
		for(int i =0; i <data.length; i++) {
			total += data[i][col];
		}
		
		return total;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];
		
		for(int i = 1; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
			}
		}
		
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highest = data[row][0];
		int index = 0;
		
		for(int i = 1; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		
		for(int i = 1; i < data[row].length; i++) {
			if (data[row][i] < lowest) {
				lowest = data[row][i];
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = data[row][0];
		int index = 0;
		
		for(int i = 1; i < data[row].length - 1; i++) {
			if (data[row][i] < lowest) {
				lowest = data[row][i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static double getHighestInColumn(double[][] data, int col) { 
		double highest = data[0][col];
			
		for(int i = 1; i < data.length; i++) {
			if (data[i][col] > highest) {
				highest = data[i][col];
			}
		}
		
		return highest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) { 
		double highest = data[0][col];
		int index = 0;	
		
		for(int i = 1; i < data.length; i++) {
			if (data[i][col] > highest) {
				highest = data[i][col];
				index = i;
			}
		}
		
		return index;
	}
	public static double getLowestInColumn(double[][] data, int col) { 
		double lowest = data[0][col];
			
		for(int i = 1; i < data.length; i++) {
			if (data[i][col] < lowest) {
				lowest = data[i][col];
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) { 
		double lowest = data[0][col];
		int index = 0;	
		
		for(int i = 1; i < data.length; i++) {
			if (data[i][col] < lowest) {
				lowest = data[i][col];
				index = i;
			}
		}
		
		return index;
	}
	
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		
		for(int i = 0; i < data.length; i++) {
			for(int k = 0; k < data[i].length; k++) {
				if(data[i][k] > highest) {
					highest = data[i][k];
				}
			}
		}
		
		return highest;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		
		for(int i = 0; i < data.length; i++) {
			for(int k = 0; k < data[i].length; k++) {
				if(data[i][k] < lowest) {
					lowest = data[i][k];
				}
			}
		}
		
		return lowest;
	}
	
	
}


















