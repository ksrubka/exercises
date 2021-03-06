package skarb_finder;

import skarb_finder.movingStrategy.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class SkarbFinder {
    private int nrOfDataSets;
    private List<DataSet> dataSets = new ArrayList<>();
    private MyPoint position = new MyPoint();

    public SkarbFinder(){
        this.nrOfDataSets = (int) (Math.random() * 51);
        System.out.println(nrOfDataSets);
        for (int dataSetNr = 0; dataSetNr < nrOfDataSets; dataSetNr++)
            this.dataSets.add(new DataSet());
    }

    public static void main(String[] args) {
        SkarbFinder skarbFinder = new SkarbFinder();
        getShortestWay(skarbFinder.position);
    }

    private static void getShortestWay(MyPoint position){
        int x = (int) position.getX();
        int y = (int) position.getY();
        int verticalDirection = (x > 0) ? 0 : 1;
        int horizontalDirection = (y > 0) ? 3 : 2;

        System.out.println();
        if (x == 0 && y == 0)
            System.out.println("studnia");
        else if (x == 0)
            System.out.println(horizontalDirection + " " + Math.abs(y));
        else if (y == 0)
            System.out.println(verticalDirection + " " + Math.abs(x));
        else {
            System.out.println(verticalDirection + " " + Math.abs(x));
            System.out.println(horizontalDirection + " " + Math.abs(y));
        }
    }

   public class MyPoint extends Point {
        public void addToX(long x){
            this.x += x;
        }

        public void addToY(long y){
            this.y += y;
        }

        public void subtractFromX(long x){
            this.x -= x;
        }

        public void subtractFromY(long y){
            this.y -= y;
        }
    }

    private class DataSet {
        private int nrOfHints;
        private List<Hint> hints = new ArrayList<>();

        public DataSet(){
            this.nrOfHints = (int) (Math.random() * 100001);
            System.out.println(nrOfHints);
            for (int hintNr = 0; hintNr < nrOfHints; hintNr++)
                hints.add(new Hint());
        }
    }

    class Hint {
        private int direction;
        private int steps;
        private MovingStrategy movingDirection;

        public Hint(){
            this.direction = (int) (Math.random() * 4);
            this.steps = (int) (Math.random() * 100001);
            System.out.println(direction + " " + steps);
            this.movingDirection = MovingStrategyFactory.create(direction);
            go(steps);
        }

        private void go(int steps){
            movingDirection.go(steps, position);
        }
    }
}