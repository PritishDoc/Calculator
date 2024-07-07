import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField displayTextField;
    private double num1 = 0;
    private String operator = "";

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = createGridPane();
        createAndAddButtons(gridPane);

        Scene scene = new Scene(gridPane, 300, 400);
        primaryStage.setTitle("Calculator App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setHgap(10);
        return gridPane;
    }

    private void createAndAddButtons(GridPane gridPane) {
        Font buttonFont = new Font(20);

        displayTextField = new TextField();
        displayTextField.setEditable(false);
        displayTextField.setFont(buttonFont);
        gridPane.add(displayTextField, 0, 0, 4, 1);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        int row = 1;
        int col = 0;
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setFont(buttonFont);
            button.setMinSize(70, 70);
            button.setOnAction(e -> handleButtonClick(label));
            gridPane.add(button, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }
    }

    private void handleButtonClick(String label) {
        switch (label) {
            case "C":
                ((Object) displayTextField).setText("");
                num1 = 0;
                operator = "";
                break;
            case "=":
                calculateResult();
                operator = "";
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = label;
                num1 = Double.parseDouble(displayTextField.getText());
                displayTextField.setText("");
                break;
            default:
                displayTextField.setText(displayTextField.getText() + label);
        }
    }

    private void calculateResult() {
        double num2 = Double.parseDouble(displayTextField.getText());
        switch (operator) {
            case "+":
                displayTextField.setText(String.valueOf(num1 + num2));
                break;
            case "-":
                displayTextField.setText(String.valueOf(num1 - num2));
                break;
            case "*":
                displayTextField.setText(String.valueOf(num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    displayTextField.setText("Error");
                } else {
                    displayTextField.setText(String.valueOf(num1 / num2));
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
