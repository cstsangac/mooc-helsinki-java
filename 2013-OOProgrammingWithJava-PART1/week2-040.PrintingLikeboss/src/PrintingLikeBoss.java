public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount-- > 0) System.out.print("*");
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount-- > 0) System.out.print(" ");
        //System.out.print("\n");
    }

    public static void printTriangle(int size) {
        // 40.2
        for(int i = 1; i <= size; i++){
            printWhitespaces(size-i);
            printStars(i);
            
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        for(int i = 1; i <= height ; i++){
            printWhitespaces(height-i);
            printStars(i + i-1);
            
        }
        int x = height - 2;
        printWhitespaces(x);
        printStars(3);
        printWhitespaces(x);
        printStars(3);
        
    
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
