class Solution {

    class Pair implements Comparable
    {
        int num;
        int freq;

        Pair(int num, int freq)
        {
            this.num=num;
            this.freq=freq;
        }

        @Override
        public int compareTo(Object o) {
            return ((Pair)o).freq-freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] ret =  new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair> priorityQueue= new PriorityQueue<>();

        for(int i:map.keySet()){
            priorityQueue.add(new Pair(i,map.get(i)));
        }

        for(int i=0;i<k;i++){
            ret[i]=priorityQueue.poll().num;
        }
        return ret;
    }
}
