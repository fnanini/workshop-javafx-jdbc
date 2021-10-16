module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;
	
	exports gui;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens gui to javafx.fxml;
	
	opens model.entities to javafx.base;

}
