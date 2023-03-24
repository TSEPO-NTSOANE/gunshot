package noone.myasss;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
 private ColorPicker colorPicker;
 @FXML
 private Label EnterTittle;
 @FXML
 private ImageView NavImage;
 @FXML
 private ImageView NavImage1;
 @FXML
 private Label EnterHome;
 @FXML
 private Label EnterContact;
 
 @FXML
 private Label EnterAbout;
 
 @FXML
 private TextField EnterTittleLabel;
 @FXML
 private TextField EnterHomeLabel;
 @FXML
 private TextField EnterContactLabel;
 @FXML
 private TextField EnterAboutLabel;
 @FXML
 private HBox NavBar;
 @FXML
 private HBox Tittle;
 
 @FXML
 private Button Background;
  @FXML
 private Pane root;
  
 private Label label;
 private Label label1;
 private Label label0;
 private Label label3;
 
 @FXML
 void ImageChooserFile(ActionEvent event){
     FileChooser fc = new FileChooser();
     fc.getExtensionFilters().add(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
     File f = fc.showOpenDialog(null);
     if(f != null){
         NavImage.setImage(new Image(f.toURI().toString()));
         NavImage.setFitHeight(120);
         NavImage.setFitWidth(150);
     }
 }
  @FXML
 void ImageChooserFile1(ActionEvent event){
     FileChooser fc = new FileChooser();
     fc.getExtensionFilters().add(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
     File f = fc.showOpenDialog(null);
     if(f != null){
         NavImage1.setImage(new Image(f.toURI().toString()));
         NavImage1.setFitHeight(350);
         NavImage1.setFitWidth(350);
     }
 }
 @FXML
  void addLabel(ActionEvent event) {
      
        String labelText = EnterHomeLabel.getText();
        String labelText1 = EnterContactLabel.getText();
        String labelText2 = EnterAboutLabel.getText();
        String TittleWeb = EnterTittleLabel.getText();
        
        if(EnterHomeLabel.getText().isEmpty() || EnterContactLabel.getText().isEmpty() || 
                EnterAboutLabel.getText().isEmpty() || EnterTittleLabel.getText().isEmpty() ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid input");
            alert.setContentText("Please enter valid input");

alert.showAndWait();  
        }else{
        label = new Label(labelText);
         label0 = new Label(labelText1);
         label1 = new Label(labelText2);
         label3 = new Label(TittleWeb);
        Insets padding = new Insets(10);
        BackgroundFill fill = new BackgroundFill(Color.YELLOW, null, null);
        Background background = new Background(fill);
        label.setBackground(background);
        label0.setBackground(background);
        label1.setBackground(background);
        label.setPadding(padding);
        label0.setPadding(padding);
        label1.setPadding(padding);
        
         EnterHomeLabel.setText("");
        EnterContactLabel.setText("");
        EnterAboutLabel.setText("");
        EnterTittleLabel.setText("");
        NavBar.getChildren().addAll(label,label0,label1);
        NavBar.setSpacing(10);
        NavBar.setAlignment(Pos.CENTER);
        Tittle.getChildren().add(label3);
        Tittle.setAlignment(Pos.CENTER);
        }
    }
  @FXML
  void Background(ActionEvent event){
       root.setStyle("-fx-background-color: " + colorPicker.getValue().toString().replace("0x", "#") + ";");
  }
  @FXML
  void Background1(ActionEvent event){
       NavBar.setStyle("-fx-background-color: " + colorPicker.getValue().toString().replace("0x", "#") + ";");
  }
  
  @FXML
private void increaseFontSize(ActionEvent event) {
    double currentSize = label.getFont().getSize();
    label.setFont(new Font(currentSize + 2));
    label0.setFont(new Font(currentSize + 2));
    label1.setFont(new Font(currentSize + 2));
    
}
@FXML
private void decreaseFontSize(ActionEvent event) {
    double currentSize = label.getFont().getSize();
    label.setFont(new Font(currentSize - 2));
    label0.setFont(new Font(currentSize - 2));
    label1.setFont(new Font(currentSize - 2));
    
}
@FXML
private void decreaseFontSize1(ActionEvent event) {
    double currentSize1 = label.getFont().getSize();
    label3.setFont(new Font(currentSize1 - 2));  
}
@FXML
private void increaseFontSize1(ActionEvent event) {
    double currentSize1 = label.getFont().getSize();
    label3.setFont(new Font(currentSize1 + 2));  
}
@FXML
private void changeFontColor(ActionEvent event) {
    Color selectedColor = colorPicker.getValue();
    label.setTextFill(selectedColor);
    label0.setTextFill(selectedColor);
    label1.setTextFill(selectedColor);
    
}
@FXML
private void bgChange(ActionEvent event){
    label.setStyle("-fx-background-color: " + colorPicker.getValue().toString().replace("0x", "#") + ";");

}
 @FXML
private void bgChange1(ActionEvent event){
    label1.setStyle("-fx-background-color: " + colorPicker.getValue().toString().replace("0x", "#") + ";");

}
@FXML
private void bgChange2(ActionEvent event){
    label0.setStyle("-fx-background-color: " + colorPicker.getValue().toString().replace("0x", "#") + ";");

}
}
