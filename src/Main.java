import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account a = new Account("Roma", "12345", 1000);
        String result = "";
        menuAccount:
        while (!result.equals("stop")) {
            System.out.println("Please to input your login : ");
            result = scanner.nextLine();
            if (result.equals(a.name)) {
                System.out.println("Please to input your password : ");
                result = scanner.nextLine();
                if (result.equals(a.password)) {
                    System.out.println("You are logged in : " + a.name);
                    menu:
                    while (!result.equals("stop")) {
                        Actions.Menu();
                        int result1 = scanner.nextInt();
                        if (result1 == 1) {
                            menuList:
                            while (!result.equals("stop")) {
                                Actions.ListMenu();
                                int result2 = scanner.nextInt();
                                if (Actions.list.isEmpty()) {
                                    Product a1 = new Product("Clothes", "trousers", 200);
                                    Product a2 = new Product("Clothes", "T-Shirt", 250);
                                    Product a3 = new Product("Sport", "Football ball", 500);
                                    Product a4 = new Product("Sport", "Basketball ball", 1050);
                                    Actions.addList(a1);
                                    Actions.addList(a2);
                                    Actions.addList(a3);
                                    Actions.addList(a4);
                                }
                                if (result2 == 1) {
                                    Actions.ShowList("Clothes");
                                    Actions.ActionsListMenu();
                                    int result3 = scanner.nextInt();
                                    if (result3 == 0) {
                                        continue menu;
                                    } else if (result3 == 1) {
                                        try {
                                            System.out.print("Введіть id product : ");
                                            int result4 = scanner.nextInt();
                                            if ((Actions.equalIndex(result4).Thing != ("Clothes"))) {
                                                System.out.println("We don't have some product with this ID !!! ");
                                            } else {
                                                Actions.addCart(result4);
                                                System.out.println("ID : " + result4);
                                            }
                                        } catch (Exception s) {
                                            System.out.println("You inputted wrong ID for product !!!");
                                        }

                                    } else if (result3 == 2) {
                                        continue menuList;
                                    }
                                }
                                if (result2 == 2) {
                                    Actions.ShowList("Gadget");
                                    Actions.ActionsListMenu();
                                    int result3 = scanner.nextInt();
                                    if (result3 == 0) {
                                        continue menu;
                                    } else if (result3 == 1) {
                                        try {
                                            System.out.print("Введіть id product : ");
                                            int result4 = scanner.nextInt();
                                            if ((Actions.equalIndex(result4).Thing != ("Gadget"))) {
                                                System.out.println("We don't have some product with this ID !!! ");
                                            } else {
                                                Actions.addCart(result4);
                                                System.out.println("ID : " + result4);
                                            }
                                        } catch (Exception s) {
                                            System.out.println("You inputted wrong ID for product !!!");
                                        }
                                    } else if (result3 == 2) {
                                        continue menuList;
                                    }
                                }
                                if (result2 == 3) {
                                    Actions.ShowList("Food");
                                    Actions.ActionsListMenu();
                                    int result3 = scanner.nextInt();
                                    if (result3 == 0) {
                                        continue menu;
                                    } else if (result3 == 1) {
                                        try {
                                            System.out.print("Введіть id product : ");
                                            int result4 = scanner.nextInt();
                                            if ((Actions.equalIndex(result4).Thing != ("Food"))) {
                                                System.out.println("We don't have some product with this ID !!! ");
                                            } else {
                                                Actions.addCart(result4);
                                                System.out.println("ID : " + result4);
                                            }
                                        } catch (Exception s) {
                                            System.out.println("You inputted wrong ID for product !!!");
                                        }
                                    } else if (result3 == 2) {
                                        continue menuList;
                                    }
                                } else if (result2 == 4) {
                                    Actions.ShowList("Sport");
                                    Actions.ActionsListMenu();
                                    int result3 = scanner.nextInt();
                                    if (result3 == 0) {
                                        continue menu;
                                    } else if (result3 == 1) {
                                        try {
                                            System.out.print("Введіть id product : ");
                                            int result4 = scanner.nextInt();
                                            if ((Actions.equalIndex(result4).Thing != ("Sport"))) {
                                                System.out.println("We don't have some product with this ID !!! ");
                                            } else {
                                                Actions.addCart(result4);
                                                System.out.println("ID : " + result4);
                                            }
                                        } catch (Exception s) {
                                            System.out.println("You inputted wrong ID for product !!!");
                                        }
                                    } else if (result3 == 2) {
                                        continue menuList;
                                    }
                                } else if (result2 == 0) {
                                    continue menu;
                                }
                            }
                        } else if (result1 == 0) {
                            continue menu;
                        } else if (result1 == 2) {
                            System.out.print("Enter the sum for which you want to top up the account : ");
                            int sum = scanner.nextInt();
                            a.balance += sum;
                            continue menu;
                        } else if (result1 == 3) {
                            Actions.ShowCart();
                            Actions.BuyMenu();
                            int result2 = scanner.nextInt();
                            if (result2 == 0) {
                                continue menu;
                            } else if (result2 == 1) {
                                Actions.buyThings(Actions.cart, a);
                            }
                        } else if (result1 == 4) {
                            System.out.println("Name : " + a.name);
                            System.out.println("Money : " + a.balance);
                            continue menu;
                        } else if (result1 == 5) {
                            break menuAccount;
                        }
                    }
                }
            } else if (!result.equals(a.name)) {
                result = scanner.nextLine();
                if (!result.equals(a.password)) {
                    System.out.println("Incorrect login or password");
                }
            }
        }

    }
}
