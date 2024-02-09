
public class GetterSetter {

    public static void main(String[] args) {
        Pen p1 = new Pen();// created object p1
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen {
    // property if pen
    private String Color;
    private int Tip;

    // GETTER
    String getColor() {
        return this.Color;
    }

    int getTip() {
        return this.Tip;
    }

    // SETTER
    void setColor(String newColor) {
        this.Color = newColor;
    }

    void setTip(int newTip) {
        this.Tip = newTip;
    }
}
