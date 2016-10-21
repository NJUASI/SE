package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TextFieldTest extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//����GridPane����
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(10,10,10,10));
			grid.setVgap(5);
			grid.setHgap(5);
			
			//����Name Text Field
			final TextField name = new TextField();
			name.setPromptText("Enter your first name.");
			GridPane.setConstraints(name, 0, 0);
			grid.getChildren().add(name);
			
			//����Last Name Text Field
			final TextField lastName = new TextField();
			lastName.setPromptText("Enter your last name.");
			GridPane.setConstraints(lastName, 0, 1);
			grid.getChildren().add(lastName);
			
			//����Comment Text Field
			final TextField comment = new TextField();
			comment.setPromptText("Enter your comments");
			GridPane.setConstraints(comment, 0, 2);
			grid.getChildren().add(comment);
			
			//����Submit Button
			Button submit = new Button("Submit");
			GridPane.setConstraints(submit, 1, 0);
			grid.getChildren().add(submit);
			
			//����Clear Button
			Button clear = new Button("Clear");
			GridPane.setConstraints(clear, 1, 1);
			grid.getChildren().add(clear);
			
			//���һ��Label
			final Label label = new Label();
			GridPane.setConstraints(label, 0, 3);
			GridPane.setColumnSpan(label, 2);
			grid.getChildren().add(label);
			
			submit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					if(comment.getText()!=null&&!comment.getText().isEmpty())
					{
						label.setText(name.getText()+" "+lastName.getText()+","
								+"thank you for your comment!");
					}
					else
					{
						label.setText("You have not left a comment");
					}
				}
			});
			
			clear.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					// TODO �Զ����ɵķ������
					name.clear();
					lastName.clear();
					comment.clear();
					label.setText(null);
				}
				
			});
			
			
			StackPane myPane = new StackPane();
			myPane.getChildren().add(grid);
			
			Scene myScene = new Scene(myPane);
			primaryStage.setScene(myScene);
			primaryStage.setWidth(800);
			primaryStage.setHeight(600);
			primaryStage.setResizable(false);
			
			
			primaryStage.setTitle("�������Ƶ�Ԥ��ϵͳ");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
