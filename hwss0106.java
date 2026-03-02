import java.util.*;

public class hwss0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vận tốc = ");
        float v =  sc.nextFloat();
        System.out.print("Thời gian = ");
        float t = sc.nextFloat();
        float s = v * t;
        System.out.printf("Quãng đường = %.0f", s);
        sc.close();
    }
}
