package fr.lyrgard.hexScape.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoMessage extends AbstractPlayerMessage {

	private String message;

	
	@JsonCreator
	public InfoMessage(
			@JsonProperty("playerId") String playerId, 
			@JsonProperty("message") String message) {
		super(playerId);
		this.message = message;
	}



	public String getMessage() {
		return message;
	}
}
