public class PD3_7 {
    public static void main(String[] args) {
        String text1 = "Karolis";
        String text2 = "Arbataitis";
        System.out.println(text1 + " " + text2);

        StringBuilder stringBuilder = new StringBuilder(); 
        stringBuilder.append(text1).append(text2);
        System.out.println(stringBuilder);

        String text3 = "Karolis";
        String text4 = new String("K");

        System.out.println(text3.equals(text4)); 

        int lenght = text1.length(); 
        System.out.println(lenght);

        String subStr = text2.substring(2, 3); 
        System.out.println(subStr);

        char charAt = text1.charAt(5);
        System.out.println(text1);

        String upperCase = text2.toUpperCase();
        System.out.println(upperCase);

    }
}
