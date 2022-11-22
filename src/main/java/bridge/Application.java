package bridge;

public class Application {
    public static void main(String[] args) {
        try {
            startGame();
        } catch (IllegalArgumentException exception) {
            controlException();
        }

    }

    public static void startGame() {
        GameController gameController = new GameController();
    }

    private static void controlException() {
        System.out.println("[ERROR]");
    }

}
