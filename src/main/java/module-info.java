module com.testdb1.testdb1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.testdb1.testdb1 to javafx.fxml;
    exports com.testdb1.testdb1;
}