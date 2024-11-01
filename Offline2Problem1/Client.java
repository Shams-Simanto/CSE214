import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<Component> menuItems = new ArrayList<>();

        menuItems.add(new Food("Burger", 300));
        menuItems.add(new Food("Fries", 100));
        menuItems.add(new Food("Wedges", 150));
        menuItems.add(new Food("Shawarma", 200));
        menuItems.add(new Food("Drink", 25));

        Combo combo1 = new Combo("Combo1", 400);
        combo1.add(new Food("Burger", 300));
        combo1.add(new Food("Fries", 100));
        combo1.add(new Food("Drink", 25));
        menuItems.add(combo1);

        Combo combo2 = new Combo("Combo2", 215);
        combo2.add(new Food("Shawarma", 200));
        combo2.add(new Food("Drink", 25));
        menuItems.add(combo2);

        System.out.println("Menu:");
        System.out.println();

        for (var item : menuItems) {
            item.show();
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to create a combo, 2 to view menu, and 0 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;

            if (choice == 2) {
                for (var item : menuItems) {
                    item.show();
                }
                continue;
            }

            if (choice == 1) {
                Integer price = 0;
                System.out.println("Enter the name of the combo:");
                String comboName = scanner.nextLine();
                Combo customCombo = new Combo(comboName);
                List<Component> c = new ArrayList<>();
                Integer d=0, i=0;
                List<String> free= new ArrayList<>();

                while (true) {
                    System.out.println(
                            "Available commands: Add [item]\n Remove [item]\n Free [item]\n Discount [percentage]\n Done");
                    String command = scanner.nextLine();
                    String[] parts = command.split(" ", 2);
                    String action = parts[0];
                    String item = parts.length > 1 ? parts[1] : "";

                    if (action.equalsIgnoreCase("Done"))
                        break;

                    switch (action) {
                        case "Add":
                            Component menuItemToAdd = menuItems.stream()
                                    .filter(m -> m.getName().contains(item)).findFirst().orElse(null);
                            if (menuItemToAdd != null)
                                customCombo.add(menuItemToAdd);
                            else
                                System.out.println("Item not found!");
                            price += menuItemToAdd.getPrice();
                            customCombo.price = price;
                            break;
                        case "Remove":
                            Component menuItemToRemove = menuItems.stream()
                                    .filter(m -> m.getName().contains(item)).findFirst().orElse(null);
                            if (menuItemToRemove != null)
                                customCombo.remove(menuItemToRemove);
                            else
                                System.out.println("Item not in combo!");
                            price -= menuItemToRemove.getPrice();
                            customCombo.price = price;
                            break;
                        case "Free":
                            Component freeItem = menuItems.stream()
                                    .filter(m -> m.getName().contains(item)).findFirst().orElse(null);

                            if (freeItem != null) {
                                // Wrap the custom combo in a FreeDecorator, ensuring freeItem is applied
                                c.add(new FreeDecorator(customCombo, freeItem));
                                free.add(freeItem.getName());
                            } else {
                                System.out.println("Item not found!");
                            }
                            break;

                        case "Discount":
                            int discount = Integer.parseInt(item);
                            // price = customCombo.price;
                            c.add(new DiscountedDecorator(customCombo, discount));
                            price = customCombo.getPrice();
                            d+=discount;
                            break;
                    }
                }

                System.out.println();
                for(var item: c) customCombo.add(item);
                //menuItems.add(customCombo);
                System.out.println("Your Combo: ");
                System.out.println(customCombo.name);
                System.out.println();
                Combo last= new Combo(comboName);
                for (var item : customCombo.children) {
                    // Check if the item is not an instance of DiscountedDecorator before adding
                    item.show();
                    if (!(item instanceof DiscountedDecorator) && !(item instanceof FreeDecorator)) {
                        last.add(item);
                    }
                }                
                for (String freeItemName : free) {
                    Component freeFood = new Food(freeItemName, 0); // Create a Food item with 0 price
                    last.add(freeFood); // Add free item to the last combo
                }
                last.price=(customCombo.price-(d*customCombo.price/100));
                menuItems.add(last);

                System.out.println();

               
            }
        }

        scanner.close();
    }
}
