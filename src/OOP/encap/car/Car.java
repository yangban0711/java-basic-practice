package OOP.encap.car;

public class Car {

    private String model;
    private int speed;
    private char mode;
    private boolean start;

    public Car(String model){
        this.model = model;

    }


    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        if (speed == 0 || speed > 300) {
            System.out.println("잘못된 속도입니다.");
            return;
        }
        if(!start) {
            System.out.println("시동을 먼저 거세요");
            return;
        }
        if(mode == 'D' || mode == 'R') {
            if(mode =='R' && speed > 40) {
                System.out.println("후진은 40 이상으로 가속할 수 없습니다");
            }
        }
        else{
            System.out.println("변속기 위치를 확인하세요");
        }
        this.speed = speed;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        this.mode = mode;
    }


    //boolean 타입의 getter는 is + 필드명으로 자동완성합니다.
    public boolean isStart() {
        return start;
    }
    public void setStart(boolean start) {
        this.start = start;
    }
//---------------------------------------------------------------------------------------
    //시동 버튼 누르는 행위
    public void engineStart() {
        System.out.println("시동버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        moveCylinder();
        System.out.println("시동이 걸렸습니다.");
    }

    //엔진오일이 주입되는 기능
    private void injectOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    //엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        System.out.println("연료가 엔진에 주입됩니다.");
    }

    //실린더가 움직이는 기능
    private void moveCylinder() {
        if(start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("실린더가 움직이지 않습니다.");
        }
    }

    //시동을 끄는 기능
    public void engineStop() {
        if(speed > 0) {
            System.out.println("주행 중에는 시동을 끌 수 없습니다");
            return;
        }
        if(mode != 'P') {
            System.out.println("P모드에서만 시동을 끌 수 있습니다");
            return;
        }
        this.start = false;
        System.out.println("시동이 꺼졌습니다");
    }

}
