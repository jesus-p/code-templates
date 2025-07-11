public int fn(int[] arr, int k){
    Map<Integer, Integer> counts = new HashMap<>();
    counts.put(0,1);
    int ans = 0, curr = 0;

    for(int num: arr){
        // logic to change curr
        ans += counts.getOrDefault(curr - k, 0);
        counts.put(curr, counts.getOrDefault(curr,0)+1);
    }
    return ans;
}
