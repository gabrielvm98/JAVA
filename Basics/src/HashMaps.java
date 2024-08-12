import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 1);
        map.put("C", 7);
        System.out.println(map);
        System.out.println(map.get("B"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue(6));

        map.replace("A", 9);
        map.remove("B");
        map.putIfAbsent("C", 10);
        map.putIfAbsent("D", 11);
        System.out.println(map);

        System.out.println(map.get("E"));
        System.out.println(map.getOrDefault("E", 0));

        map.clear();
        System.out.println(map);

        map.put("A", 5);
        map.put("B", 1);
        map.put("C", 7);
        map.forEach( (key, value) -> {
            System.out.println(key + " - " + value);
            map.replace(key, value*2);
        });
        System.out.println(map);
    }
}