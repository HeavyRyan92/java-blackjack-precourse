package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer extends User  {

    private List<Card> cards = new ArrayList<>();

    public Dealer() {}

    public List<Card> getCard() {
        return this.cards;
    }

    public void addDealerCard(HashMap<Card, Integer> useState, List<Card> cardTrump) {
        cards = addCard(useState, cardTrump);

    }
    public int allScore() {
        return allScore(cards);
    }

    // TODO 추가 기능 구현
}
