import java.util.Scanner;

public class L1Q9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the flower: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of petals: ");
        int petals = sc.nextInt();
        System.out.print("Enter the price: ");
        float price = sc.nextFloat();
        Flower f = new Flower(name, petals, price);
        System.out.println("The name of the flower is: "+f.getName());
        System.out.println("The number of petals is: "+f.getPetals());
        System.out.println("The price is: "+f.getPrice());
        System.out.println("Enter 1 to change the name of the flower");
        System.out.println("Enter 2 to change the number of petals");
        System.out.println("Enter 3 to change the price");
        System.out.println("Enter 4 to exit");
        int choice = sc.nextInt();
        while (choice!=4)
        {
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the new name of the flower: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    f.setName(name);
                    System.out.println("The name of the flower is: "+f.getName());
                    break;
                case 2:
                    System.out.print("Enter the new number of petals: ");
                    petals = sc.nextInt();
                    f.setPetals(petals);
                    System.out.println("The number of petals is: "+f.getPetals());
                    break;
                case 3:
                    System.out.print("Enter the new price: ");
                    price = sc.nextFloat();
                    f.setPrice(price);
                    System.out.println("The price is: "+f.getPrice());
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Enter 1 to change the name of the flower");
            System.out.println("Enter 2 to change the number of petals");
            System.out.println("Enter 3 to change the price");
            System.out.println("Enter 4 to exit");
            choice = sc.nextInt();
        }
    }
}

class Flower {
    private String name;
    private int petals;
    private float price;
    public Flower(String name, int petals, float price)
    {
        this.name=name;
        this.petals=petals;
        this.price=price;
    }
    public String getName()
    {
        return name;
    }
    public int getPetals()
    {
        return petals;
    }
    public float getPrice()
    {
        return price;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPetals(int petals)
    {
        this.petals=petals;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
}
