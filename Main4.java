public class Main4 {
    public static void main(String[] args) {
        // write your code here
        int arr[] = new int[5];
        arr[0] = 15;
        arr[1] = 76;
        arr[2] = 45;
        arr[3] = 29;
        arr[4] = 87;
        System.out.println("Odd Values :");
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + "");
            }
        }
    }
}
