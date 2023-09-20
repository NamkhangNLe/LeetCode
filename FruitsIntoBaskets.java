class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int trees = 0;
        int l = 0;
        for (int r = 0; r < fruits.length; r++) {
            map.put(fruits[r], map.getOrDefault(fruits[r] , 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                map.remove(fruits[l], 0);
                l++;
            }
            trees = Math.max(trees, r - l + 1);
        }
        return trees;
    }
}
