import java.util.Scanner;

/**
 * Controler
 * En este java se controla las acciones de lo que es el programa general
 */

import java.util.Scanner;
public class Controler_main {
         public static void main(String[] args) { {/**
            * se comienzar a declarar instancias y muchas más cosasa que son utiles a lo largo de el programa 
            */
        Vista v = new Vista();
        asignador a = new asignador();
        familia f = new familia();
        perros p = new perros();
        Scanner sc = new Scanner(System.in);;
        v.soludar();
        int contador = 0;
        int cont1 = 1;
        int cont2 = 1;
        /**
 * inicia el menú
 */
        while (contador != 4) {
            v.menu();
            contador = sc.nextInt();
            /**
 * se creean instancias para agregar familias
 */
            if (contador == 1 && cont1 == 1) {
                v.fperguntaf1();
                f.familia1();
                v.fpergunta2();
                f.familia1np();
                v.fpergunta3();
                f.familia1ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 2) {
                v.fperguntaf1();
                f.familia2();
                v.fpergunta2();
                f.familia2np();
                v.fpergunta3();
                f.familia2ng();
                contador -= 1;
            }
            if (contador == 1 && cont1 == 3) {
                v.fperguntaf1();
                f.familia3();
                v.fpergunta2();
                f.familia3np();
                v.fpergunta3();
                f.familia3ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 4) {
                v.fperguntaf1();
                f.familia4();
                v.fpergunta2();
                f.familia4np();
                v.fpergunta3();
                f.familia4ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 5) {
                v.fperguntaf1();
                f.familia5();
                v.fpergunta2();
                f.familia5np();
                v.fpergunta3();
                f.familia5ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 6) {
                v.fperguntaf1();
                f.familia6();
                v.fpergunta2();
                f.familia6np();
                v.fpergunta3();
                f.familia6ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 7) {
                v.fperguntaf1();
                f.familia7();
                v.fpergunta2();
                f.familia7np();
                v.fpergunta3();
                f.familia7ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 8) {
                v.fperguntaf1();
                f.familia8();
                v.fpergunta2();
                f.familia8np();
                v.fpergunta3();
                f.familia8ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 9) {
                v.fperguntaf1();
                f.familia9();
                v.fpergunta2();
                f.familia9np();
                v.fpergunta3();
                f.familia9ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 10) {
                v.fperguntaf1();
                f.familia10();
                v.fpergunta2();
                f.familia10np();
                v.fpergunta3();
                f.familia10ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 11) {
                v.fperguntaf1();
                f.familia11();
                v.fpergunta2();
                f.familia11np();
                v.fpergunta3();
                f.familia11ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 12) {
                v.fperguntaf1();
                f.familia12();
                v.fpergunta2();
                f.familia12np();
                v.fpergunta3();
                f.familia12ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 13) {
                v.fperguntaf1();
                f.familia13();
                v.fpergunta2();
                f.familia13np();
                v.fpergunta3();
                f.familia13ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 14) {
                v.fperguntaf1();
                f.familia14();
                v.fpergunta2();
                f.familia14np();
                v.fpergunta3();
                f.familia14ng();
                cont1 += 1;
                contador -= 1;
            }
            if (contador == 1 && cont1 == 15) {
                v.fperguntaf1();
                f.familia15();
                v.fpergunta2();
                f.familia15np();
                v.fpergunta3();
                f.familia15ng();
                cont1 += 1;
                contador -= 1;
            }
            /**
 * se crean instancias para agregar perros a su listas 
 */
            if (contador == 2 && cont2 == 1) {
                v.ppregunta4();
                p.agregar1();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 2) {
                v.ppregunta4();
                p.agregar2();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 3) {
                v.ppregunta4();
                p.agregar3();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 4) {
                v.ppregunta4();
                p.agregar4();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 5) {
                v.ppregunta4();
                p.agregar5();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 6) {
                v.ppregunta4();
                p.agregar6();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 7) {
                v.ppregunta4();
                p.agregar7();
                cont2 += 1;
                contador -= 1;
            }
            if (contador == 2 && cont2 == 8) {
                System.out.println("limite de perros alcanzados, proceda a asignar unos antes de agregar más");
            }
            /**
 * se lee lo que el asignador manda para poder determinar si se puede asiganar al can
 */
            if (contador == 3 && cont1 != 1 && cont2 != 1) {
                Integer interno = 0;
                Integer interno2 = 0;
                System.out.println("diga a que familia le quiere asignar");
                System.out.println("1." + f.familia1.get(1));
                System.out.println("2." + f.familia2.get(1));
                System.out.println("3." + f.familia3.get(1));
                System.out.println("4." + f.familia4.get(1));
                System.out.println("5." + f.familia5.get(1));
                System.out.println("6." + f.familia6.get(1));
                System.out.println("7." + f.familia7.get(1));
                System.out.println("8." + f.familia8.get(1));
                System.out.println("9." + f.familia9.get(1));
                System.out.println("10." + f.familia10.get(1));
                System.out.println("11." + f.familia11.get(1));
                System.out.println("12." + f.familia12.get(1));
                System.out.println("13." + f.familia13.get(1));
                System.out.println("14." + f.familia14.get(1));
                System.out.println("15." + f.familia15.get(1));
                interno = sc.nextInt();
                if (interno == 1 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 2 && interno2 == 1) {
                    boolean primer = a.capazg2();
                    boolean segundo = a.capazp2();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia2.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia2.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 3 && interno2 == 1) {
                    boolean primer = a.capazg3();
                    boolean segundo = a.capazp3();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia3.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia3.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 4 && interno2 == 1) {
                    boolean primer = a.capazg4();
                    boolean segundo = a.capazp4();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 5 && interno2 == 1) {
                    boolean primer = a.capazg5();
                    boolean segundo = a.capazp5();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 6 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 7 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }if (interno == 8 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }if (interno == 9 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 10 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 11 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 12 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 13 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 14 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 15 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                if (interno == 1 && interno2 == 1) {
                    boolean primer = a.capazg1();
                    boolean segundo = a.capazp1();
                    boolean perro1 = a.asignacion1();
                    if (primer == true || segundo == true && perro1 == true) {
                        System.out.println("in asignable");
                        contador = 0;
                    }
                    if (primer == true || segundo == true && perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    if (primer == false && segundo == false && perro1 == true || perro1 == false) {
                        System.out.println("asginado por compatibilidad");
                        p.perro1.clear();
                        f.familia1.clear();
                        contador = 0;
                    }
                    
                }
                        }
                }
         }
        }
    }

    

    
