import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static final Map<Character, Integer> map1 = new HashMap<>();
    private static final Map<Character, Integer> map2 = new HashMap<>();

    public static void putStringInMap(String string, Map<Character, Integer> map) {
        string = string.toLowerCase();
        for (Character character :
                string.toCharArray()) {
            if (map.containsKey(character)) {
                int value = map.get(character);
                map.put(character, value + 1);
            } else {
                map.put(character, 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        putStringInMap(scanner.nextLine(), map1);
        putStringInMap(scanner.nextLine(), map2);
        int result = 0;

        for (var entry :
                map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                result += Math.abs(entry.getValue() - map2.get(entry.getKey()));
            } else {
                result += entry.getValue();
            }
        }

        for (var entry :
                map2.entrySet()) {
            if (!map1.containsKey(entry.getKey())) {
                result += entry.getValue();
            }
        }

        System.out.print(result);
    }
}