public class Solution{
    public String destCity(List<List<String>> paths) {
        Set<String> departures=new HashSet<>();
        for(List<String> path:paths){
            departures.add(path.get(0));
        }
        for(List<String> path:paths){
            if(!departures.contains(path.get(1)))
            return path.get(1);
        }
    return "";
    }
}
