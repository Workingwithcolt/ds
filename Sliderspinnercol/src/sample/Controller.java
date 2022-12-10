package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private CheckBox ourcheckbox;
    @FXML
    private Button hellowButton;
    @FXML
    private Label ourLabel;
    @FXML
    private Button byeButton;
    public void initialize(){
        hellowButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    public void onButtonClicked(ActionEvent e){
        if(e.getSource().equals(hellowButton)){
            System.out.println("Hellow, "+nameField.getText());
        }else if(e.getSource().equals(byeButton)){
            System.out.println("Bye ,"+nameField.getText());
        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(10000);
                    ourLabel.setText("We did somethings");
                }catch (InterruptedException event){

                }
            }
        };
        new Thread(task).start();
//        try{
//            Thread.sleep(10000);
//        }
//        catch (InterruptedException event){
//
//        }
        if(ourcheckbox.isSelected()){
            nameField.clear();
            hellowButton.setDisable(true);
        }
    }
    @FXML
    public void handlekeyReleased(){
        String text = nameField.getText();
        boolean disableButton = text.isEmpty();
        hellowButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }
    public void handleChange(){
        System.out.println("The checkbox is go selected "+(ourcheckbox.isSelected() ?"checked":"not checked"));
    }
}
