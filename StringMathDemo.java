public class StringMathDemo {
    public static void main(String[] args) {

        String Str1 = "Hello";
        String Str2 = "Aakanksha";
        String Str3 = Str1.concat(" " + Str2);

        System.out.println("Concatenation:" + Str3);
        System.out.println("Length of Str1:" + Str1.length());
        System.out.println("Character at index 2:" + Str1.charAt(2));
        System.out.println("Substring of Str2 (0-3):" + Str2.substring(0,3));
        System.out.println("Equals? Str1 and Str2:" + Str1.equals(Str2));
        System.out.println("Uppercase Str1:" + Str1.toUpperCase());
        System.out.println("Lowercase Str2:" + Str2.toLowerCase());

        double a = 10.2;
        double b = 4.6;

        System.out.println("Square root of a:" + Math.sqrt(a));
        System.out.println("a raised to b:" + Math.pow(a,b));
        System.out.println("Max of a and b:" + Math.max(a,b));
        System.out.println("Min of a and b:" + Math.min(a,b));
        System.out.println("Random number (0-1):" + Math.random());
        System.out.println("Random number (10-20):" + (10 + Math.random() * (20-10)));
        System.out.println("Random number (50-100):" + (50 + Math.random() * (100-50)));
        System.out.println("Ceil of b:" + Math.ceil(b));
        System.out.println("Floor of b:" + Math.floor(b));
        System.out.println("Round of b:" + Math.round(b));

    }
}