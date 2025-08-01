package map_1;

import java.util.Map;

/*
Modify and return the given map as follows: if
exactly one of the keys "a" or "b" has a value in
the map (but not both), set the other to have
that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */

public class mapAB3 {
    public static void main(String[] args) {

    }

    public static Map<String, String> mapAB3(Map<String, String> map) {    boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");

        if (hasA && hasB) {
            return map;
        }
        if (hasA) {
            map.put("b", map.get("a"));
        } else if (hasB) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}
