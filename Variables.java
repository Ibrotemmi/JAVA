package classRoom;

public class Variables {
    public static void main(String[] args) {

        System.out.println("My name is Temirlan");
        System.out.printf("Hello");
        //Работает!

       /* String- сохраняет текст, например "Привет". Строковые значения заключены в двойные кавычки
        int- хранит целые числа (целые числа) без десятичных знаков, например 123 или -123
        float- хранит числа с плавающей запятой с десятичными знаками, например 19,99 или -19,99
        char- хранит отдельные символы, такие как «a» или «B». Значения Char заключены в одинарные кавычки
        boolean- хранит значения с двумя состояниями: true или false*/

        byte a = 122;
        long b = 32112;
        short c = 19112;
        int d = 321321122;
        boolean e = true;
        String f = "game";
        char g = 'i';
        float h = 762.112f;
        double i = 12313.123121;

        //Типы Переменных их всего 8. (byte,short,int(integer),long,float,double,char,boolean)
        //"Целые числа" переменные в которых можно хранить целые чилса это byte от -128 до 127,
        // short от -32768 до 32767,int от -2147483648 до 2147483647,long от -92342341341332 до 9234143212123.
        //Прежде чем использовать переменную, ее необходимо обьявить.

        //Например:
        byte cattle = 100;
        short turkey = 9999;
        int cattleInFiveFarms = 101000;
        long inAllFarms = 150000123;

        //"Числа с точкой" это Float и Double. Примеры дробных чисел: 1.0, 1.8, 3.12312 и т.д
        // Указываем тип, затем имя переменной, даем значение и в конце ствим ";".
        float priceOneCattle = 141.32f;
        //Важно в переменной float в конце значение указывать букву f.
        double priceOneCattle2 = 145.12312d;

        //Прочие типы данных: char, boolean, String.
        //char - тип данных для работы с символами.Позволяет поместить в одинарных ковычках какой либо символ.
        char abc = 'Q';

        //boolean - логический тип данных.Предназначен для записи истинного (true) или ложного (false) значения.
        boolean farmBig = true;
        boolean farmsmall = false;


        //String - Не примитивные типы данных для писания текста.В двойных кавычках можно сохранить одно или множество слов.
        String farmName = "Йеллоустоун";
        System.out.println(farmName);

        //Для создания переменной необходимо указать тип данных и ее название.Также можно сразу добавить к ней значение.

        byte num = 127;
        short num1 = 32000;
        int num2 = 1231223;
        long num3= 1231232131;
        float num4 = 12.312f;
        double num5 = 12.1235512;
        char num6 = 'g';
        boolean isHappy = true;
        boolean isNotHappy = false;
        String phoneName = "Ihpone";
        System.out.println(phoneName);
        System.out.println(a+ " "+ b+" "+ c+" "+ d+" "+e+" "+ f+" "+g+" "+"Iphone");

    }
}
