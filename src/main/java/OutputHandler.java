import java.util.List;
import java.util.stream.Collectors;
import javax.print.attribute.standard.Destination;

public class OutputHandler {
    public static void printLadder(Users users, Ladder ladder) {
        printUsers(users);
        for (Line line : ladder.getLines()) {
            printLine(line);
        }
    }

    private static void printUsers(Users users) {
        String result = users.getUsers().stream()
                .map(user -> String.format("%6s", user.getName()))
                .collect(Collectors.joining());
        System.out.println(result);
    }

    private static void printLine(Line line) {
        String result = line.getPoints().stream()
                .map(OutputHandler::generatePointOutput)
                .collect(Collectors.joining("|", "    |", "|"));
        System.out.println(result);;
    }

    private static String generatePointOutput(boolean point) {
        if (point) {
            return "-----";
        }
        return "     ";
    }

    public static void printDestination(List<String> destination) {
        String result = destination.stream()
                .map(it -> String.format("%6s", it))
                .collect(Collectors.joining());
        System.out.println(result);
    }

    public static void printResult(String username, Users users, Ladder ladder, List<String> destination) {
        if (username.equals("all")) {
            printAll(users, ladder, destination);
        } else {
            User user = users.getUserByUsername(username);
            ladder.generatorUserResult(user);
            System.out.println(destination.get(user.getState()));
        }
    }

    private static void printAll(Users users, Ladder ladder, List<String> destination) {
        ladder.generatorAllResult(users);
        for (User user : users.getUsers()) {
            System.out.println(user.getName() + " : " + destination.get(user.getState()));
        }
    }
}
