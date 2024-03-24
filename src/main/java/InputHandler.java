import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private static final Scanner sc = new Scanner(System.in);

    private static Users inputUsername() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return new Users(Arrays.asList(sc.nextLine().split(",")));
    }
}
