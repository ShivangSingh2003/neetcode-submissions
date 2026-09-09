class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            TreeMap<Integer, String> tMap = map.get(key);
            tMap.put(timestamp, value);
        }
        else{
            TreeMap<Integer, String> tMap = new TreeMap<>();
            tMap.put(timestamp, value);
            map.put(key, tMap);
        }
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tMap = map.get(key);
        if(tMap == null)
            return "";
        Integer k = tMap.floorKey(timestamp);
        if(k != null)
            return tMap.get(k);
        else 
            return "";
    }
}
