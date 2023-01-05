/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode;

import java.util.Arrays;

/**
 *
 * @author _ muhammadsobananjum
 */
public class MinimumNumberOfArrowsToBurstBalloons {
       public int findMinArrowShots(int[][] points) {
        // Sort the balloons by the end position of the arrow
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        
        // Initialize the number of arrows needed to 1
        int result = 1;
        // Set the index of the previously burst balloon to 0
        int previous = 0;
        
        // Iterate through all balloons
        for(int current = 1; current < points.length; current++){
            // If the start position of the current balloon is after the end position of the arrow that burst the previous balloon,
            // then a new arrow is needed to burst the current balloon
            if(points[current][0] > points[previous][1]){
                result++;
                // Update the index of the previously burst balloon
                previous = current;
            }
        }
        return result;            
    }
    
}
