package phoneBook;

/*
Задание 1.
Напишите приложение «Телефонный справочник», используя HashMap:

В качестве ключа коллекция принимает значение «Имя и Фамилия», а в качестве значения коллекции — номер телефона.

Добавьте 20 произвольных значений в мапу, выведите все значения в консоль.

Критерии проверки
Создан новый класс.
Создан HashMap, который хранит в ключе имя и фамилию, в значении — номер телефона.
Добавлены 20 произвольных значений в HashMap.
Все значения выведены в консоль.
 */

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1.Задание 1.");
        Phone phone1 = new Phone("Presley Powell", "+79257854547");
        Phone phone2 = new Phone("Milo Sanchez", "+79165245541");
        Phone phone3 = new Phone("Silas Perez", "+79227895214");
        Phone phone4 = new Phone("Brittany Flores", "+79345688774");
        Phone phone5 = new Phone("Lia Foster", "+79257854247");
        Phone phone6 = new Phone("Cassandra Jackson", "+79278854547");
        Phone phone7 = new Phone("Remington Ward", "+79257832547");
        Phone phone8 = new Phone("Uta Mitchell", "+79253354547");
        Phone phone9 = new Phone("Varun Clark", "+79257124547");
        Phone phone10 = new Phone("Novalee Wilson", "+79255554547");
        Phone phone11 = new Phone("Bethany Bennett", "+79266854547");
        Phone phone12 = new Phone("Nikolas Simmons", "+79258754547");
        Phone phone13 = new Phone("Liana Phillips", "+79257414547");
        Phone phone14 = new Phone("Donovan Taylor", "+79257164547");
        Phone phone15 = new Phone("Giancarlo Scott", "+79251854547");
        Phone phone16 = new Phone("Umeko Ramirez", "+79257851547");
        Phone phone17 = new Phone("Vince Miller", "+79257852247");
        Phone phone18 = new Phone("Fern Perry", "+79257811547");
        Phone phone19 = new Phone("Roman Perez", "+79257564547");
        Phone phone20 = new Phone("Aurora Cox", "+79257899547");
        List<Phone> phones = List.of(phone1,
                phone2,
                phone3,
                phone4,
                phone5,
                phone6,
                phone7,
                phone8,
                phone9,
                phone10,
                phone11,
                phone12,
                phone13,
                phone14,
                phone15,
                phone16,
                phone17,
                phone18,
                phone19,
                phone20);
        for (Phone phone : phones) {
            PhoneBook.addPhone(phone);
        }
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(PhoneBook.getPhoneBook().values());
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("********************************************");
    }
}