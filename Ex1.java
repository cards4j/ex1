public class Ex1  {
    public static void main(String[] args) {
        int a = Integer.valueOf("1", 16);
        int b = Integer.parseInt("-FFFF", 16);
        int c = Integer.parseInt("FFFF", 16);

        String format = "value: %+,12d   toUnsignedString: %10s   %n";
        System.out.format(format, a, a.toUnsignedString());
        System.out.format(format, b, b.toUnsignedString());
        System.out.format(format, c, c.toUnsignedString());
    }
}

