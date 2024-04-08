public class Application {

    public static void main(String[] args) {
        Users users = InputHandler.inputUsername();
        int height = InputHandler.inputHeight();
        Destination destination = new Destination(users, InputHandler.inputDestination());

        BooleanGenerator generator = new RandomBooleanGenerator();

        Ladder ladder = new Ladder(users.getUsers().size(), height, generator);
        OutputHandler.printLadder(users, ladder, destination);

        ladder.generateAllResult(users);
        
        while (true) {
            String username = InputHandler.inputUser();
            if (username.equals("all")) {
                OutputHandler.printAllResult(destination, users);
                break;
            }
            User user = users.getUserByUsername(username);
            OutputHandler.printUserResult(destination, user);
        }
    }
}

