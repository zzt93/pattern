package decouple.mediator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public class Player {

    private final GameMediator gameMediator;
    private int limit;
    boolean isMain;
    ArrayList<Card> cards = new ArrayList<>();
    private Random random = new Random();

    public Player(GameMediator game, boolean isMain) {
        this.gameMediator = game;
        this.isMain = isMain;
        this.limit = random.nextInt(20) + 10;
    }

    public void getNewCard(Card card) {
        limit --;
        cards.add(card);
    }

    private Card removeRandomCard(){
        if (cards.isEmpty()) {
            throw new RuntimeException("impossible");
        }
        return cards.remove(random.nextInt(cards.size()));
    }

    public Player giveCard() throws Exception {
        return gameMediator.showCardOnBoard(this, removeRandomCard());
    }

    public void getGivenCard(Card card) {
        getNewCard(card);
    }

    public boolean win() {
        return limit == 0;
    }

    public boolean needThis(Card card) {
        return random.nextInt(13) == 1;
    }

    public String describe() {
        return cards.stream().map(Card::toString).reduce((s, s2) -> s + " " +  s2 ).get();
    }

}
