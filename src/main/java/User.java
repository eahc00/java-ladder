public class User {

    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    private int id;
    private int state;

    public User(String name, int id) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new RuntimeException(String.format("사람 이름은 %d글자 이내여야 합니다.", MAX_NAME_LENGTH));
        }
        this.name = name;
        this.id = id;
        this.state = id;
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return this.state;
    }
    public void moveLeft() {
        this.state--;
    }

    public void moveRight() {
        this.state++;
    }
}
