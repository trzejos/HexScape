package fr.lyrgard.hexScape.message;

public class MarkerPlacedMessage extends AbstractMarkerMessage {

	public MarkerPlacedMessage(String playerId, String gameId, String cardId, String markerId, int number) {
		super(playerId, gameId, cardId, markerId, number);
	}

}