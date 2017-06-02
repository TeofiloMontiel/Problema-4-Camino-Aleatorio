/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4.camino.aleatorio;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Problema4CaminoAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int decicion = 0;
        int suceso;
        Scanner intro = new Scanner(System.in);
        String moneda[] = {"Cara", "Cruz"};
        do {
            suceso = RA(moneda);
            if (suceso == 1) {
                System.out.println();
                suceso = R1(moneda);
                if (suceso == 1) {
                    System.out.println();
                    suceso = D(moneda);
                    if (suceso == 1) {
                        System.out.println();
                        suceso = E(moneda);
                        if (suceso == 1) {
                            System.out.println();
                            suceso = DIS(moneda);
                            if (suceso == 1) {
                                System.out.println();
                                System.out.println("Alejandro llego hasta el departamento de Ingeniería de Computación e Informatica");
                            }
                        }
                    }
                }
            }
            do {
                try {
                    System.out.println("\nQue desea hacer\n"
                            + "1 - Iniciar nuevo trayecto\n"
                            + "2 - Salir del programa");
                    decicion = intro.nextInt();
                    if (decicion < 1 || decicion > 2) {
                        System.out.println("Por favor ingrese 1 o 2 segun lo que desee hacer");
                    }
                } catch (Exception e) {
                    System.out.println("Error al ingresar respuesta, por favor ingrese datos validos");
                }
            } while (decicion < 1 || decicion > 2);
        } while (decicion == 1);
    }

    private static int RA(String[] moneda) {
        int suceso = 0;
        System.out.println("Alejandro pasa por el edificio RA");
        System.out.println("Alejandro lanza moneda");
        int random = (int) Math.round(Math.random());
        System.out.println("Salio " + moneda[random]);
        if (random == 0) {
            System.out.println("Alejandro buscara mesa aquí");
            suceso = 0;
        }
        if (random == 1) {
            System.out.println("Alejandro seguira caminando");
            suceso = 1;
        }
        return suceso;
    }

    private static int R1(String[] moneda) {
        int suceso = 0;
        System.out.println("Alejandro pasa por el edificio R1");
        System.out.println("Alejandro lanza moneda");
        int random = (int) Math.round(Math.random());
        System.out.println("Salio " + moneda[random]);
        if (random == 0) {
            System.out.println("Alejandro buscara mesa aquí");
            suceso = 0;
        }
        if (random == 1) {
            System.out.println("Alejandro seguira caminando");
            suceso = 1;
        }
        return suceso;
    }

    private static int D(String[] moneda) {
        int suceso = 0;
        System.out.println("Alejandro pasa por el edificio D");
        System.out.println("Alejandro lanza moneda");
        int random = (int) Math.round(Math.random());
        System.out.println("Salio " + moneda[random]);
        if (random == 0) {
            System.out.println("Alejandro buscara mesa aquí");
            suceso = 0;
        }
        if (random == 1) {
            System.out.println("Alejandro seguira caminando");
            suceso = 1;
        }
        return suceso;
    }

    private static int E(String[] moneda) {
        int suceso = 0;
        System.out.println("Alejandro pasa por el edificio E");
        System.out.println("Alejandro lanza moneda");
        int random = (int) Math.round(Math.random());
        System.out.println("Salio " + moneda[random]);
        if (random == 0) {
            System.out.println("Alejandro buscara mesa aquí");
            suceso = 0;
        }
        if (random == 1) {
            System.out.println("Alejandro seguira caminando");
            suceso = 1;
        }
        return suceso;
    }

    private static int DIS(String[] moneda) {
        int suceso = 0;
        System.out.println("Alejandro pasa por el edificio DIS");
        System.out.println("Alejandro lanza moneda");
        int random = (int) Math.round(Math.random());
        System.out.println("Salio " + moneda[random]);
        if (random == 0) {
            System.out.println("Alejandro buscara mesa aquí");
            suceso = 0;
        }
        if (random == 1) {
            System.out.println("Alejandro seguira caminando");
            suceso = 1;
        }
        return suceso;
    }
}
