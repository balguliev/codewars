// https://www.codewars.com/kata/555eded1ad94b00403000071
// Your task is to write a function which returns the sum of following series up to nth term (parameter).
// Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 + ...

import java.text.DecimalFormat;
public class NthSeries {	
	public static String seriesSum(int n) {
		DecimalFormat format = new DecimalFormat("0.00");
    double sum = 0;
    for (int i = 0; i < n; i++) sum += 1.0 / (3 * i + 1);
    return format.format(sum);
	}
}
