# 기능 목록

## 출력
### InputView
- 다리의 길이를 입력받는다. - readBridgeSize()
- 사용자가 이동할 칸을 입력받는다. - readMoving()
- 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다. - readGameCommand()

### OutputView
- 이동한 다리 출력한다. - printMap()
- 최종 결과 출력한다. - printResult()

### BridgeGame
- 사용자 이동 시 사용한다. - move()
- 게임을 다시 시도할 때 사용한다. retry()

### BridgeMaker
- 다리를 만들 때 사용한다. - makeBridge()
  - 랜덤 다리칸 생성하기. - makeRandom()

### GameController
- 인풋값 받아서 브릿지게임에 전달해서 결과 받고 그 값을 아웃풋에 넘겨서 출력 후 정상종료