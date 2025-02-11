import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private static final Scanner sc = new Scanner(System.in);

    public static Users inputUsername() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return new Users(sc.nextLine().split(","));
    }

    public static int inputHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(sc.nextLine());
    }

    public static String inputUser() {
        System.out.println("결과를 보고 싶은 사람은?");
        return sc.nextLine();
    }

    public static List<String> inputDestination() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요");
        return Arrays.asList(sc.nextLine().split(","));
    }
}
