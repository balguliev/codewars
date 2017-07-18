// https://www.codewars.com/kata/5544c7a5cb454edb3c000047
// A child plays with a ball on the nth floor of a big building. The height of this floor is known: (float parameter "h" in meters, h > 0) . He lets out the ball. The ball rebounds for example to two-thirds: (float parameter "bounce", 0 < bounce < 1) of its height. His mother looks out of a window that is 1.5 meters from the ground: (float parameters window < h). How many times will the mother see the ball either falling or bouncing in front of the window (return a positive integer unless conditions are not fulfilled in which case return -1) ?

public class BouncingBall {
	public static int bouncingBall(double drop, double bounce, double window) {
      int bounces = -1, cycles = 0;
      if (drop > 0 && bounce > 0 && bounce < 1 && window < drop) // conditions set in if to make while easier to read
        while (drop * Math.pow(bounce, cycles) > window) { // while determines when the ball stops reaching above the window
          bounces += 2; // a cycle is two full bounces (up and down), this will always be an odd number
          cycles++;  // for the math expression in the while loop being modeled as exp. decay
        }
      return bounces;
	}
}
