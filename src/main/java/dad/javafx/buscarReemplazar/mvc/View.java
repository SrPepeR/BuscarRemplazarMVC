package dad.javafx.buscarReemplazar.mvc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class View extends GridPane {
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	
	private TextField buscarText;
	private TextField reemplazarText;
	
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	private RadioButton mayusculasMinisculasRadio;
	private RadioButton haciaAtrasRadio;
	private RadioButton expresionRegularRadio;
	private RadioButton resaltarRadio;
	private ToggleGroup opcionToggle;
	
	public View() {
		
		super();
		
		//ELEMENTOS
		
		buscarLabel = new Label("Buscar:");
		buscarLabel.setPrefWidth(100);
		reemplazarLabel = new Label("Reemplazar con:");
		reemplazarLabel.setPrefWidth(100);
		
		buscarText = new TextField();
		buscarText.setPromptText("Buscar");
		reemplazarText = new TextField();
		reemplazarText.setPromptText("Reemplazar");
		
		buscarButton = new Button("Buscar");
		buscarButton.setPrefWidth(120);
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setPrefWidth(120);
		reemplazarTodoButton = new Button("Reemplazar todo");
		reemplazarTodoButton.setPrefWidth(120);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setPrefWidth(120);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setPrefWidth(120);

		opcionToggle = new ToggleGroup();
		
		mayusculasMinisculasRadio = new RadioButton("Mayúsculas y minúsculas");
		mayusculasMinisculasRadio.setToggleGroup(opcionToggle);
		
		haciaAtrasRadio = new RadioButton("Buscar hacia atrás");
		haciaAtrasRadio.setToggleGroup(opcionToggle);
		
		expresionRegularRadio = new RadioButton("Expresión regular");
		expresionRegularRadio.setToggleGroup(opcionToggle);
		
		resaltarRadio = new RadioButton("Resaltar resultados");
		resaltarRadio.setToggleGroup(opcionToggle);
		
		//BOX
		
		VBox buttonsBox = new VBox(10, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		buttonsBox.setPadding(new Insets(5));
		buttonsBox.setMinWidth(120);
		
		VBox radiosIzqBox = new VBox(5, mayusculasMinisculasRadio, expresionRegularRadio);
		VBox radiosDrchBox = new VBox(5, haciaAtrasRadio, resaltarRadio);
		
		HBox radiosBox = new HBox(5, radiosIzqBox, radiosDrchBox);
		
		add(buscarLabel, 0, 0, 1, 1);
		add(buscarText, 1, 0, 1, 1);
		add(reemplazarLabel, 0, 1, 1, 1);
		add(reemplazarText, 1, 1, 1, 1);
		add(buttonsBox, 2, 0, 1, 4);
		add(radiosBox, 1, 2, 1, 1);
		
//		setGridLinesVisible(true);
		setVgap(10);
		setHgap(10);
		setPadding(new Insets(5));
		setAlignment(Pos.TOP_LEFT);
		setHgrow(radiosBox, Priority.ALWAYS);
		
	}

	public TextField getBuscarText() {
		return buscarText;
	}
	
	public TextField getReemplazarText() {
		return reemplazarText;
	}

	public Button getBuscarButton() {
		return buscarButton;
	}
	
	public Button getReemplazarButton() {
		return reemplazarButton;
	}
	
	public Button getReemplazarTodoButton() {
		return reemplazarTodoButton;
	}
	
	public Button getCerrarButton() {
		return cerrarButton;
	}
	
	public Button getAyudaButton() {
		return ayudaButton;
	}
	
	public RadioButton getOpcionSelected() {
		return (RadioButton) opcionToggle.getSelectedToggle();
	}
	
}
