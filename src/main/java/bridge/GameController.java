package bridge;

import java.util.List;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final int bridgeSize;
    private final List<String> bridge;

    public GameController() {
        bridgeSize = inputView.readBridgeSize();
        bridge = initialBridge();
    }

    private List<String> initialBridge() {
        BridgeNumberGenerator randomNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(randomNumberGenerator);
        return bridgeMaker.makeBridge(bridgeSize);
    }

}
