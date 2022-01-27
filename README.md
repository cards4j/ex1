#ex1: literal declaration causes compilation error

    01 public class Ex1  {
    02    public static void main(String[] args) {
    03        Integer a = Integer.valueOf(7);
    04        int c = a * 5.0;
    05        System.out.println(c);
    06    }
    07 }
---
    java:4: error: incompatible types: possible lossy conversion from double to int
    int c = a * 5.0;
              ^
    1 error
---
When the compiler sees the decimal point in `5.0` it assumes the value is a double.
To allow compilation [remove the decimal point](https://github.com/cards4j/ex2).
