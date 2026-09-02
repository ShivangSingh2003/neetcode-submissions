class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> lst = new ArrayList<>();

        for(int i = 0; i < speed.length; i++){
            int[] l = new int[2];
            l[0] = position[i];
            l[1] = speed[i];
            lst.add(l);
        }

        lst.sort((a,b) -> a[0] - b[0]);

        double lastFleetTime = 0;
        int fleets = 0;
        for(int i = lst.size()-1; i>=0; i--){
            int[] arr = lst.get(i);
            int pos = arr[0];
            int s = arr[1];

            double time = (double)(target-pos)/s;
            // System.out.print(time + " ");
            if(time>lastFleetTime){
                fleets++;
                lastFleetTime = time;
            }
        }

        return fleets;
    }
}
