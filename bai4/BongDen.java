package bai4;

class SwitchButton{
    private boolean status ;

    private ElectricLamp lamp ;

    public SwitchButton( ){

    }
    public void connectToLamp( ElectricLamp electricLamp){
        this.lamp=electricLamp;
    }
    public void switchOff(){
        this.status=false;

    }
    public void switchOn (){
        if (status) {
            this.lamp.turnOff();
        }

    }

    public ElectricLamp getLamp() {
        return lamp;
    }

}
class ElectricLamp {
    private boolean status ;

    public ElectricLamp(){
    }

    public boolean isStatus() {
        return status;
    }

    public void turnOff(){
        if (!this.isStatus()){
            System.out.println("Đèn tắt ");
        }
    }
    public void turnOn(){
        if (this.isStatus()){
            System.out.println("Đèn sáng ");
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void  check(){
        if (status){
            setStatus(false);
        }else  {
            setStatus(true);
        }
    }
}
class CongTac {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp();
        int i=0;
        while ( i <11) {
            electricLamp.check();
            electricLamp.turnOn();
            electricLamp.turnOff();
            ++i;
        }
    }
}
