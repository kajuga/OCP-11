package OCP.chapter_4;

public class Tail {
    public static void main(String[] args) {
        var tailFeathers = 3;
        final var one = 1;
        switch (tailFeathers) {
            case one: System.out.print(3 + " ");
            default:
                case 3: System.out.print(5 + " ");
        }
        while (tailFeathers > 1) {
            System.out.print(--tailFeathers + " "); }

    }
}
