package nl.saxion.groep2.speelveld.kamertjeverhuren.model;

import java.util.ArrayList;

/**
 * Created by jonathan on 5/18/16.
 */
public class Board {


    private ArrayList<Point> points = new ArrayList<>();

    public ArrayList<Point> getPoints(){
        return points;
    }


    public Point addPoint(int x, int y){
        Point p = new Point(x, y);
        points.add(p);
        return p;

    }
    public void generatePoints(int width, int height, int pointAmountX, int pointAmountY){


        System.out.println("height" + height);
        System.out.println("width" + width);


        int spaceBetweenPointsX = width / (pointAmountX + 2);
        int spaceBetweenPointsY = height / (pointAmountY + 2);




        for(int x =0; x <= pointAmountX; x++){

            for(int y = 0; y < pointAmountY ; y++){

                int pointX = (spaceBetweenPointsX * x) + spaceBetweenPointsX;
                int pointY =( spaceBetweenPointsY * y) + spaceBetweenPointsY;

                Point point = new Point(pointX, pointY);
                points.add(point);


            }

        }

    }




}
