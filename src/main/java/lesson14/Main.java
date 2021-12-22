package lesson14;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date startDate = new Date();
        String[] number = {"123-123-123", "456-456-456", "789-789-789", "012-012-012", "345-345-345"};
        int chooseNumber = number.length;
        int randomNumber = (int) (Math.random() * chooseNumber);
        String random = number[randomNumber];
        Addresses addresses = new Addresses();
        addresses.addRecord("123-123-123", "Василий Васильевич Васильев", "г. Москва");
        addresses.addRecord("456-456-456", "Антон Антонович Антонов", "г. Ангарск");
        addresses.addRecord("789-789-789", "Эдуард Эдуардович Эдуардов", "г. Березнеки");
        addresses.addRecord("012-012-012", "Артем Артемович Артемов", "г. Елец");
        addresses.addRecord("345-345-345", "Петр Петрович Петров", "г. Саратов");
        System.out.println(addresses.allRecords());
        Date endDate = new Date();
        long time = endDate.getTime() - startDate.getTime();
        System.out.println("Самым популярным номером является: " + random);
        System.out.println("Время выполнения: " + time + " мс");
    }
}