package com.feng.spring.javafx;

import com.feng.spring.javafx.annotation.FXMLView;
import com.feng.spring.javafx.view.PrimaryStageView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringJavafxApplication extends Application {

    private static FXMLLoader fxmlLoader;

    public static void main(String[] args) {
        launch(PrimaryStageView.class);
        Application.launch(SpringJavafxApplication.class, args);
    }

    private static void launch(Class<?> viewCls) {
        FXMLView fxmlView = viewCls.getAnnotation(FXMLView.class);
        fxmlLoader = new FXMLLoader(SpringJavafxApplication.class.getResource(fxmlView.value()));
    }

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(SpringJavafxApplication.class.getResource("/view/PrimaryStage.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
