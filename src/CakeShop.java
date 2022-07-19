import java.time.LocalDate;

public class CakeShop {

    public static void main(String[] args) {

        OrderSystem system = new OrderSystem();
        Menu menu = new Menu();
        String today = String.valueOf(LocalDate.now().getDayOfWeek());


        if (today.equals("MONDAY") || today.equals("TUESDAY")) {
            menu.closedMessage();
        } else {
            menu.welcomeMessage();
            menu.printDaysMenu();
            menu.getOrderStarted();

            while(true) {
                menu.getOrderSelection();
                String orderType = menu.getOrderType();


                }
            }
        }
    }
