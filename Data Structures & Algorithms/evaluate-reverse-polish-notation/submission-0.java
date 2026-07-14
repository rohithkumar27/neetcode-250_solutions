class Solution {
    
    public int evalRPN(String[] tokens) {
          Deque<Integer> stack = new ArrayDeque<>();
          
          for (String token : tokens) {
              if (isOperand(token)) {
                  int num2 = stack.pop();
                  int num1 = stack.pop();
                  int result = evaluateExpression(num1, num2, token);
                  stack.push(result);
              } else {
                  stack.push(Integer.parseInt(token));
              }
          }
          
          return stack.pop();
      }
  
  // Helper method to check if token is an operand
  private boolean isOperand(String token) {
    return "+-*/".contains(token);
  }
  
  // Helper method to evaluate expression based on operand
  private int evaluateExpression(int num1, int num2, String operand) {
      switch (operand) {
          case "+":
              return num1 + num2;
          case "-":
              return num1 - num2;
          case "/":
              return num1 / num2;
          case "*":
              return num1 * num2;
          default:
              throw new IllegalArgumentException("Invalid operand: " + operand);
      }
  }
}
