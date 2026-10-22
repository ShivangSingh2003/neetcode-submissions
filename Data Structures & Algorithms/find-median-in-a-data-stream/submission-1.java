class MedianFinder {
    List<Integer> stream;
    int size;
    public MedianFinder() {
        stream = new ArrayList<>();
    }
    
    public void addNum(int num) {
        if(stream.size() > 0 && num > stream.get(stream.size()-1))
            stream.add(num);
        else{
            stream.add(num);
            Collections.sort(stream);
        }
    }
    
    public double findMedian() {
        double median = 0;
        int size = stream.size();
        if(size%2 != 0){
            return stream.get(size/2);
        }
        else{
            int a = stream.get((size/2) - 1);
            int b = stream.get(size/2);
            return (double)(a+b)/2;
        }
    }
}
