class RecentCounter {
    private static final int[] records = new int[10000]; 
    private int start;
    private int end;

    public RecentCounter() {        
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        while (start < end && (t - records[start] > 3000)) { 
            start++; 
        }
        records[end++] = t;
        return end - start;
    }
}