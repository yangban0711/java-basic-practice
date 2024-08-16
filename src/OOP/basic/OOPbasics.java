package OOP.basic;

public class OOPbasics {

    public static void main(String[] args) {

        Pen redPen = new Pen();
        Pen bluePen = new Pen();

        //---------------------------------------

        redPen.color = "빨강";
        bluePen.color = "파랑";

        redPen.price = 500;
        bluePen.price = 700;

        redPen.productNo = "01";
        bluePen.productNo = "02";

        //--------------------------------------

        redPen.write();
        bluePen.write();

    }

}
