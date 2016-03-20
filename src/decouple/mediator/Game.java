package decouple.mediator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public class Game implements GameMediator {

    public static final int NUM = 9;
    public static final int DUP = 4;
    public static final int ALL_PLAYER = 4;
    public static final int INIT_CARD = 13;
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    private static Random random = new Random();


    public void start() {
        fillCards();
        initPlayers();
        startPlay();
    }

    private void startPlay() {
        Player now = players.get(0);
        try {
            now.getNewCard(getRandomCard());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            while (!now.win()) {
                now = now.giveCard();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println(players.indexOf(now));
        System.out.println(now.describe());
    }

    private Card getRandomCard() throws Exception {
        if (cards.isEmpty()) {
            throw new Exception("draw");
        }
        return cards.get(random.nextInt(cards.size()));
    }

    private void initPlayers() {
        Player main = new Player(this, true);
        players.add(main);
        for (int i = 0; i < ALL_PLAYER - 1; i++) {
            players.add(new Player(this, false));
        }
        for (int i = 0; i < INIT_CARD; i++) {
            for (Player player : players) {
                try {
                    player.getNewCard(getRandomCard());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void fillCards() {
        for (int i = 0; i < DUP; i++) {
            for (Type type : Type.values()) {
                for (int j = 0; j < NUM; j++) {
                    cards.add(new Card((char) ('1' + j), type));
                }
            }
        }
    }


    public static void main(String[] args) {
        new Game().start();
    }

    public Player showCardOnBoard(Player player, Card card) throws Exception {
        // test whether other play need this card
        for (Player p : players) {
            if (p != player) {
                if (p.needThis(card)) {
                    p.getGivenCard(card);
                    return p;
                }
            }
        }

        // next player get new card
        Player nextPlayer = nextPlayer(player);
        nextPlayer.getNewCard(getRandomCard());
        return nextPlayer;
    }

    private Player nextPlayer(Player player) {
        int i = players.indexOf(player);
        return players.get((i + 1) % ALL_PLAYER);
    }
}
