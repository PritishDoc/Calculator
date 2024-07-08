# CalculatorApp

Welcome to the **CalculatorApp** repository! This Java-based calculator application provides a simple and interactive graphical user interface for basic arithmetic operations. The application leverages JavaFX for its GUI components and ensures an intuitive user experience.
![alt text](<Screenshot 2024-07-01 214700.png>)
![alt text](<Screenshot 2024-07-01 214640.png>)

## Features

- **Basic Arithmetic Operations**: Perform addition, subtraction, multiplication, and division.
- **Interactive GUI**: Buttons for digits, operators, and a clear functionality to reset the calculator.
- **Responsive Design**: The layout adapts to different window sizes, providing a consistent user experience.

## Getting Started

### Prerequisites

To run this application, you need to have the following installed on your system:

- Java Development Kit (JDK) 8 or higher
- JavaFX SDK

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/CalculatorApp.git
    cd CalculatorApp
    ```

2. **Compile and run the application**:
    ```bash
    javac --module-path /path/to/javafx-sdk-15/lib --add-modules javafx.controls CalculatorApp.java
    java --module-path /path/to/javafx-sdk-15/lib --add-modules javafx.controls CalculatorApp
    ```
    Ensure you replace `/path/to/javafx-sdk-15/lib` with the actual path to your JavaFX SDK.

## Code Overview

### Main Class: `CalculatorApp`

The `CalculatorApp` class extends `Application` and serves as the entry point of the JavaFX application.

- **Attributes**:
  - `TextField displayTextField`: The display area for the calculator.
  - `double num1`: The first operand.
  - `String operator`: The operator for the arithmetic operation.

- **Methods**:
  - `start(Stage primaryStage)`: Sets up the primary stage and scene.
  - `createGridPane()`: Configures the grid layout for buttons and display.
  - `createAndAddButtons(GridPane gridPane)`: Creates buttons for digits and operators and adds them to the grid.
  - `handleButtonClick(String label)`: Handles button click events for digits, operators, and other functionalities.

### Running the Application

1. **Launch the application**:
    - Navigate to the directory containing `CalculatorApp.java`.
    - Use the commands mentioned in the Installation section to compile and run the application.

2. **Using the Calculator**:
    - Enter numbers and select operators using the buttons.
    - The result is displayed in the `TextField`.
    - Use the "=" button to calculate the result.
    - The "C" button clears the current input and resets the calculator.

## Contributing

We welcome contributions to improve the CalculatorApp! Here are some ways you can contribute:

- **Report bugs**: If you find any bugs, please report them using the issue tracker.
- **Submit feature requests**: Have an idea for a new feature? Let us know by submitting a request.
- **Contribute code**: Submit pull requests with improvements, bug fixes, or new features.



## Acknowledgements

- JavaFX for providing the GUI components.
- The open-source community for continuous support and contributions.

Thank you for using CalculatorApp! If you have any questions or need further assistance, feel free to open an issue or reach out.
