class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1 의 채널 값은 :" + t1.channel);
        System.out.println("t2 의 채널 값은 :" + t2.channel);

        t1.channel = 7;
        System.out.println("t1 채널 값 " + t1.channel + "로 변경");

        System.out.println("t1 의 채널 값은 :" + t1.channel);
        System.out.println("t2 의 채널 값은 :" + t2.channel);
    }
}
