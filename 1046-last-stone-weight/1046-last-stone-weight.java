class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones) {
            pq.add(ele);
        }

        while(pq.size() > 1) {
            int heavStone = pq.remove();
            int prevHeavStone = pq.remove();

            int temp = 0;

            if(heavStone > prevHeavStone) {
                temp = heavStone - prevHeavStone;
                pq.add(temp);
            }
        }

        if(pq.size() == 0) {
            return 0;
        }else {
            return pq.remove();
        }
    }
}