package application;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;

public class MouseExitEventHandler implements EventHandler<Event>{

	Node node;
	
	public MouseExitEventHandler(Node node) {
		this.node = node;
	}
	
	@Override
	public void handle(Event event) {
		node.setEffect(null);
	}

}
