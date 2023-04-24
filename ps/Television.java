public class Television {
    private int channel, volume;
    private boolean onOff;

    public Television() {
        channel = 10;
        volume = 90;
        onOff = true;
    }

    public Television(int c, int v, boolean onOff) {
        channel = c;
        volume = v;
        this.onOff = onOff;
    }

    public static void main(String [] args) {
        Television myTv = new Television(10, 70, true);

        Television yourTv = new Television(20, 80, false);

        System.out.println("나의 텔레비전 채널은 " + myTv.channel + "이고 볼륨은" + myTv.volume + "입니다.");
        System.out.println("너의 텔레비전 채널은 " + yourTv.channel + "이고 볼륨은" + yourTv.volume + "입니다.");

        System.out.println(myTv);
        System.out.println(yourTv);
    }
}
