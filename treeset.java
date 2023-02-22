import java.util.*;

class treeset {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add   2.Remove    3.View    4.Exit");
            System.out.print("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.print("Enter an element: ");
                    String element = sc.next();
                    ts.add(element);
                    System.out.println("Element added successfully!!");
                }
                    break;
                case 2: {
                    System.out.print("Enter an element: ");
                    String element = sc.next();
                    if (ts.contains(element)) {
                        ts.remove(element);
                        System.out.println("Element Deleted successfully.");
                    } else {
                        System.out.println("Element not found.");
                    }
                }
                    break;
                case 3: {
                    System.out.println(ts);
                }
                    break;
                case 4: {
                    System.exit(0);
                }
                    break;
                default:
                    System.out.println("Enter the valid choice!!.");
                    break;
            }
        }
    }
}