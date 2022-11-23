package Heap;
// kth largest element using priority queue leetcode
public class kthlargest {
    class Solution {
        public:
            int findKthLargest(vector<int>& nums, int k) {
                //we will use the min heap
                // as we see the word
                //largest most greatest then the min heap will used 
                priority_queue<int,vector<int>,greater<int>>p;
                for(int i=0;i<nums.size();i++)
                {
                    p.push(nums[i]);
                    if(p.size()>k)
                    {
                        p.pop();
                    }
                }
                return p.top();
            }
        };
}
