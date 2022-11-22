# 기능 목록

## 입력
### InputView
- 다리의 길이를 입력 - readBridgeSize()
- 사용자가 이동할 칸을 입력 - readMoving()
- 사용자가 게임을 다시 시도할지 종료할지 여부를 입력 - readGameCommand()

## 출력
### OutputView
- 이동한 다리 출력 - printMap()
- 최종 결과 출력 - printResult()

## 게임진행
### Application
- 게임 시작 - startGame()
- 예외 처리 - controlException()

### BridgeGame
- 사용자 이동 시 사용 - move()
- 게임을 다시 시도할 때 사용 - retry()

### BridgeMaker
- 다리를 만들 때 사용 - makeBridge()
  - 랜덤 다리칸 생성 - makeRandom()

### GameController
- 인풋값 받아서 브릿지게임에 전달해서 결과 받고 그 값을 아웃풋에 넘겨서 출력 후 정상종료