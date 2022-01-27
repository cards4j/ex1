# ex1: literal declaration causes compilation error

What is the result of compiling and running this code using Java 17?

    01 public class Ex1  {
    02    public static void main(String[] args) {
    03        Integer a = Integer.valueOf(7);
    04        int c = a * 5.0;
    05        System.out.println(c);
    06    }
    07 }
---
Result:

    java:4: error: incompatible types: possible lossy conversion from double to int
    int c = a * 5.0;
              ^
    1 error
---
When the compiler sees the decimal point in `5.0` it assumes the value is a double.
To allow compilation [remove the decimal point and the trailing zero](https://github.com/cards4j/ex2).
This causes the compiler to assume the value is an `int` primitive.

https://stackoverflow.com/questions/51632152/what-does-possible-lossy-conversion-mean-and-how-do-i-fix-it.

---
