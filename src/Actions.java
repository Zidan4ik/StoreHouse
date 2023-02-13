import javax.swing.*;
import java.util.ArrayList;

public class Actions {

    static ArrayList<Product> list = new ArrayList<>();
    static ArrayList cart= new ArrayList();
    public static void addList(Product object) {
        list.add(object);
    }
    public static void ShowList(String view){
        for(Product l : list){
            if(view==l.Thing){
                System.out.println(l);
            }
        }
    }
    public static Product equalIndex(int ID){
        for(Product l : list){
            if(l.Id==ID ){
               return l;
            }

        }
        return null;
    }
    public static void addCart(int ID){
        cart.add(equalIndex(ID));
        list.remove(equalIndex(ID));
    }
    public static void ShowCart(){
        for(Object l : Actions.cart){
            System.out.println(l);
        }
    }


    public static void buyThings(ArrayList<Product> list, Account person) {
               for (Product l : list) {
                    double money=person.balance;
                    money-=l.Price;
                    if(money<0){
                        System.out.println("You don't have enough money in your balance");
                    }
                    else{
                        person.balance-=l.Price;
                        list.remove(l);
                        break;
                    }
               }


    }
    public static void Menu(){
        int a1=1,a2=2,a3=3,a4=4,a5=5,a6=6;
        System.out.println("         Menu    ");
        System.out.println("(" +a1 +")" +"->See the list of products");
        System.out.println("(" +a2 +")" +"->Top up the balance");
        System.out.println("(" +a3 +")" +"->Buy things");
        System.out.println("(" +a4 +")" +"->Personal data");
        System.out.println("(" +a5 +")" +"->Sign out of the account");


    }
    public static void ListMenu() {
        int a1 = 1, a2 = 2, a3 = 3, a4 = 4 , a5=0;
        System.out.println("         Menu     ");
        System.out.println("(" + a1 + ")" + "->Clothing list");
        System.out.println("(" + a2 + ")" + "->List of gadgets");
        System.out.println("(" + a3 + ")" + "->Food list");
        System.out.println("(" + a4 + ")" + "->List of sporting things");
        System.out.println("(" + a5 + ")" + "->Back to Menu");
    }
    public static void ActionsListMenu(){
        int a1 = 0, a2 = 1, a3 = 2;
        System.out.println("(" + a1 + ")" + "->Menu");
        System.out.println("(" + a2 + ")" + "->Add to cart");
        System.out.println("(" + a3 + ")" + "->See the list of products");
    }
    public static void BuyMenu(){
        int a1=0,a2=1;
        System.out.println("(" + a1 + ")" + "->Menu");
        System.out.println("(" + a2 + ")" + "->Buy");
    }
}
