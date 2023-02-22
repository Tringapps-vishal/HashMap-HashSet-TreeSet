import java.util.*;
class Hashmap{
  public static void main(String args[])
  {
    HashMap<Integer, String> hm=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      System.out.println("1.Add   2.Remove    3.View    4.Exit");
      int ch = sc.nextInt();
      switch(ch)
      {
        case 1:{
        System.out.print("Enter the key :");
        int key=sc.nextInt();
        System.out.print("Enter the value:");
        String value=sc.next();
        hm.put(key,value);
        System.out.println("Item added successfully!!");}
        break;
        case 2:{
        System.out.print("Enter the key :");
        int key=sc.nextInt();
        if (hm.containsKey(key))
        {
        hm.remove(key);
        System.out.println("Item removed successfully!!");
        }
        else
        System.out.println("Item not found!!");
        }
        break;
        case 3:
        System.out.println("Item's in HashMap : \t"+hm);
        break;
        case 4:
        System.exit(0);
        break;
        default:
        System.out.println("Enter a valid choice!!");
      }
    }
  }
}