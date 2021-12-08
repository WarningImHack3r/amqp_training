package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public record ChatMessageListener(ChatMessageRepository repository) {

	void onMessage(String message) {
		repository.addChatMessage(message);
	}
}
