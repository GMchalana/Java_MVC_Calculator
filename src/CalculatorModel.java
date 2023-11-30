public class CalculatorModel {
    private float answer;
    public void addTwoNumbers(float firstNumber, float secondNumber){
        answer = firstNumber + secondNumber;
    }

    public void subTwoNumbers(float firstNumber, float secondNumber){
        answer = firstNumber - secondNumber;
    }

    public void mulTwoNumbers(float firstNumber, float secondNumber){
        answer = firstNumber * secondNumber;
    }

    public void divTwoNumbers(float firstNumber, float secondNumber){
        answer = firstNumber / secondNumber;
    }
    public float getAnswer(){
        return answer;
    }
}
