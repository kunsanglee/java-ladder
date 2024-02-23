### 도메인 기능 목록

1. Player
    - 이름은 최소 1자 이상, 최대 5자 이름만 가능하다.
    - 영어, 한글만 입력 가능하다.
2. Players
    - 플레이어들을 갖는 일급 컬렉션.
    - 인원은 최소 2명 이상, 최대 10명 이하만 가능하다.

3. Height
    - 높이는 최소 2이상, 최대 10이하만 가능하다.

4. Bridge
    - 방향값을 갖는 Direction을 갖는다.

5. Line
    - Bridge를 가지는 일급 컬렉션.
    - 각 Bridge의 존재 여부를 지정하며 생성한다.
    - 쳣번째 Bridge면, 1/2 확률로 다리를 연결한다.
    - 이전 Bridge가 존재하면 아니면 1/2 확률로 다리를 연결한다.

6. Ladder
    - Line들을 가지는 일급 컬렉션.
    - 생성자에서 참가자, 최대 높이, 랜덤 구현체를 바탕으로 사다리를 만든다.

### 입출력 기능 목록

1. 이름 입력받는다.
    - 쉼표(,)를 기준으로 구분한다.

2. 사다리 최대 높이를 입력받는다.
    - 숫자만 입력 가능하다.

3. 폭은 최대 닉네임만큼 여백을 생성한다.