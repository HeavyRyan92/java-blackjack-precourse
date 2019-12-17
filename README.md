BlackJackGame
=========================
기능구현
-------------------------
1. 게임에 참여할 사람의 이름을 입력받는다.
    - (조건) ","를 기준으로 이름을 나눈다.
    - (예외) 이름이 알파벳이 아닐경우
    - (예외) 이름이 중복됬을경우(대소문자 구별 안함)
        - (처리) 다시 입력받는다.
2. 배팅 금액을 입력받는다.
    - (조건) 만원단위로 입력을 받는다.
    - (예외) 만원단위가 아니거나 정수가 아닌 다른값이 입력될경우
            - (처리) 만원단위 정수가 입력될때까지 다시 입력받는다.
3. Player를 등록한다.
4. 2~3번과정 모든 플레이어에게 반복하여 등록한다.
5. 딜러와 등록된 모든 플레이어에게 2장의 카드를 지급한다.
    - (조건) 모든 플레이어는 각기 다른 카드 2장을 지급 받아야 한다.
6. 블랙잭(합이 21) 인지 확인한다.
    - (6-1) 딜러와 플레이어가 둘다 블랙잭인경우
        - (처리) 배팅금액을 딜러에게 돌려받는다(블랙잭인 플레이어만 해당).
    - (6-2) 플레이어만 블랙잭인경우
        - (처리) 배팅금액의 1.5배를 딜러에게 받는다.
    - (6-3) 둘다 블랙잭이 아닌경우 
        - (처리) 7번과정으로 넘어간다.
7. 각 플레이어 마다 원할때까지 카드를 받는다.
    - (조건) y를 입력할경우 카드를 받는다.
8. 한장씩 받을때마다 21이 넘는지 확인한다.
    - (8-1) 21이 넘을경우
        - (처리) 순서를 넘긴다.
    - (8-2) 21이 넘지 않고 더이상 안받을경우
        - (처리) 순서를 넘긴다.
    - (8-3) 21일 경우
        - (처리) 순서를 넘긴다.
9. 8번 과정을 모든 플레이어가 반복한다.
    (처리) 반복하면서 가장 높은 값을 찾아 저장한다.
10. 딜러는 카드를 받는다
    - (조건) 2장의 합이 16이하 이면 반드시 1장을 받는다.
    - (조건) 17 이상이면 추가로 받지 못한다.
11. 딜러 카드를 계산한다.
    - (조건) 딜러 카드가 21을 넘는 경우 
        - (처리) 모든 플레이어는 베팅금액을 돌려받는다.
    - (조건) 딜러와 플레이어가 모든 21을 넘는경우
        - (처리) 딜러 패배
    - (조건) 딜러 카드가 21을 넘지 않는경우
        - (처리) 12번 과정으로 넘어간다.
12. 딜러, 플레이어 카드를 모두 공개 하고 합을 보여준다.
13. 베팅 금액을 모두 모아 승리한 플레이어와 딜러에게 분배 하고 수익을 계산한다.     

- 추가 구현
    - (조건)플레이어와 딜러가 상황에 따라 ACE의 값을 조정 하도록 한다.
        - (조건 1) 플레이어는 21에 가깝게 ACE의 값을 1또는 11로 조정할수있다.
        - (조건 2) 딜러는 21을 넘는것이 아닌 이상 ACE를 11로 해야한다.
       