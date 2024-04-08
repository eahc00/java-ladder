import java.util.List;
import java.util.stream.Collectors;

public class OutputHandler {
    public static void printLadder(Users users, Ladder ladder, Destination destination) {
        printUsers(users);
        for (Line line : ladder.getLines()) {
            printLine(line);
        }
        printDestination(destination);
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

    public static void printDestination(Destination destination) {
        String result = destination.getDestination().stream()
                .map(it -> String.format("%6s", it))
                .collect(Collectors.joining());
        System.out.println(result);
    }

    public static void printUserResult(Destination destination, User user) {
        System.out.println("실행 결과");
        System.out.println(destination.getUserDestination(user));
    }

    public static void printAllResult(Destination destination, Users users) {
        System.out.println("실행 결과");
        for (User user : users.getUsers()) {
            System.out.println(user.getName() + " : " + destination.getUserDestination(user));
        }
    }
}
