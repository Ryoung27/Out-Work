// import java.util.Date;

public class TestTV {
    public static void main(String[] args){
        TV tv1 = new TV();
        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());
        tv1.on = true;
        tv1.volumeDown();
        System.out.println(tv1.volumeLevel);
        tv1.volumeUp();
        tv1.turnOff();
        System.out.println(tv1.volumeLevel);
        System.out.println(tv1.on);
    }
}

class TV{
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){

    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 125)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel >=1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }


    public void channelUp(){
        if (on && channel < 125){
            channel++;
        }
    }

    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if (on && volumeLevel < 10)
            volumeLevel++;
    }

    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
