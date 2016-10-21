package application;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;

public class MouseEnteredEventHandler implements EventHandler<Event>{

	Node node;
	
	public MouseEnteredEventHandler(Node node) {
		this.node = node;
	}
	
	@Override
	public void handle(Event event) {
		// TODO 自动生成的方法存根
		node.setEffect(new DropShadow());
	}
	
}
