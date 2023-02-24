import java.util.ArrayList;
public class DominoPile {
    ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList<>();
    }
    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }
    public void shuffle() {
        // Option 1
        ArrayList<Domino> newPile = new ArrayList<>();
        for (int i = 0; i < pile.size(); i++) {
            int randIdx = (int) (Math.random() * pile.size());
            newPile.add(pile.remove(randIdx));
        }
        pile = newPile;

        // Option 2
        for (int i = 0; i < 100; i++) {
            int randIdx1 = (int) (Math.random() * pile.size());
            int randIdx2 = (int) (Math.random() * pile.size());
            Domino temp = pile.get(randIdx1);
            pile.set(randIdx1, pile.get(randIdx2));
            pile.set(randIdx2, temp);
        }
    }


}





