import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LegendaryFarming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shadowmourne = 250;
        int valanyr = 250;
        int dragonwrath = 250;

        int fragments = 0;
        int shards = 0;
        int motes = 0;

        int fragments1 = 0;
        int shards1 = 0;
        int motes1 = 0;
        TreeMap<String, Integer> junk = new TreeMap<>();
        String input;
        while (true) {
            input = scanner.nextLine();
            ArrayList<String> arr = new ArrayList<>();
            Pattern pattern = Pattern.compile("(\\d+\\s.*?)(\\s+?|$)");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                if(!matcher.group(1).equals("")) {
                    arr.add(matcher.group(1));
                }
            }

            for (int i = 0; i < arr.size(); i++) {
                String[] split = arr.get(i).split(" ");
                int count = Integer.parseInt(split[0]);
                String product = split[1].toLowerCase();
                if (product.equals("shards")) {
                    shadowmourne -= count;
                    shards += count;
                    if (shadowmourne <= 0) {
                        System.out.println("Shadowmourne obtained!");
                        shards1 = Math.abs(250 - shards);
                        fragments1 = fragments;
                        motes1 = motes;
                        break;
                    }
                }
                else if (product.equals("fragments")) {
                    valanyr -= count;
                    fragments += count;
                    if (valanyr <= 0) {
                        System.out.println("Valanyr obtained!");
                        shards1 = shards;
                        fragments1 = Math.abs(250 - fragments);
                        motes1 = motes;
                        break;
                    }
                }
                else if (product.equals("motes")) {
                    dragonwrath -= count;
                    motes += count;
                    if (dragonwrath <= 0) {
                        System.out.println("Dragonwrath obtained!");
                        shards1 = shards;
                        fragments1 = fragments;
                        motes1 = Math.abs(250 - motes);
                        break;
                    }
                }
                else if (junk.containsKey(product)) {
                    int newCount = count + junk.get(product);
                    junk.put(product, newCount);
                }else{
                    junk.put(product, count);
                }

            }
            if(!scanner.hasNextLine()){
                break;
            }
        }

        Map<String, Integer> result = new TreeMap<>();
        result.put("fragments", fragments1);
        result.put("shards", shards1);
        result.put("motes", motes1);

        for (Map.Entry entry : entriesSortedByValues(result)) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry key : junk.entrySet()) {
            System.out.printf("%s: %d%n", key.getKey(), key.getValue());
        }
    }

    static <K,V extends Comparable<? super V>>
    List<Map.Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

        List<Map.Entry<K,V>> sortedEntries = new ArrayList<Map.Entry<K,V>>(map.entrySet());

        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<K,V>>() {
                    @Override
                    public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );
        return sortedEntries;
    }
}
