public class User {

    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public User(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new RuntimeException(String.format("사람 이름은 %d글자 이내여야 합니다.", MAX_NAME_LENGTH));
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
