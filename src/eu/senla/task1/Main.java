package eu.senla.task1;

public class Main {
    static int d;

    public static void main(String[] args) {
        Number number = new Number();

        number.setB_byte((byte) 126);
        System.out.println("b_byte: " + number.getB_byte());

        number.setS_short((short) 32767);
        System.out.println("s_short: " + number.getS_short());

        number.setI_int(2100000000);
        System.out.println("i_int: " + number.getI_int());

        number.setL_long(9200000000000000000L);
        System.out.println("l_long: " + number.getL_long());

        number.setF_float(3.4e+38F);
        System.out.println("f_float: " + number.getF_float());

        number.setD_double(1.7e+308);
        System.out.println("d_double: " + number.getD_double());

        number.setC_char('Z');
        System.out.println("c_char: " + number.getC_char());

        /* __________Расширение типов*/
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        double d = i;
        System.out.println("Расширение типов:");
        System.out.println("byte : " + b + " short: " + s + " int: " + i + " long: " + l + " double: " + d);

        long l2 = 98768344657445L;
        float f2 = l2;
        double d2 = f2;

        System.out.println("long: " + l2 + " float: " + f2 + " double: " + d2);

        char c = 'S';
        int i2 = c;

        System.out.println("int: " + i2 + " char:" +c);
        /*_____________Сужение типов*/
        long l3 = 2200000000L;
        int i3 = (int)l3;
        short s3 = (short)i3;
        byte b3 = (byte)s3;

        System.out.println("Сужение типов:");
        System.out.println("long: " + l3 +" int : " + i3 + " short : " + s3 + " byte: " + b3);

        System.out.println("Усечение рациональных чисел до целых:");
        double d4 = 3.7868393944;
        int i4 = (int)d4;

        System.out.println("double: "+ d4 + " int: " + i4);

        /*________________________Классы обертки*/
        System.out.println("Классы обертки: ");
        Integer I_1 = 5;
        Integer I_2 = 5;
        System.out.println(I_1 == I_2); // true

        Integer I_3 = 129;
        Integer I_4 = 129;
        System.out.println(I_3 == I_4); // false

        int i_1 = 5;
        System.out.println(i_1 == I_1); // true

        int i_3 = 129;
        System.out.println(i_3 == I_3); // true


        /*________________________Методы классов оберток*/

        String st = "127";
        byte bb = Byte.parseByte(st);
        short ss = Short.parseShort(st);
        int ii = Integer.parseInt(st);
        long ll = Long.parseLong(st);
        float ff = Float.parseFloat(st);
        double dd = Double.parseDouble(st);

        System.out.println(st);
        System.out.println(bb);
        System.out.println(ss);
        System.out.println(ii);
        System.out.println(ll);
        System.out.println(ff);
        System.out.println(dd);
    }
}
