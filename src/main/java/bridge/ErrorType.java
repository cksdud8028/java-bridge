package bridge;

public enum ErrorType {
    WRONG_MOVING_INPUT("[ERROR] 이동할 칸은 U와 D만 입력 가능합니다."),
    WRONG_GAME_COMMAND_INPUT("[ERROR] 재시도 명령어는 U와 D만 입력 가능합니다."),
    NOT_INTEGER_INPUT("[ERROR] 다리 길이는 숫자만 입력 가능합니다."),
    WRONG_RANGE_INPUT("[ERROR] 다리 길이는 3부터 20까지만 입력 가능합니다.");

    private final String errorMessage;

    ErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
