public class TvTest3 {
    public static void main(String[] args) {

        Tv[] tvArray = new Tv[3];

        for ( int i = 0; i < tvArray.length ; i++ ){
            tvArray[i] = new Tv();
            tvArray[i].channel = i + 10;
        }

        for ( int i = 0 ; i < tvArray.length ; i ++ ){
            tvArray[i].channelUp();
            System.out.printf("tvArray[%d].channel = %d%n",i,tvArray[i].channel);
        }
    }
}
