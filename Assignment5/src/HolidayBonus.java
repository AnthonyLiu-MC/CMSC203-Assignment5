/***********************************************************************
 Class: CMSC203 CRN 46667
 Program: Assignment # 5
 Instructor: Dr.Grinberg
 Description: A class that calculates the bonus for each 
 store and the total for all stores
 Due: 08/16/2020
 I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Anthony Liu
************************************************************************/

/**
 * A class that calculates the holiday bonus for each store and the total of all
 * holiday bonuses given
 * 
 * @author Anthony Liu
 *
 */
public class HolidayBonus {
	/**
	 * Calculates the holiday bonus for each store
	 * 
	 * @param data  The two dimensional array of store sales
	 * @param high  Bonus for the highest store in the category
	 * @param low   Bonus for the lowest store in a category
	 * @param other Bonus for all other stores in a category
	 * @return An array of the bonus for each store
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {

		double bonus[] = new double[data.length];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);

				if (data[row][col] > 0) {
					if (data[row][col] == highest) {
						bonus[row] += high;
					} else if (data[row][col] == lowest) {
						bonus[row] += low;
					} else {
						bonus[row] += other;
					}

				}
			}
		}

		return bonus;
	}

	/**
	 * Calculates the total holiday bonuses
	 * 
	 * @param data  The two dimensional array of store sales
	 * @param high  Bonus for the highest store in a category
	 * @param low   Bonus for the lowest store in a category
	 * @param other Bonus for all other stores in a category
	 * @return The total for all holiday bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {

		double[] bonus = calculateHolidayBonus(data, high, low, other);

		double sum = 0;

		for (int i = 0; i < bonus.length; i++) {
			sum += bonus[i];
		}

		return sum;
	}

}
