import java.util.Scanner;

public class DuplicateNumberCheck {
    private int[] a;

    public DuplicateNumberCheck(int size) {
        a = new int[size];
        inputValues();
        checkDuplicates();
    }

    private void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + a.length + " numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    private void checkDuplicates() {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    try {
                        throw new DuplicateNumberException("Duplicate number found: " + a[i]);
                    } catch (DuplicateNumberException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example: Creating an object of DuplicateNumberCheck with an array size of 5
        DuplicateNumberCheck duplicateNumberCheck = new DuplicateNumberCheck(5);
    }
}

class DuplicateNumberException extends Exception {
    DuplicateNumberException(String str) {
        super(str);
    }
}
