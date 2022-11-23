package Array;

import java.util.*;
import java.util.HashSet;
// TC o(n2) 13ms
public class Intersection {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> res=new HashSet();
//         // int n=Math.abs(nums1.length-nums2.length);
//       for(int i=0;i<nums1.length;i++){
//           for(int j=0;j<nums2.length;j++){
//           if(nums1[i]==nums2[j])
//               res.add(nums1[i]);
//              //break;
//           }       
//       }
//         int i=0;
//         int[] arr=new int[res.size()];
//         for(int ele:res){
//             arr[i++]=ele;
//         }
//         return arr;
//     }
// }
/// another approach  o(nlogn)
// class Solution {

    public static int[] intersection(int[] nums1, int[] nums2) {
        // Sort the arrays nums1 and nums2
        java.util.Arrays.sort(nums1);
        java.util.Arrays.sort(nums2);
        
         // creating a max variable
        // for storing the maximum
        // value present in the all
        // the three array
        // this will be the size of
        // array for calculating the
        // frequency of each element
        // present in all the array
        int max = Integer.MIN_VALUE;
        
        // Deleting duplicate elements in nums1 array 
        int res1 = 1;
        for (int i = 1; i < nums1.length; i++){
            max = Math.max(max, nums1[i]);
            if(nums1[i] != nums1[res1 - 1]){
                nums1[res1] = nums1[i];
                res1++;
            }
        }
        
        // Deleting duplicate elements in nums2 array 
        int res2 = 1;
        for (int i = 1; i < nums2.length; i++){
            max = Math.max(max, nums2[i]);
            if (nums2[i] != nums2[res2 - 1]){
                nums2[res2] = nums2[i];
                res2++;
            }   
        }
        
        if (max < 0){
            max = 1;
        }
        
        // Creating an array for finding frequency 
        int[] freq = new int[max + 1];
        
        // Calculating the frequency of all the elements present in an array 
        for (int i = 0; i < res1; i++){
            freq[nums1[i]]++;
        }
        for (int i = 0; i < res2; i++){
            freq[nums2[i]]++;
        }
        
        // iterating till max and
        // whenever the frequency of element
        // will be two we return 
        int count = 0;
        for (int i = 0; i <= max; i++){
            if (freq[i] == 2){
                count++;
            }
        }
        
        int[] temp = new int[count];
        int k = 0;
        for (int i = 0; i <= max; i++){
            if (freq[i] == 2){
                temp[k] = i;
                k++;
            }
        }
        
        // Return the temp array (interesected array)
        return temp;
    }
    
    public static void main(String[] args){
        int[] nums1={5,9,4};
        int[] nums2={9,4,9,8,4};

        System.out.println(intersection(nums1,nums2));

    }
}
