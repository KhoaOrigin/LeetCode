/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg1;

/**
 *
 * @author Admin
 */
public class Solution {
    public Solution() {
        
    }
    
   private int findEvenNumber(int[] nums) {
     int count = 0;
     for(int num : nums) {
         int digits = (int) Math.log10(Math.abs(num)) +1;
         if(digits % 2 == 0) {
             count++;
         }
     }
      return count;
}
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {123,1111,2222,421};
        System.out.println(solution.findEvenNumber(nums1));
        
                int[] nums2 = {123,1111,2222,4212};
        System.out.println(solution.findEvenNumber(nums2));
        
        // TODO code application logic here
    }
    
}
