package examProblems;

import java.util.*;

public class Problem4LogsAggregator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        TreeMap<String, Integer> durations = new TreeMap<>();
        HashMap<String, TreeSet<String>> iPs = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] info = input.split(" ");
            String iP = info[0];
            String user = info[1];
            int duration = Integer.parseInt(info[2]);

            if(durations.containsKey(user)) {
                durations.put(user, durations.get(user) + duration);
            }else {
                durations.put(user, duration);
            }

            TreeSet<String> ipSet = iPs.get(user);
            if (ipSet == null) {
                ipSet = new TreeSet<>();
            }
            ipSet.add(iP);
            iPs.put(user, ipSet);

        }
        //alex: 62 [10.10.17.33, 212.50.118.81]

        for (Map.Entry<String, Integer> userAndDuration : durations.entrySet()) {
            String user = userAndDuration.getKey();
            Integer duration = userAndDuration.getValue();
            TreeSet<String> ipSet = iPs.get(user);
            System.out.println(user + ": " + duration + " " + ipSet);
        }
    }
}
