package CH_9;

public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.onTV();
        tv1.setChannel(30);
        tv1.setVolumeLevel(30);
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        TV tv2 = new TV();
        tv2.onTV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.setVolumeLevel(20);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}

