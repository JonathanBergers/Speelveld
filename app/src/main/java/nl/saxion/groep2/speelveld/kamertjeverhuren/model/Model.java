package nl.saxion.groep2.speelveld.kamertjeverhuren.model;

import nl.saxion.groep2.speelveld.kamertjeverhuren.view.GameBoardView;

/**
 * Created by jonathan on 5/18/16.
 */
public class Model {


    private Board board;

    public Model() {
        this.board = new Board();
    }

    protected static Model model;

    public  static Model getInstance(){
        if (model == null){
            model = new Model();
        }
        return model;
    }


    public Board getBoard() {
        return board;
    }
}
