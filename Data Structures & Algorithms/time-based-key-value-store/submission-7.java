class TimeMap {

    class Pair
    {
        int timestamp;
        String value;

        Pair(String value, int timestamp)
        {
            this.value=value;
            this.timestamp=timestamp;
        }
    }

    Map<String,List<Pair>> map =  new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        List<Pair> list;
        if(map.get(key)==null)
        {
            list = new ArrayList<>();
 
        }
        else
        {
            list =  map.get(key);
        }

        list.add(new Pair(value, timestamp));
        map.put(key,list);
        
    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)==null) return "";
        List<Pair> list = map.get(key);
        int start = 0;
        int end = list.size()-1;

        String ret = "";
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(list.get(mid).timestamp==timestamp) 
            {
                return list.get(mid).value;
            }
            else if(list.get(mid).timestamp>timestamp) 
            {
                end = mid-1;
            }
            else
            {
                ret = list.get(mid).value;
                start = mid+1;
            }
        }
        return ret;
        
    }
}
