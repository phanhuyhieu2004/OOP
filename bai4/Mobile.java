package bai4;


public class Mobile {
    private int battery;
    private String draftMessage;
    private String inboxMessage;
    private String sentMessage;
    private boolean isOn;

    public Mobile() {
        this.battery = 100;
        this.draftMessage = "";
        this.inboxMessage = "";
        this.sentMessage = "";
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Điện thoại đã được bật.");
        } else {
            System.out.println("Điện thoại đã được bật rồi.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Điện thoại đã được tắt.");
        } else {
            System.out.println("Điện thoại đã được tắt rồi.");
        }
    }

    public void chargeBattery() {
        if (isOn) {
            battery += 10;
            System.out.println("Pin đã được sạc.");
        } else {
            System.out.println("Điện thoại chưa được bật.");
        }
    }

    public void composeMessage(String message) {
        if (isOn) {
            draftMessage = message;
            battery--;
            System.out.println("Tin nhắn đã được soạn thảo.");
        } else {
            System.out.println("Điện thoại chưa được bật.");
        }
    }

    public void receiveMessage(String message) {
        if (isOn) {
            inboxMessage = message;
            battery--;
            System.out.println("Tin nhắn mới đã được nhận.");
        } else {
            System.out.println("Điện thoại chưa được bật.");
        }
    }

    public void sendMessage(Mobile mobile) {
        if (isOn) {
            mobile.receiveMessage(draftMessage);
            sentMessage = draftMessage;
            draftMessage = "";
            battery--;
            System.out.println("Tin nhắn đã được gửi đi.");
        } else {
            System.out.println("Điện thoại chưa được bật.");
        }
    }

    public void viewInbox() {
        if (isOn) {
            System.out.println(inboxMessage);
        } else {
            System.out.println("Điện thoại chưa được bật.");
        }
    }

    public void viewSent() {
        if (isOn) {
            System.out.println(sentMessage);
        } else {
            System.out.println("Điện thoại chưa được bật.");
        }
    }
}

 class main {

    public static void main(String[] args) {

        Mobile nokia = new Mobile();
        Mobile iphone = new Mobile();

        nokia.composeMessage("Xin chào iPhone!");
        nokia.sendMessage(iphone);
        iphone.viewInbox();

    }
}
