import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ingresa x1 ");
        int XUno = input.nextInt();

        System.out.println("ingresa y1 ");
        int YUno = input.nextInt();

        System.out.println("ingresa x2 ");
        int XDos = input.nextInt();

        System.out.println("ingresa y2 ");
        int YDos = input.nextInt();

        System.out.println("ingresa x3 ");
        int XTres = input.nextInt();

        System.out.println("ingresa y3 ");
        int YTres = input.nextInt();

        double longitd = Math.pow(XDos-XUno, 2)+Math.pow(YDos-YUno, 2);
        double distancia = Math.sqrt(longitd);

        int a =  XUno+YUno;
        int b = XDos+YDos;
        int c = XTres+YTres;

        int perimetro = (a+b+c);

        double semiperimetro = (a+b+c)/2;

        double operacionA1 = semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c);
        double resultadoArea = Math.sqrt(operacionA1);

        double AlturaVertice = (2*resultadoArea)/a;
        double AreaInterno = (Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/2*a*c;


    }
}
