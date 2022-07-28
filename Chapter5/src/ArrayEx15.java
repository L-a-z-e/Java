public class ArrayEx15 {
    public static void main(String[] args) {
        String src = "SOSHELP";
        String[] encrypt = { "1", "2", "3", "4", "5", "6", "7"
                                            ,"1", "2", "3", "4", "5", "6", "7"
                                            ,"1", "2", "3", "4", "5", "6", "7"
                                            ,"1", "2", "3", "4", "5", "6", "7"};

        String result = "";

        for (int i = 0 ; i < src.length() ; i++){
            result += encrypt[src.charAt(i)-'A'];
        }

        System.out.println(result);
    }

}
