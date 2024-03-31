import java.util.stream.Collectors;

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
}
