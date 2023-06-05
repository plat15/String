public class Bai2 {
    public static void main(String[] args) {
        String str = "string list comparison";
        String str1 = "STRING LIST COMPARISON";

        System.out.println("String 1: " + str);
        System.out.println("String 2: " + str1);

        int result = str.compareToIgnoreCase(str1);

        if (result < 0) {
            System.out.println("\"" + str + "\"" + " is less than " + "\"" + str1 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str + "\"" + " is equal to " + "\"" + str1 + "\"");
        } else // if (result > 0)
        {
            System.out.println("\"" + str + "\"" + " is greater than " + "\"" + str1 + "\"");
        }

    }
}
