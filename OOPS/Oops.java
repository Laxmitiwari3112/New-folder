package OOPS;

public class Oops {// public function

    public static void main(String[] args) {
        // PEN : OBJECT
        Pen p1 = new Pen();
        p1.setColor("blue");
        // p1.setColor="blue";
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.Tip);
    }
}

class Pen {
    //BLUE PRINT 
    String Color;
    int Tip;
    public String setColor;
    public int setTip;

    void setColor(String newColor) {
        Color = newColor;
    }

    void setTip(int newTip) {
        Tip = newTip;
    }
}