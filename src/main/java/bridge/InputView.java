package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private final ErrorController errorController = new ErrorController();

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        int size = Integer.parseInt(Console.readLine());
        return size;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() throws IllegalArgumentException {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String moving = Console.readLine();
        if (!moving.equals("U") && !moving.equals("D")) {
            errorController.receiveError(ErrorType.WRONG_MOVING_INPUT);
            readMoving();
        }
        return moving;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() throws IllegalArgumentException {
        String command = Console.readLine();
        if (command.equals("R") || command.equals("Q")) {
            return command;
        }
        throw new IllegalArgumentException();
    }
}
