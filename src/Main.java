// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialАccount = 100    ;
        int depositAmount = 1500;

        int bonus;
        if (depositAmount > 1000) {
             bonus = depositAmount/100;
        } else {
             bonus = 0;
        }

        int finalCore;
            finalCore = initialАccount + depositAmount + bonus;



        System.out.println("Итоговый счет:" + finalCore);
        System.out.println("Количество начисленных бонусов:" + bonus);

    }
}