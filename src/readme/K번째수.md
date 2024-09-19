# K번째수
> 2024-09-19 목요일

### 문제
![K번째수 문제](https://github.com/user-attachments/assets/45211c1d-8989-4f49-9b31-361d648315b3)

### 접근 방법
1. 우선 answer 배열에 크기를 commands 의 길이로 선언함
2. for 문을 이용하여 commands 의 길이 만큼 반복 시키도록 한 뒤, [Arrays.copyOfRange](https://velog.io/@tsun0705/Java-%EB%B0%B0%EC%97%B4-%EB%B3%B5%EC%82%AC-copyOf-copyOfRange) 라는 메소드를 활용하여 arr 라는 배열에 선언함
3. arr 의 commands[i][2] 에 해당하는 값을 answer[i] 에 선언하고, for 문 종료후에 answer 리턴

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/Day_1/Array.java)

### 느낀점
추석 연휴 끝나고 오랜만에 코딩 문제를 풀어 봤는데 안풀다가 푸니까 메소드명들이 너무 헷갈렸다! 또 공부를 더 하려면 메소드 사용하지말고 해당 메소드를 구현하는 것이 더 도움된다는 얘기를 들어서 이제부터는 메소드를 하나하나 구현해보는 공부도 같이 병행해야겠다 😊
