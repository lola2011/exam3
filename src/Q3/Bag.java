package Q3;

import java.util.ArrayList;

public class Bag  {
    Flat flat;
    Circle circle;
    Cylindric cylindric;

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Cylindric getCylindric() {
        return cylindric;
    }

    public void setCylindric(Cylindric cylindric) {
        this.cylindric = cylindric;
    }

    public Bag(Flat flat, Circle circle, Cylindric cylindric) {
        this.flat = flat;
        this.circle = circle;
        this.cylindric = cylindric;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "flat=" + flat +
                ", circle=" + circle +
                ", cylindric=" + cylindric +
                '}';
    }


    public void consist(Cylindric cylindric,Circle circle,Flat flat){
        System.out.println(cylindric + circle);
    }
}
