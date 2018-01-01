package games.grizzlylandon;

import com.github.javafaker.Faker;

public class Main {

	private static Faker faker = new Faker();

	public static void main(String[] args) {
		System.out.println("Hello " + faker.name().firstName() + "!");
	}
}