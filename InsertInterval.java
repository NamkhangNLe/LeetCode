class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for (int[] curr : intervals) {
            if (newInterval == null || curr[1] < newInterval[0]) {
                list.add(curr);
            } else if (curr[0] > newInterval[1]) {
                list.add(newInterval);
                list.add(curr);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(newInterval[0], curr[0]);
                newInterval[1] = Math.max(newInterval[1], curr[1]);
            }
        }
        if (newInterval != null) {
            list.add(newInterval);
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
