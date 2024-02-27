write a Calculator class that has the ability to sum positive integers. A negative integer should throw an exception.

```
public class Calculator {
private int sum;

    public Calculator() {
        this.sum = 0;
    }

    public void reset() {
        this.sum = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        this.sum += number;
    }

    public int getSum() {
        return this.sum;
    }
}
```

The Calculator.java file contains a Calculator class for basic arithmetic. 
It has a private variable sum for storing the sum of positive integers. 
The class provides methods to reset the sum (reset), add a positive integer (add), and retrieve the current sum (getSum). 
The add method throws an IllegalArgumentException if a negative integer is passed.