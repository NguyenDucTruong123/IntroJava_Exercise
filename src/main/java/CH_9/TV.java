package CH_9;

public class TV{
    int channel = 1;
    int volumeLevel = 1;
    boolean status = false;
    public  TV(){

    }
    void onTV(){
        status = true;
    }
    void offTV(){
        status = false;
    }
    public void setChannel(int newChannel){
        if (status && channel >= 1 && channel <=120 ){
            channel = newChannel;
        }
    }

    public void setVolumeLevel(int newVolumeLevel){
        if (status && volumeLevel >= 1 && volumeLevel <= 100 ){
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp (){
        if (status && channel < 120) {
            channel = channel + 1;
        }
    }

    public void channelDown(){
        if (status && channel > 1){
            channel = channel - 1;
        }
    }
    public void volumeUp (){
        if (status && volumeLevel < 100){
            volumeLevel = volumeLevel + 1;
        }
    }
    public void volumeDown (){
        if (status && volumeLevel > 0){
            volumeLevel = volumeLevel - 1;
        }
    }

}
