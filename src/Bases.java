public final class Bases {

    public static String toBase(int decimal, int radix) {
        return Integer.toString(decimal, radix);
    }

    public static int toDecimal(String val, int radix) {
        return Integer.parseInt(val, radix);
    }

}
