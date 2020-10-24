package com.egehurturk;

public class Main {

    public static void main(String[] args) {
        // DesktopPhone ds = new DesktopPhone(123456);
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
    }
}

// We can't instintiate iterfaces:
//     ITelephon it = new Itelephon(123456) WRONG