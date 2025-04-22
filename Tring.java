import java.util.Scanner;

class Tring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();  // Number of nodes in the ring

        int token = 0;  // Initializing token at node 0

        System.out.println("Nodes in the ring: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        try {
            while (true) {
                System.out.print("Enter sender: ");
                int s = sc.nextInt();

                System.out.print("Enter receiver: ");
                int r = sc.nextInt();

                System.out.print("Enter Data: ");
                String d = sc.next();

                // Token Passing
                System.out.print("Token passing: ");
                for (int i = token; (i % n) != s; i = (i + 1) % n) {
                    System.out.print(i + " -> ");
                }
                System.out.println(s);

                // Sending Data
                System.out.println("Sender " + s + " sending data: " + d);

                // Data Forwarding
                for (int i = (s + 1) % n; i != r; i = (i + 1) % n) {
                    System.out.println("Data forwarded by " + i);
                }

                // Data Received
                System.out.println("Receiver " + r + " received data: " + d);

                // Update token position
                token = s;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
