class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        LinkedList <int[]> list = new LinkedList<>();

        int first = 0 ;
        int second = 0;

        while( first < firstList.length && second < secondList.length){

            int start = Math.max( firstList[first][0], secondList[second][0]);
            int end = Math.min(firstList[first][1], secondList[second][1]);

            if( start <= end){
                list.add(new int[]{start,end});
            }

            if( firstList[first][1] < secondList[second][1]){
                first++;
            }else{
                second++;
            }

        }

        return list.toArray(new int[list.size()][]);
    }
}