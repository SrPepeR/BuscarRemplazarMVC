package dad.javafx.buscarReemplazar.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty aBuscar = new SimpleStringProperty();
	private StringProperty aReemplazar = new SimpleStringProperty();
	public final StringProperty aBuscarProperty() {
		return this.aBuscar;
	}
	
	public final String getABuscar() {
		return this.aBuscarProperty().get();
	}
	
	public final void setABuscar(final String aBuscar) {
		this.aBuscarProperty().set(aBuscar);
	}
	
	public final StringProperty aReemplazarProperty() {
		return this.aReemplazar;
	}
	
	public final String getAReemplazar() {
		return this.aReemplazarProperty().get();
	}
	
	public final void setAReemplazar(final String aReemplazar) {
		this.aReemplazarProperty().set(aReemplazar);
	}
	
}
