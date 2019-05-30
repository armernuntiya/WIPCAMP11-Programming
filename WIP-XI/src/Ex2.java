/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

/**
 *
 * @author wipcamp11
 */
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ค่าอาหาร" );
        int x = input.nextInt();
        System.out.println("บัตรสมาชิก" );
        boolean y = input.nextBoolean();
        System.out.println("จ่ายเงินสดไหม" );
        boolean z = input.nextBoolean();
        if(y) x = x*95/100;
        if(z) x = x*90/100;
        System.out.println(x);
    }
    
}
