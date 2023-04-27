package bai4;

public class Denpin {
    public static void main(String[] args) {
        Pin pin = new Pin();
        Den den = new Den(true, pin);
        den.Bat();
        den.Chieusang();
        System.out.println(pin.getNangluong());
    }
}
class Pin {
    private int nangluong = 100 ;

    public Pin(){
    }

    public void setNangluong(int nangluong) {
        this.nangluong = nangluong;
    }

    public int getNangluong() {
        return nangluong;
    }
    public void Giampin (){
        if (nangluong > 0 ){
            nangluong--;
        } else {
            System.out.println("Hết cụ nó pin");
        }
    }
}
class Den {
    public Den(boolean kiemtra, Pin pin) {
        Kiemtra = kiemtra;
        this.pin = pin;
    }

    public boolean isKiemtra() {
        return Kiemtra;
    }

    private  boolean Kiemtra ;
    private Pin pin;

    public Den (){
    }

    public int getPin() {
        return pin.getNangluong();
    }
    public void Bat(){
        Kiemtra = true;
    }
    public void Tat(){
        Kiemtra = false;
    }

    public void Chieusang(){

        if (isKiemtra() && pin.getNangluong() > 0){
            System.out.println("đèn sáng ");
            pin.Giampin();
        }else {
            System.out.println("đèn tắt ");
        }
    }
}
