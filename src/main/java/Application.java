import java.util.List;

public class Application {

    public static void main(String[] args) {
        Users users = InputHandler.inputUsername();
        int height = InputHandler.inputHeight();
        List<String> destination = InputHandler.inputDestination();

        RandomBooleanGenerator generator = new RandomBooleanGenerator();

        Ladder ladder = new Ladder(users.getUsers().size(), height, generator);
        OutputHandler.printLadder(users, ladder);
        OutputHandler.printDestination(destination);

        String username = InputHandler.inputUser();
        System.out.println("실행결과");
        OutputHandler.printResult(username, users, ladder, destination);
    }
}