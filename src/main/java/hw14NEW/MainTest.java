package hw14NEW;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int capacity = 100;
        System.out.println("!Запрос с применением коллекций!");
        List<TelephoneBook> book = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            int phoneNumber = (int) (Math.random() * 999_99_99);
            String fio = "Петров Петр Петрович" + i;
            book.add(new TelephoneBook(fio, phoneNumber));
        }

        Random randomPhone = new Random();
        ListIterator<TelephoneBook> bookIterator = book.listIterator();

        while (bookIterator.hasNext()) {
            List<Integer> associatesPhones = new ArrayList<>();
            TelephoneBook abonent = bookIterator.next();
            for (int i = 0; i < capacity; i++) {
                if (randomPhone.nextBoolean() && book.get(i).getPhoneNumber() != abonent.getPhoneNumber()) {
                    associatesPhones.add(book.get(i).getPhoneNumber());
                    abonent.setAssociatePhone(associatesPhones);
                }
            }
        }

        System.out.println("Запрос на самые популярные номера... ");
        for (TelephoneBook j : book) {
            int frequency = 0;
            for (TelephoneBook k : book) {
                for (Integer i : k.getAssociatePhone()) {
                    if (j.getPhoneNumber() == i) frequency += 1;
                }
                j.setFrequency(frequency);
            }
        }
        System.out.println("Обработка... ");
        Collections.sort(book);

        System.out.println("Десять наиболее популярных номеров: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(book.get(i));
        }

        System.out.println("---------------------------------------");
        System.out.println("Время выполнение:  " + (System.currentTimeMillis() - time) / 1000);

        System.out.println("");
        System.out.println("!Запрос без применения коллекций!");
        time = System.currentTimeMillis();
        TelephoneBook[] book2 = new TelephoneBook[capacity];

        for (int i = 0; i < capacity; i++) {
            int phoneNumber = (int) (Math.random() * 999_99_99);
            String fio = "Иванов Иван Иванович" + i;
            book2[i] = new TelephoneBook(fio, phoneNumber);
        }

        for (TelephoneBook j : book2) {
            Integer[] associatesPhones2 = new Integer[capacity];
            TelephoneBook abonent2 = j;
            for (int i = 0; i < capacity; i++) {
                associatesPhones2[i] = 0;
                if (randomPhone.nextBoolean() && book2[i].getPhoneNumber() != abonent2.getPhoneNumber()) {
                    associatesPhones2[i] = book2[i].getPhoneNumber();
                    abonent2.setAssociatePhone2(associatesPhones2);
                }
            }
        }

        System.out.println("Запрос на самые популярные номера... ");
        for (TelephoneBook j : book2) {
            int frequency = 0;
            for (TelephoneBook k : book2) {
                for (Integer i : k.getAssociatePhone2()) {
                    if (j.getPhoneNumber() == i) frequency = frequency + 1;
                }
                j.setFrequency(frequency);
            }
        }

        System.out.println("Обработка... ");
        Arrays.sort(book2, new Comparator<TelephoneBook>() {
            @Override
            public int compare(TelephoneBook o1, TelephoneBook o2) {
                return o2.getFrequency() - o1.getFrequency();
            }
        });

        System.out.println("Десять наиболее популярных номеров: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(book2[i]);
        }

        System.out.println("---------------------------------------");
        System.out.println("Время выполнение:  " + (System.currentTimeMillis() - time) / 1000);

    }
}
