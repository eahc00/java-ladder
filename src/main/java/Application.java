public class Application {


    public static void main(String[] args) {
        Users users = InputHandler.inputUsername();
        int height = InputHandler.inputHeight();

        RandomBooleanGenerator generator = new RandomBooleanGenerator();

        Ladder ladder = new Ladder(users.getUsers().size(), height, generator);
        OutputHandler.printLadder(users, ladder);
    }
}