/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author _ muhammadsobananjum
 */
public class MaxPointsOnALine {
   
    public int maxPoints(int[][] points) {
        int solution = 0; // max points on the line in general

        for (int i = 0; i < points.length; i++){
            Map<String, Integer> map = new HashMap<>();
            int max = 0; // max points on the line including point i
            int dup = 0; // count how many points are the same as point i
            for (int j = i+1; j < points.length; j++){
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dy == 0 && dx == 0){
                  dup++;
                  continue;
                }

                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;

                map.put("" + dx + "" + dy,
                        map.getOrDefault("" + dx + "" + dy, 0) + 1);
                max = Math.max(max, map.get("" + dx + "" + dy));
            }
            solution = Math.max(solution, max + dup + 1);
        }

        return solution;
    }

    // Euclidean Algorithm
    // This approach is based on the principle that the GCD of
    // two numbers A and B will be the same even if we replace
    // the larger number with the difference between A and B.
    
    // In this approach, we perform GCD operation on A and B
    // repeatedly by replacing A with B and B with the
    // difference(A, B) as long as the difference is greater than 0.
  private int gcd(int n, int m){
    if (m == 0){
      return n;
    }
    return gcd(m, n%m);
}
    
}
