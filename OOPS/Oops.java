package OOPS;


public class Oops {//public function
    public static void main(String[] args) {
        //PEN
        Pen p1=new Pen();
        p1.setColor=("blue");
        //p1.setColor="blue";
        System.out.print(p1.Color);
        p1.setTip=(5);
        System.out.println(p1.Tip);
    }
}


class Pen{
    String Color;
    int Tip;
    public String setColor;
    public int setTip;

    void setColor(String newColor){
        Color=newColor;
    }
    void setTip(int newTip){
        Tip=newTip;
    }
}