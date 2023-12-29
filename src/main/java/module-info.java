module com.feng.spring.javafx {
    requires javafx.graphics;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires javafx.fxml;
    requires javafx.controls;
    requires spring.context;

    opens com.feng.spring.javafx to javafx.fxml;
    opens com.feng.spring.javafx.controller to javafx.fxml;
    opens com.feng.spring.javafx.view to javafx.fxml;
    exports com.feng.spring.javafx;
    exports com.feng.spring.javafx.controller;
    exports com.feng.spring.javafx.view;
}