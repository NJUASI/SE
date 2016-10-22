	import java.awt.*;



import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;
	 
	 
	public class HelloWorld extends Application {
	 
	   @Override
	   public void start(Stage stage) {
	     
	       SplitPane mainWin = new SplitPane();
	       
	       Button btGuest = new Button("客户");
	       btGuest.setLayoutX(10);
	       btGuest.setLayoutY(15);
	       btGuest.setPrefSize(100, 100);

	       Button btHotel = new Button("酒店");
	       btHotel.setLayoutX(20);
	       btHotel.setLayoutY(150);
	       btHotel.setPrefSize(80, 50);

	       Button btOrder = new Button("订单");
	       btOrder.setLayoutX(20);
	       btOrder.setLayoutY(250);
	       btOrder.setPrefSize(80, 50);

	       Button btMember = new Button("会员");
	       btMember.setLayoutX(20);
	       btMember.setLayoutY(350);
	       btMember.setPrefSize(80, 50);
	       
	       Button btCredit = new Button("信用");
	       btCredit.setLayoutX(20);
	       btCredit.setLayoutY(450);
	       btCredit.setPrefSize(80, 50);
	       
	       StackPane child1 = new StackPane();
	       
	       StackPane child2 = new StackPane();
	       
	        mainWin.getItems().addAll(child1, child2);
	        mainWin.setDividerPosition(0,0.15);

	      Pane left =new Pane();


	      left.getChildren().addAll(btGuest,btOrder,btHotel,btMember,btCredit);
	         child1.getChildren().add(left);
	       
	   
	       Scene scene1 = new Scene(mainWin,800,600);
//	  
	       
	            stage.setTitle("");
	   	       stage.setScene(scene1);
	   	       stage.show();
	        
	   }
	 
	   public static void main(String[] args) {
	       launch(args);
	   }
	}