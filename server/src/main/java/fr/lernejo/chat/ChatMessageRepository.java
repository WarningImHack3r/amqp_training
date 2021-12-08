package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChatMessageRepository {
	void addChatMessage(String message) {}

	List<String> getLastTenMessages() {
		return List.of();
	}
}
