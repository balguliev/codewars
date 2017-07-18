// https://www.codewars.com/kata/5813d19765d81c592200001a
// In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!

public class DontGiveFive {
  public static int dontGiveMeFive(int start, int end) {
    int count = end - start + 1; // start count with all numbers
    for (int i = start; i <= end; i++)
      if ((i + "").contains("5")) // use Strings to find if they contain the '5' char
        count--;
    return count;
  }
}
