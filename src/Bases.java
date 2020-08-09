public final class Bases {
    public static String toHex(int num) {
        return "0x" + Integer.toString(num, 16).toUpperCase();
    }

    public static String toDuo(int num) {
        return "Bx" + Integer.toString(num, 12).toUpperCase();
    }

    public static String toOctal(int num) {
        return "0" + Integer.toString(num, 8);
    }

    public static String toBinary(int num) {
        return Integer.toString(num, 2);
    }

    /**
     * This converts only from Hexadecimal (Base 16), Duodecimal (Base 12), Octal (Base 8) and Binary (Base 2).
     * The prefixes are the following: 0x or # for Hexadecimal, Bx for Duodecimal, and 0 for Octal. Nothing for Binary.
     *
     * @param val - A String representation of a number either from base 16, 12, 8, or 2.
     * @return a decimal integer
     * @throws NumberFormatException - If an unsupported base is entered
     */
    public static int toDec(String val) {
        if (val.toLowerCase().startsWith("0x") || val.toLowerCase().startsWith("#")) {
            return Integer.parseInt(val.substring(2), 16);
        } else if (val.toLowerCase().startsWith("bx")) {
            return Integer.parseInt(val.substring(2), 12);
        } else if (val.toLowerCase().startsWith("0")) {
            return Integer.parseInt(val.substring(1), 8);
        } else {
            return Integer.parseInt(val, 2);
        }
    }

}
