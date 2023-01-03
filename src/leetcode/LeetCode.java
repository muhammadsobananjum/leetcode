/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode;

/**
 *
 * @author _ muhammadsobananjum
 */
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleThreadedCpu obj = new SingleThreadedCpu();
        
        int[][] aa = {{7,10},{7,12},{7,5},{7,4},{7,2}};
        int[] resArray = obj.getOrder(aa);
        for ( int i = 0; i< resArray.length ;i ++){
            System.out.println("ele >> "+ resArray[i]);
    }
    }
    
}
