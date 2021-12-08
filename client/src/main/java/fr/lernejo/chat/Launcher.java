package fr.lernejo.chat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message;
		do {
			System.out.println("Input a message, we will sent it for you (q for quit)");
			message = scanner.nextLine();
			System.out.print("Message sent. ");
		} while (!(message.equals("q") || message.equals("quit")));
	}
}
