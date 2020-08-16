/***********************************************************************
 Class: CMSC203 CRN 46667
 Program: Assignment # 5
 Instructor: Dr.Grinberg
 Description: JUnit tests for TwoDimRaggedArrayUtility class methods
 Due: 08/16/2020
 I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Anthony Liu
************************************************************************/


import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	// STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3 }, { 3, 2, 4, 5 }, { 1, 2 } };
	private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
	private double[][] dataSet2 = { { 7, 2, 9, 4 }, { 5 }, { 8, 1, 3 }, { 11, 6, 7, 2 } }; 
	private double[][] dataSet3 = { { 7.2, 2.5, 9.3, 4.8 }, { 5.9 }, { 8.1, 1.7, 3.3 }, { 11.6, 6.9, 7.3, 2.7 } };
	private double[][] dataSet4 = { { -2.5, -5.3, 6.1 }, { -4.4, 8.2 }, { 2.3, -7.5 }, { -4.2, 7.3, -5.9, 2.6 } };

	private File outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = dataSet1 = dataSet2 = dataSet3 = dataSet4 = null;
		outputFile = null;
	}

	/**
	 * Student Test getTotal method Return the total of all the elements in the two
	 * dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(44.0, TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT), .001);
		assertEquals(36.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), .001);
		assertEquals(65.0, TwoDimRaggedArrayUtility.getTotal(dataSet2), .001);
		assertEquals(71.3, TwoDimRaggedArrayUtility.getTotal(dataSet3), .001);
		assertEquals(-3.3, TwoDimRaggedArrayUtility.getTotal(dataSet4), .001);
		
	}

	/**
	 * Student Test getAverage method Return the average of all the elements in the
	 * two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(2.933, TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT), .001);
		assertEquals(4.5, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
		assertEquals(5.417, TwoDimRaggedArrayUtility.getAverage(dataSet2), .001);
		assertEquals(5.942, TwoDimRaggedArrayUtility.getAverage(dataSet3), .001);
		assertEquals(-0.3, TwoDimRaggedArrayUtility.getAverage(dataSet4), .001);
	}

	/**
	 * Student Test getRowTotal method Return the total of all the elements of the
	 * row. Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(21.0, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 0), .001);
		assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 1), .001);
		assertEquals(14.0, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 2), .001);
		assertEquals(3.0, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 3), .001);
		
		assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0), .001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), .001);
		assertEquals(21.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 2), .001);
		
		assertEquals(22.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 0), .001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 1), .001);
		assertEquals(12.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 2), .001);
		assertEquals(26.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 3), .001);
		
		assertEquals(23.8, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 0), .001);
		assertEquals(5.9, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 1), .001);
		assertEquals(13.1, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 2), .001);
		assertEquals(28.5, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 3), .001);
		
		assertEquals(-1.7, TwoDimRaggedArrayUtility.getRowTotal(dataSet4, 0), .001);
		assertEquals(3.8, TwoDimRaggedArrayUtility.getRowTotal(dataSet4, 1), .001);
		assertEquals(-5.2, TwoDimRaggedArrayUtility.getRowTotal(dataSet4, 2), .001);
		assertEquals(-0.2, TwoDimRaggedArrayUtility.getRowTotal(dataSet4, 3), .001);
	}

	/**
	 * Student Test getColumnTotal method Return the total of all the elements in
	 * the column. If a row in the two dimensional array doesn't have this column
	 * index, it is not an error, it doesn't participate in this method. Column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 0), .001);
		assertEquals(8.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 1), .001);
		assertEquals(10.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 2), .001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 3), .001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 4), .001);
		assertEquals(6.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 5), .001);
		
		assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), .001);
		assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1), .001);
		assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), .001);
		
		assertEquals(31.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 0), .001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 1), .001);
		assertEquals(19.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 2), .001);
		assertEquals(6.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 3), .001);
		
		assertEquals(32.8, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 0), .001);
		assertEquals(11.1, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 1), .001);
		assertEquals(19.9, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 2), .001);
		assertEquals(7.5, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 3), .001);
		
		assertEquals(-8.8, TwoDimRaggedArrayUtility.getColumnTotal(dataSet4, 0), .001);
		assertEquals(2.7, TwoDimRaggedArrayUtility.getColumnTotal(dataSet4, 1), .001);
		assertEquals(0.2, TwoDimRaggedArrayUtility.getColumnTotal(dataSet4, 2), .001);
		assertEquals(2.6, TwoDimRaggedArrayUtility.getColumnTotal(dataSet4, 3), .001);
		
	}

	/**
	 * Student Test getHighestInArray method Return the largest of all the elements
	 * in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT), .001);
		assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
		assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet2), .001);
		assertEquals(11.6, TwoDimRaggedArrayUtility.getHighestInArray(dataSet3), .001);
		assertEquals(8.2, TwoDimRaggedArrayUtility.getHighestInArray(dataSet4), .001);
	}

	/**
	 * Test the writeToFile method write the array to the outputFile File then read
	 * it back to make sure formatted correctly to read
	 * 
	 * @throws FileNotFoundException
	 * 
	 */
	@Test
	public void testWriteToFile() throws FileNotFoundException {
		double[][] array = null;
		try {
			TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);

		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

		array = TwoDimRaggedArrayUtility.readFile(outputFile);

		assertEquals(1.0, array[0][0], .001);
		assertEquals(2.0, array[0][1], .001);
		assertEquals(3.0, array[0][2], .001);
		assertEquals(4.0, array[0][3], .001);
		assertEquals(5.0, array[0][4], .001);
		assertEquals(6.0, array[0][5], .001);
		assertEquals(1.0, array[1][0], .001);
		assertEquals(2.0, array[1][1], .001);
		assertEquals(3.0, array[1][2], .001);
		assertEquals(3.0, array[2][0], .001);
		assertEquals(2.0, array[2][1], .001);
		assertEquals(4.0, array[2][2], .001);
		assertEquals(5.0, array[2][3], .001);
		assertEquals(1.0, array[3][0], .001);
		assertEquals(2.0, array[3][1], .001);
		

	}

}