class Pair{
    
    int first;
    int second;
    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
           
        
            int n=arr.length;
            PriorityQueue<Pair>maxHeap=new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a,Pair b){
                    if((b.first-a.first)==0) return (b.second-a.second);
                    return (b.first-a.first);
                }
            });
            List<Integer>res=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                
                maxHeap.add(new Pair(Math.abs(arr[i]-x),arr[i]));
                if(maxHeap.size()>k) maxHeap.poll();
            }
            while(!maxHeap.isEmpty()){
                res.add(maxHeap.poll().second);
            }
            Collections.sort(res);
           return res;
            
            
    }
}
