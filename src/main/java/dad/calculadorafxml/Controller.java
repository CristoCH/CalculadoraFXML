package dad.calculadorafxml;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Calculadora calculadora = new Calculadora();
    private Model model = new Model();

    //View
    @FXML
    private GridPane view;
    @FXML
    private TextField operaText;



    public GridPane getView() {
        return view;
    }

    public Controller() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
        loader.setController(this);
        loader.load();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        model.operaTextProperty().bindBidirectional(operaText.textProperty());
    }

    @FXML
    void onCButton(ActionEvent event) {
        calculadora.borrar();
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onCeButton(ActionEvent event) {
        calculadora.borrarTodo();
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onCeroButton(ActionEvent event) {
        calculadora.insertar('0');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onUnoButton(ActionEvent event) {
        calculadora.insertar('1');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onDosButton(ActionEvent event) {
        calculadora.insertar('2');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onTresButton(ActionEvent event) {
        calculadora.insertar('3');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onCuatroButton(ActionEvent event) {
        calculadora.insertar('4');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onCincoButton(ActionEvent event) {
        calculadora.insertar('5');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onSeisButton(ActionEvent event) {
        calculadora.insertar('6');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onSieteButton(ActionEvent event) {
        calculadora.insertar('7');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onOchoButton(ActionEvent event) {
        calculadora.insertar('8');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onNueveButton(ActionEvent event) {
        calculadora.insertar('9');
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onComaButton(ActionEvent event) {
        calculadora.insertarComa();
        model.setOperaText(calculadora.getPantalla());
    }


    @FXML
    void onSumaButton(ActionEvent event) {
        calculadora.operar(Calculadora.SUMAR);
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onRestaButton(ActionEvent event) {
        calculadora.operar(Calculadora.RESTAR);
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onMultButton(ActionEvent event) {
        calculadora.operar(Calculadora.MULTIPLICAR);
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onDivButton(ActionEvent event) {
        calculadora.operar(Calculadora.DIVIDIR);
        model.setOperaText(calculadora.getPantalla());
    }

    @FXML
    void onIgualButton(ActionEvent event) {
        calculadora.operar(Calculadora.IGUAL);
        model.setOperaText(calculadora.getPantalla());
    }
}
