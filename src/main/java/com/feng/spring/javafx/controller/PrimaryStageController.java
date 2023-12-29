package com.feng.spring.javafx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * spring-javafx
 * 2023/12/29 11:57
 * 控制器
 *
 * @author lanhaifeng
 * @since 1.0
 **/
public class PrimaryStageController implements Initializable {
    @FXML
    private Label dividendLabel;
    @FXML
    private Label divisorLabel;
    @FXML
    private Label resultLabel;
    @FXML
    private TextField dividendField;
    @FXML
    private TextField divisorField;
    @FXML
    private TextField resultField;
    @FXML
    private Button caculateBt;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        caculateBt.setOnAction(e->{
            String dividendText = dividendField.getText();
            String divisorText = divisorField.getText();
            double dividend = Double.parseDouble(dividendText);
            double divisor = Double.parseDouble(divisorText);
            double result = dividend/divisor;
            resultField.setText(String.valueOf(result));
        });
    }
}