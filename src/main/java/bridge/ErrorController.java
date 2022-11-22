package bridge;

public class ErrorController {
    private ErrorType errorType;

    public void receiveError(ErrorType errorType) {
        this.errorType = errorType;
        if (errorType == ErrorType.WRONG_MOVING_INPUT) {
            readMovingError();
        }
    }

    private void readMovingError() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException exception) {
            System.out.println(errorType.getErrorMessage());
        }
    }

}
