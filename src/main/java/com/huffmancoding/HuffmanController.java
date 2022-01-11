package com.huffmancoding;

import com.code.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HuffmanController {
    @FXML
    private Button codifButton;

    @FXML
    private Button decodifButton;

    @FXML
    private TextArea inputArea;

    @FXML
    private Label inputBit;

    @FXML
    private TextArea outputArea;

    @FXML
    private TextArea outputArea1;

    @FXML
    private Label outputBit;

    @FXML
    public void initialize(){
        codifButton.setOnAction(actionEvent -> {
            String input = inputArea.getText();
            int t = input.getBytes().length * 8;
            inputBit.setText(t + " Bit");
            Main.text = input;
            String output = Main.encod();
            outputBit.setText(output.length() + " Bit");
            outputArea1.setText(Main.codes.toString());
            outputArea.setText(output);
        });

        decodifButton.setOnAction(actionEvent -> {
            String input = inputArea.getText();
            inputBit.setText(input.length() + " Bit");
            String output = Main.huffmanDecode(input, Main.tree);
            int t = output.getBytes().length * 8;
            outputBit.setText(t + " Bit");
            outputArea.setText(output);
        });
    }
}