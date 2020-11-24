public class TestTv{
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        System.out.println(tv1.channel);

        TV tv2 = new TV();
        System.out.println(tv2.on);
        tv2.turnOn();
        System.out.println(tv2.on);
        tv2.turnOff();
        System.out.println(tv2.on);
    }
}

class TV {
 int channel = 1;
 int volume = 1;
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
    if(on && newChannel >=1 && newChannel < 120)
        channel = newChannel;
 }

 public void setVolume(int newVolumeLevel){
    if(on && newVolumeLevel >=1 && newVolumeLevel < 7)
        volume = newVolumeLevel;
 }

 public void channelUp(){
    if(on && channel < 120)
        channel++;
    else if(on && channel == 120)
        channel = 1;
 }

 public void channelDown(){
    if(on && channel > 1)
        channel--;
    else if(on && channel == 1)
        channel = 120;
 }

 public void volumeUp(){
    if(on && volume < 7)
        volume++;
 }

 public void volumeDown(){
    if(on && volume > 1)
    volume--;
}
}
