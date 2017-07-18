// https://www.codewars.com/kata/585d7d5adb20cf33cb000235

public class FindUniqueNumber {
//flow control only using logic
 public static double findUniq (double[] nums) {
  double num = 0;
  boolean found = false;
  for (int i = 0; i < nums.length && !found; i++) {
   boolean unique = true;
   for (int j = 0; j < nums.length && unique; j++) {
    if (nums[i] == nums[j] && i != j)
     unique = false;
    if (j == nums.length - 1 && unique) {
     found = true;
     num = nums[i];
    }
   }
  }
  return num;
 }
}
