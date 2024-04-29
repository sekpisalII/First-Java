import  java.lang.System;
import  java.lang.String;

public class className{
    public static void main(String[] args) {

        boolean[][] booleans = new boolean[2][2];
        System.out.println("booleans[0][0] : " + booleans[0][0]);

        byte[][] bytes = new byte[2][2];
        System.out.println("bytes[0][0] : " + bytes[0][0]);

        char[][] chars = new char[1][1];
        System.out.println("chars[0][0] : " + (int)chars[0][0]);

        short[][] shorts = new short[2][2];
        System.out.println("short[0][0] : " + shorts[0][0]);

        int[][] ints = new int[3][2];
        System.out.println("ints[0][0] : " + ints[0][0]);

        long[][] longs = new long[2][2];
        System.out.println("longs[0][0] : " + longs[0][0]);

        float[][] floats = new float[1][2];
        System.out.println("floats[0][0] : " + floats[0][0]);

        double[][] doubles = new double[2][2];
        System.out.println("doubles[0][0] : " + doubles[0][0]);

        Object[][] objects = new Object[2][2];
        System.out.println("objects[0][0] : " + objects[0][0]);
        /***
         * Output
         *        booleans[0][0] : false
         *        bytes[0][0] : 0
         *        chars[0][0] : 0
         *        short[0][0] : 0
         *        ints[0][0] : 0
         *        longs[0][0] : 0
         *        floats[0][0] : 0.0
         *        doubles[0][0] : 0.0
         *        objects[0][0] : null
          */



    }
}


