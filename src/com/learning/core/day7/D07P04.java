package com.learning.core.day7;

class CustomStack 
{
	int maxSize;
    char[] stackArray;
    int top;

    public CustomStack(int maxSize) 
    {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(int operand) 
    {
        if (top < maxSize - 1) 
        {
            stackArray[++top] = (char) operand;
        } 
        else 
        {
            System.out.println("Stack overflow");
        }
    }

    public char pop() 
    {
        if (!isEmpty()) 
        {
            return stackArray[top--];
        } 
        else 
        {
            throw new RuntimeException("Stack underflow");
        }
    }

    public char peek() 
    {
        if (!isEmpty())
        {
            return stackArray[top];
        } 
        else 
        {
            throw new RuntimeException("Stack is empty");
        }
    }

    public boolean isEmpty() 
    {
        return (top == -1);
    }
    
    public boolean isFull() 
    {
        return top == maxSize - 1;
    }
    
    static boolean isOperator(char ch) 
    {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    
    static int precedence(char operator) 
    {
        switch (operator) 
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    
    static int performOperation(int operand1, int operand2, char operator) 
    {
        switch (operator) 
        {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0)
                    throw new ArithmeticException("Division by zero.");
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    static int evaluateExpression(String expression) 
    {
    	int len = expression.length();
        CustomStack operandStack = new CustomStack(len);
        CustomStack operatorStack = new CustomStack(len);
        
        for (int i = 0; i < len; i++) 
        {
            char ch = expression.charAt(i);
            
            if (ch == ' ')
                continue;
            
            if (Character.isDigit(ch)) 
            {
                int operand = 0;
                while (i < len && Character.isDigit(expression.charAt(i))) 
                {
                    operand = operand * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operandStack.push(operand);
            } 
            else if (ch == '(') 
            {
                operatorStack.push(ch);
            } 
            else if (ch == ')') 
            {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') 
                {
                    char operator = operatorStack.pop();
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    operandStack.push(performOperation(operand1, operand2, operator));
                }
                operatorStack.pop(); // Pop '('
            } 
            else if(isOperator(ch)) 
            {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) 
                {
                    char operator = operatorStack.pop();
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    operandStack.push(performOperation(operand1, operand2, operator));
                }
                operatorStack.push(ch);
            } 
            else 
            {
                throw new IllegalArgumentException("Invalid character in expression: " + ch);
            }
        }
        
        while (!operatorStack.isEmpty()) 
        {
            char operator = operatorStack.pop();
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            operandStack.push(performOperation(operand1, operand2, operator));
        }        
        return operandStack.pop();
    }
}

public class D07P04
{
    public static void main(String[] args) 
    {
        String expression = "10+2*6";
        CustomStack stack = new CustomStack(expression.length());
        int result = stack.evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}




