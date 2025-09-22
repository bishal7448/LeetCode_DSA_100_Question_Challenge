class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int st : stones) {
            pq.add(st);
        }

        while(pq.size() > 1) {
            int maxSt = pq.remove();
            int prevMaxSt = pq.remove();

            int newSt = maxSt - prevMaxSt;

            if(newSt > 0) {
                pq.add(newSt);
            }
        }

        if(pq.size() == 0) {
            return 0;
        }else {
            return pq.remove();
        }
    }
}