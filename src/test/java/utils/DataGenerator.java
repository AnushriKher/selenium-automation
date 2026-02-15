package utils;

import java.util.Random;

public class DataGenerator {
	public static String generateEmail() {
        return "user" + System.currentTimeMillis() + "@testmail.com";
    }

    public static String generatePassword() {
        return "Test@" + new Random().nextInt(10000);
    }

    public static String generateUsername() {
        return "User" + new Random().nextInt(10000);
    }

}
