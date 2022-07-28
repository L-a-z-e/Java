public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim","Park","Lee"};

        for (int i = 0 ; i < names.length ; i++){
            System.out.println("names["+i+"] = " + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp :"+tmp);

        for(String str : names)
            System.out.println(str);

        System.out.printf("%d",(int)'0');
        System.out.printf("%d",(int)'A');

    }
}
