import java.util.Random;
import java.util.Scanner;

public class ArrayBoundCheck {
    public static void main(String[] args) {
        int[] data = new int[100];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000); 
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array index: ");
        try {
            int index = scanner.nextInt();
            if (index < 0 || index >= data.length) {
                System.out.println("Out of Bounds");
            } else {
                System.out.println("Element value: " + data[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println("Invalid input. A numeric integer format is required.");
        } finally {
            scanner.close();
        }
    }
}