class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        
         int nums[][]=new int[n][2];
         for(int i=0;i<n;i++){
             nums[i][0]=efficiency[i];
             nums[i][1]=speed[i];
         }
        Arrays.sort(nums,(a,b)->b[0]-a[0]);
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        long ans=0,sum=0;
        for(int i[]:nums){
            
            sum+=i[1];
            minHeap.add(i[1]);
            if(minHeap.size()>k)
                sum-=minHeap.poll();
            ans=Math.max(ans,i[0]*sum);
        }
        ans=ans%((1000000007));
        return (int)ans;
        
      
    }
}

/* other function
 minHeap.peek() for top element
 minHeap.offer() another way to add element in pq
 */
