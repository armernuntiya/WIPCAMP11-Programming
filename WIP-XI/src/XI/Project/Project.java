package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class Project {

    public static void main(String[] args) {
        int item = 11, limit = 10, menu;
        System.out.println("item : " + item);
        System.out.println("limit : " + limit);
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Check");
        Scanner input = new Scanner(System.in);
        menu = input.nextInt();
        if (menu == 1) {
            if (item > limit) {
                System.out.println("ไอเทมเต็มแล้ว");
            } else {
                int amount;
                amount = input.nextInt();
                if (menu + amount > limit) {
                    System.out.println("ไอเทมเกินลิมิด");
                } else {
                    item = item + amount;
                    System.out.println("item : " + item);
                    System.out.println("limit : " + limit);
                }
            }
        } else if (menu == 2) {
            if (item <= 0) {
                System.out.println("ไม่มีไอเทมในโกดัง");
            } else {
                int amount;
                amount = input.nextInt();
                if (item - amount < 0) {
                    System.out.println("ไอเทมไม่เพียงพอให้ลบ");
                } else {
                    item = item - amount;
                    System.out.println("item : " + item);
                    System.out.println("limit : " + limit);

                }
            }
        } else if (menu == 3) {
            System.out.println("item : " + item);
            System.out.println("limit : " + limit);
        } else {
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }
}
