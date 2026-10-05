class KthLargest {
    int k;
    ArrayList<Integer> list;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for(int num : nums)
            list.add(num);
        Collections.sort(list);
    }
    
    public int add(int val) {
        int size = list.size();
        list.add(val);
        size++;
        if(size == 1)
            return list.get(size-1);
        if(list.get(size-1) < list.get(size-2))
            Collections.sort(list);
        return list.get(size-k);
    }
}
