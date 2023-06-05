`public class Bai1 {
    public static void main(String[] args) {
        String str = "Java Exercises!";
        System.out.println("Chuỗi góc: " + str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("Ký tự vị trí số 1: " + (char) index1);
        System.out.println("Ký tự vị trí số 10: " + (char) index2);
    }
}
