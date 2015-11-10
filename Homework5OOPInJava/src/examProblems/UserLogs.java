package examProblems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> userList = new TreeMap<>();
        while (!input.equals("end")){
            String iPPattern = "(\\w*:\\d.+\\d+\\w*|\\d+\\.\\d+\\.\\d+\\.\\d+)";
            String userPattern = "(?<=user=)(\\w+)";
            String ip = findStringInText(input, iPPattern);

            String user = findStringInText(input, userPattern);

            if(!userList.containsKey(user)) {
                userList.put(user, new LinkedHashMap<>());
                userList.get(user).put(ip, 1);
            } else {
                Integer count = 0;
                if (userList.get(user).containsKey(ip)) {
                    count = userList.get(user).get(ip);
                }
                userList.get(user).put(ip, count + 1);
            }
            input = scanner.nextLine();
        }

        for (String user : userList.keySet()) {
            System.out.println(user + ":");
            ArrayList<String> result = new ArrayList<>();
            for (String ip : userList.get(user).keySet()) {
                result.add(String.format("%s => %d", ip, userList.get(user).get(ip)));

            }
            System.out.print(String.join(", ", result.stream().collect(Collectors.toList())) + ".");
            System.out.println();
            result.clear();
        }
    }
    public static String findStringInText(String text, String pattern){
        String result = "";

        Pattern pat = Pattern.compile(pattern);
        Matcher matcher = pat.matcher(text);
        if (matcher.find()) {
            result = matcher.group();
        }
        return result;
    }
}
