package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new HashMap<>(20);

    public static void addPhone(Phone phone) {
        phoneBook.put(phone.getName(), phone.getNumber());
    }

    public static Map<String, String> getPhoneBook() {
        return phoneBook;
    }
}
