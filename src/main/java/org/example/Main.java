package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 100;
        int d = 200;
        int e = 500;
        int x=0, f=0, g=0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0;
        do {
            System.out.println("Bienvenido al puesto de votacion de nuestro municipio PREMIER");
            System.out.println("A continuacion te presentamos las opciones que puedes elegir");
            System.out.println("*******************************************************");
            System.out.println("* 1.Registrar voto a un candidato                     *");
            System.out.println("* 2.Calcular el costo de la campaña de cada candidato *");
            System.out.println("* 3.Vaciar urnas de votacion                          *");
            System.out.println("* 4.Calcular numero total de votos                    *");
            System.out.println("* 5.Porcentaje de votos obtenidos por cada candidato  *");
            System.out.println("* 6.Costo promedio de las campañas                    *");
            System.out.println("*******************************************************");


            Scanner teclado = new Scanner(System.in);
            x = teclado.nextInt();
            switch (x) {
                case 1:
                    System.out.println("*******************************************************");
                    System.out.println("* Solo podemos ingresar las siguientes denominaciones *");
                    System.out.println("* 1.$20                                               *");
                    System.out.println("* 2.$50                                               *");
                    System.out.println("* 3.$100                                              *");
                    System.out.println("* 4.$200                                              *");
                    System.out.println("* 5.$500                                              *");
                    System.out.println("*******************************************************");
                    f = teclado.nextInt();
                    switch (f) {
                        case 1:
                            System.out.println("Usted eligio la moneda de " + a);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            h = teclado.nextInt();

                            i = a * h;
                            System.out.println("usted ingreso " + g + "monedas de" + a);
                            System.out.println("Las cuales suman " + "$" + i);
                            break;
                        case 2:
                            System.out.println("Usted eligio la moneda de " + b);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            j = teclado.nextInt();

                            k = b * j;
                            System.out.println("usted ingreso " + g + "monedas de" + b);
                            System.out.println("Las cuales suman " + "$" + k);
                            break;
                        case 3:
                            System.out.println("Usted eligio la moneda de " + c);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            l = teclado.nextInt();

                            m = c * l;
                            System.out.println("usted ingreso " + g + "monedas de" + c);
                            System.out.println("Las cuales suman " + "$" + m);
                            break;
                        case 4:
                            System.out.println("Usted eligio la moneda de " + d);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            n= teclado.nextInt();

                            o = d *n;
                            System.out.println("usted ingreso " + g + "monedas de" + d);
                            System.out.println("Las cuales suman " + "$" + o);
                            break;
                        case 5:
                            System.out.println("Usted eligio la moneda de " + e);
                            System.out.println("Ahora dime cuanta monedas de esta denominacion vas a " +
                                    "ingresar");
                            p = teclado.nextInt();

                            q = e * p;
                            System.out.println("usted ingreso " + p + "monedas de" + e);
                            System.out.println("Las cuales suman " + "$" + q);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("tienes "+ h + "monedas de " + a);
                    System.out.println("tienes "+ j + "monedas de " + b);
                    System.out.println("tienes "+ l + "monedas de " + c);
                    System.out.println("tienes "+ n + "monedas de " + d);
                    System.out.println("tienes "+ p + "monedas de " + e);
                    break;
                case 3:
                    int r=0;
                    r=i+k+m+o+q;
                    System.out.println("tienes "+ r + "ahorrados en tu marramito");

                    break;
                case 4:
                    x=0;
                    f=0;
                    g=0;
                    h = 0;
                    i = 0;
                    j = 0;
                    k = 0;
                    l = 0;
                    m = 0;
                    n = 0;
                    o = 0;
                    p = 0;
                    q = 0;
                    break;
            }
        }while (x!=5);
    }
}
/*Desarrollar un software que permita escoger el representante del municipio “Premier”.
 Para tal cargo se han postulado tres candidatos, los cuales han realizado una intensa
 campaña publicitaria utilizando los principales medios de comunicación (Internet, radio,
 y televisión). Se desea conocer el costo de la campaña calculando el retorno de la inversión
 realizada en publicidad. Para esto, se determinaron los siguientes valores dependiendo del
 medio que influenció al votante:


•	Voto influenciado por publicidad en Internet: $700000
•	Voto influenciado por publicidad en radio: $200000
•	Voto influenciado por publicidad en televisión: $600000

Lo anterior quiere decir que, por cada voto que reciba un candidato influenciado por
publicidad en Internet, su costo de campaña se incrementara en $700000, del mismo modo por
cada voto influenciado por publicidad en radio, su costo de campaña se incrementara en $200000,
y finalmente, por cada voto influenciado por publicidad en televisión, su costo de campaña se
incrementar en $600000.

Las elecciones para representante del municipio “Premier” requieren una aplicación que les
permita:
1.	Votar por el candidato de su elección.
2.	Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria
de cada voto.
3.	Vaciar todas las urnas de la votación.
4.	Conocer el número total de votos.
5.	Porcentaje de votos obtenidos por cada candidato.
6.	Costo promedio de campaña en las elecciones*/