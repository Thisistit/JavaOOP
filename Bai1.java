


public class Bai1 {
    public static void main(String[] args) {
        int a = 10; 
        int b = 3;

        // Tính toán
        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));

        if (b != 0) {
            System.out.println("Thương: " + ((double) a / b));
            System.out.println("Chia lấy dư: " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        // So sánh
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}
