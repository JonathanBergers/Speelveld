package nl.saxion.groep2.speelveld.kamertjeverhuren.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;

import java.util.ArrayList;

import nl.saxion.groep2.speelveld.kamertjeverhuren.model.Board;
import nl.saxion.groep2.speelveld.kamertjeverhuren.model.Model;
import nl.saxion.groep2.speelveld.kamertjeverhuren.model.Point;

/**
 * Created by Robert on 18-5-2016.
 */
public class GameBoardView extends View{


    private Paint pointPaint = new Paint(Color.BLACK);


    private ArrayList<Point> points = null;
    public GameBoardView(Context context) {
        super(context);
        init();
    }

    public GameBoardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GameBoardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }




    public void init()
    {



        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                // haal bord op.
                // voeg nieuwe punt toe a.h.v x, en y coordinaat van je vninger (uit het even)
                System.out.print("on touch x: " + event.getX() + " y: " + event.getY());

                Model.getInstance().getBoard().addPoint((int)event.getX(), (int) event.getY());
                // roep view Invalidate aan OMDAT VIEW MOET REFRESHEN
                v.invalidate();
                return true;
            }
        });
    }





    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Board board = Model.getInstance().getBoard();
        ArrayList<Point> points = board.getPoints();

        if(points.size() ==0 ){
            board.generatePoints(getWidth(), getHeight(), 4, 4);

        }

        for (Point p : points){
            System.out.println("Painting point at x: " + p.getX() + " y: " + p.getY());
            canvas.drawCircle(p.getX(), p.getY(), 10, pointPaint);

        }

    }


}