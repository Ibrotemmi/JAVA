package classRoom;

public class UnaryOperations {
    public static void main(String[] args) {

        //Unary operators
//++  --> 1+ value , += --> it means + btw two values// придает значение и плюсует
//-- --> -1 from value , -= --> it means - btw values// придает значение и минусует
//*=  --> it means multiplication, /= --> it means divison only regular//


        int a=5;
        int b=10;
        System.out.println(a+b);//5+10
        System.out.println(++a);//1+5
        System.out.println(++b);//1+10
        System.out.println(b--);//10-1=9


        int qq = 10;
        int jj = 5;
        qq = 15;
        qq += jj; // qq+jj=20
        qq-=jj; // qq=qq-aa; qq= 15-5=10 qq=10
        qq*=jj; // qq=qq*jj; qq= 10*5=50 qq=50
        qq/=jj; // qq=qq/jj; qq= 50/5=10 qq 10



        a=++a;
        b=++b;
        b=--a;

        a=--a;
        b=--a;

//++x - prefix,
//x++ -postfix




    }
}
