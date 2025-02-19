public class star {
    public static void main(String args[]){
        int rows = 5;  // You can change the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars for the row
            System.out.println();
        }
    }

}
