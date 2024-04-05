public class User {

    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    private int state;

    public User(String name, int initState) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new RuntimeException(String.format("사람 이름은 %d글자 이내여야 합니다.", MAX_NAME_LENGTH));
        }
        this.name = name;
        this.state = initState;
    }

    public String getName() {
        return name;
    }

    public void moveLeft() {
        this.state--;
    }
    public void moveRight() {
        this.state++;
    }

    public int getState() {
        return state;
    }
}
