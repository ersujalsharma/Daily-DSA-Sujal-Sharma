/*

We are given n intervals ; we have to find the first point where there is no interval such that k length distance is possible from that point 

*/
public class Hashing_34_HackerRank_OA {
    public static void main(String[] args) {
        String events[] = {"00:00;08:00","07:00;13:00",
            "12:30;13:59"
        };
        int k = 60;
        int time[] = new int[1440];
        for(String event : events){
            String split[] = event.split(";");
            String []time_from = split[0].split(":");
            int startTime = (Integer.parseInt(time_from[0])*60)+Integer.parseInt(time_from[1]);
            String []time_to = split[1].split(":");
            int endTime = (Integer.parseInt(time_to[0])*60)+Integer.parseInt(time_to[1]);
            time[startTime]++;
            time[endTime+1]--;
        }
        for(int i=1;i<time.length;i++){
            time[i] += time[i-1];
        }
        int start = 0;
        int end = 0;
        int ans = 0;
        while(end<time.length){
            int count = k;
            while(count>0 && end<time.length && time[end]==0){
                count--;
                end++;
            }
            if(count == 0){
                ans = start;
                break;
            }
            end++;
            start = end;
        }
        System.out.println("Answer is -> "+ ans/60 + " : "+ ans%60);
    }
}
