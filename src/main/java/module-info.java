module com.huffmancoding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.huffmancoding to javafx.fxml;
    exports com.huffmancoding;
    exports com.code;
    opens com.code to javafx.fxml;
}