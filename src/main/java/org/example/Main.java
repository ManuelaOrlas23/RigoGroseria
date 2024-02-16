package org.example;


import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int intentosFallidos = 0;
        String usuarioBD = "Admin23";
        String contrasenaBD = "Admin34";
        String correoBD = "Admin23@gmail.com";


        while (intentosFallidos < 3) {

            System.out.print("Ingrese su Nombre de Usuario: ");
            String usuario = leer.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String contrasena = leer.nextLine();

            System.out.print("Ingrese su correo electrónico: ");
            String correo = leer.nextLine();

            if (usuario.equals(usuarioBD) && contrasena.equals(contrasenaBD) && correo.equals(correoBD)) {
                mostrarMenuPrincipal(leer);
                break;
            } else {
                intentosFallidos++;
                System.out.println("Intentos de ingreso agotados, Por favor intente de nuevo.");
            }
        }

        if (intentosFallidos == 3) {
            System.out.println("Cerrando el programa por exceder el numero de intentos permitidos....");
        }
    }


    public static void mostrarMenuPrincipal(Scanner scanner) {

        int[] cantidades = new int[6];
        int opcionCantidades;
        int opcion;
        int[] precios = {28000, 35000, 150000, 80000, 20000, 18500};
        double total = 0.0;
        int opcionModificar;
        int opcionCantidadesDos;


        double propina5 = 0.5;
        double propina10 = 0.1;


        double costoTotalConPropina = 0.0;
        do {
            System.out.println("1.Ingresar orden");
            System.out.println("2.Total");
            System.out.println("3.Modificar orden");
            System.out.println("4.Salir ");
            System.out.println("Ingrese la opcion");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                while (true) {
                    System.out.println("Listado de platos:");
                    System.out.println("1. Entrada de cangrejo de Urrao ($28000)");
                    System.out.println("2. Escalopes a la Rigo ($35000");
                    System.out.println("3. Filete tour de Francia ($150,000)");
                    System.out.println("4. Corvina de Rigo ($80,000)");
                    System.out.println("5. Coctel Michelle ($20,000)");
                    System.out.println("6. Jugos de Urrao ($18,500)");
                    System.out.println("7.salir");
                    System.out.println("Digite Una Opcion Valida ");
                    int opcionMenuDos = scanner.nextInt();
                    if (opcionMenuDos == 1) {
                        System.out.println("cuantas cantidades quiere del Plato 1: ");
                        opcionCantidades = scanner.nextInt();
                        cantidades[0] = cantidades[0] + opcionCantidades;
                    } else if (opcionMenuDos == 2) {
                        System.out.println("cuantas cantidades quiere del Plato 2: ");
                        opcionCantidades = scanner.nextInt();
                        cantidades[1] = cantidades[1] + opcionCantidades;
                    } else if (opcionMenuDos == 3) {
                        System.out.println("cuantas cantidades quiere del Plato 3: ");
                        opcionCantidades = scanner.nextInt();
                        cantidades[2] = cantidades[2] + opcionCantidades;
                    } else if (opcionMenuDos == 4) {
                        System.out.println("cuantas cantidades quiere del Plato 4: ");
                        opcionCantidades = scanner.nextInt();
                        cantidades[3] = cantidades[3] + opcionCantidades;
                    } else if (opcionMenuDos == 5) {
                        System.out.println("cuantas cantidades quiere deL Coctel: ");
                        opcionCantidades = scanner.nextInt();
                        cantidades[4] = cantidades[4] + opcionCantidades;
                    } else if (opcionMenuDos == 6) {
                        System.out.println("cuantas cantidades quiere del Jugos: ");
                        opcionCantidades = scanner.nextInt();
                        cantidades[5] = cantidades[5] + opcionCantidades;
                    } else if (opcionMenuDos == 7) {
                        System.out.println("volviendo al menu anterior");
                        break;

                    } else {
                        System.out.println("opcion incorrecta");
                    }
                }

            } else if (opcion == 2) {

                System.out.println("calculando total sin propina");
                total = (cantidades[0] * precios[0]) + (cantidades[1] * precios[1]) + (cantidades[2] * precios[2]) +
                        (cantidades[3] * precios[3] + (cantidades[4] * precios[4]) + (cantidades[5] * precios[5]));
                System.out.println("El total sin propina es: " + total);
                System.out.print("Desea incluir la propina de 5% o del 10%: ");
                double propina = scanner.nextInt();
                if (propina == 5){
                    propina = total * propina5;
                } else if (propina == 10) {
                    propina = total * propina10;

                }else {
                    System.out.println("El usuario no deja la propina");
                    propina = 0 ;
                }
                costoTotalConPropina = total + propina;
                System.out.println("el total con propina es:" + costoTotalConPropina);

            } else if (opcion == 3) {
                System.out.println("1. Entrada de cangrejo de Urrao ($28000)");
                System.out.println("2. Escalopes a la Rigo ($35000");
                System.out.println("3. Filete Tour de Francia ($150,000)");
                System.out.println("4. Corvina de Rigo ($80,000)");
                System.out.println("5. Coctel Michelle ($20,000)");
                System.out.println("6. Jugos de Urrao ($18,500)");
                System.out.println("Digite el plato que quiere modificar la cantidad: ");
                opcionModificar = scanner.nextInt();
                if (opcionModificar == 1) {
                    System.out.println("Cuantos platos quiere del plato 1");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[0] = opcionCantidadesDos;
                } else if (opcionModificar == 2) {
                    System.out.println("Cuantos platos quiere del plato 2");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[1] = opcionCantidadesDos;
                } else if (opcionModificar == 3) {
                    System.out.println("Cuantos platos quiere del plato 3");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[2] = opcionCantidadesDos;
                } else if (opcionModificar == 4) {
                    System.out.println("Cuantos platos quiere del plato 4");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[3] = opcionCantidadesDos;
                } else if (opcionModificar == 5) {
                    System.out.println("Cuantos platos quiere del plato 5");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[4] = opcionCantidadesDos;
                } else if (opcionModificar == 6) {
                    System.out.println("Cuantos platos quiere del plato 6");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[5] = opcionCantidadesDos;
                } else {
                    System.out.println("Opción Invalida");
                }


            }else {
                System.out.println("Opción Invalida");
            }

        } while (opcion != 4);



    }
}

