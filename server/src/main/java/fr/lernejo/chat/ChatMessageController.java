package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record ChatMessageController(ChatMessageRepository repository) {

	@GetMapping("/api/message")
	public Iterable<String> getLastTenMessages() {
		return repository.getLastTenMessages();
	}
}
