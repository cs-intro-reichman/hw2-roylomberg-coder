public class Cheers {
    public static void main(String[] args) {

        String word = args[0].toUpperCase();
        int n = Integer.parseInt(args[1]);
        String an = "AEFHILMNORSX";

        int i = 0;
        while (i < word.length()) {
            char c = word.charAt(i);
            if (an.indexOf(c) >= 0) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a " + c + ": " + c + "!");
            }
            i++;
        }

        System.out.println("What does that spell?");
        for (int k = 0; k < n; k++) {
            System.out.println(word + "!!!");
        }
        
    }
}
