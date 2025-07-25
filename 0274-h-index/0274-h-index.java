class Solution {
    public int hIndex(int[] citations) {
        //답이 될 수 있는 최댓값은 (citations의 길이vs 값의 제일 큰값 중 작은값) 
        Arrays.sort(citations);
        int check = citations.length;
        // 0, 1, 3, 5 ,6 
        for(int i =0; i < check;i++){
            if(citations[i] >= check -i){
                return check -i;
            }
        }

        return 0;
    }
}