package nl.saxion.groep2.speelveld.kamertjeverhuren;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

import nl.saxion.groep2.speelveld.kamertjeverhuren.view.GameBoardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize gameboard
        GameBoardView gameBoardView = new GameBoardView(this);

        // get lowest screen width or height to create a square
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int minSide = Math.min(metrics.heightPixels, metrics.widthPixels);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(minSide, minSide);
        this.addContentView(gameBoardView, layoutParams);

        gameBoardView.invalidate();



    }
}
