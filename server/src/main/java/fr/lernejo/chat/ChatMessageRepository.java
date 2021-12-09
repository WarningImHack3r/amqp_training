package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {
	private final List<String> messages;

	public ChatMessageRepository() {
		messages = new ArrayList<>();
	}

	void addChatMessage(String message) {
		messages.add(message);
	}

	List<String> getLastTenMessages() {
		return messages.subList(Math.max(0, messages.size() - 10), messages.size());
	}
}
