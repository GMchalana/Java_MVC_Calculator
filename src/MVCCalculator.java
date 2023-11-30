public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController theController = new CalculatorController(view,model);
        view.setVisible(true);
    }

}
