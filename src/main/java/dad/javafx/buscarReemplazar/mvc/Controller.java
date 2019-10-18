package dad.javafx.buscarReemplazar.mvc;

import javafx.event.ActionEvent;

public class Controller {
	
	private Model model = new Model();
	private View view = new View();
	
	public Controller() {
		
		model.aBuscarProperty().bind(view.getBuscarText().textProperty());
		model.aReemplazarProperty().bind(view.getReemplazarText().textProperty());
		
		view.getBuscarButton().setOnAction(e -> onBuscarAction(e));
		view.getReemplazarButton().setOnAction(e -> onReemplazarAction(e));
		view.getReemplazarTodoButton().setOnAction(e -> onReemplazarTodoAction(e));
		view.getCerrarButton().setOnAction(e -> onCerrarAction(e));
		view.getAyudaButton().setOnAction(e -> onAyudaAction(e));
		
	}
	
	
	
	private void onBuscarAction(ActionEvent e) {
		
		
		
	}
	
	private void onReemplazarAction(ActionEvent e) {
		
		
		
	}
	
	private void onReemplazarTodoAction(ActionEvent e) {
		
		
		
	}
	
	private void onCerrarAction(ActionEvent e) {
		
		
		
	}
	
	private void onAyudaAction(ActionEvent e) {
		
		
		
	}
	
	public View getRoot() {
		return view;
	}
	
}
