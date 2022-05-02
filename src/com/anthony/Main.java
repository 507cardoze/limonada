package com.anthony;
import java.util.Scanner;

public class Main {

    static class SinAzucar{
        public int vasos;
        public double ganancias;
        SinAzucar(){
            vasos = 100;
            ganancias = 0;
        }
        public int mostrar_vasos(){
            return vasos;
        }
        public double calcularPrecio(int ventavasos){
            ganancias = ganancias + (ventavasos * 0.45);
            vasos = vasos - ventavasos;
            return 0.45 * ventavasos;
        }
        public int total_vasos_utilizados(){
            return 100-vasos;
        }

        public double mostrar_ganancias(){
            return ganancias;
        }
    }

    static class ConAzucar extends SinAzucar{
       public int cucharadas;
        ConAzucar(){
            cucharadas = 80;
        }
        public double calcularPrecio(int ventavasos, int cucharada){
            ganancias = ganancias + (ventavasos * 0.50);
            vasos = vasos - ventavasos;
            if(cucharada * ventavasos >= cucharadas){
                cucharadas = 0;
            }else{
                cucharadas = cucharadas - (cucharada * ventavasos);
            }

            return 0.50 * ventavasos;
        }
        public int total_azucar_utilizados(){
            return 80-cucharadas;
        }
        public int mostrar_cucharadas(){
            return cucharadas;
        }
    }


    public static void main(String[] args) {
        ConAzucar ventas = new ConAzucar();
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int option;
        int vasos;
        int cucharadas;

        System.out.println("---- Venta de limonadas ----");
        while(menu != 3){
            vasos = 0;
            cucharadas = 0;
            System.out.println("----Elegir una opción ----");
            System.out.println("1. Comprar ");
            System.out.println("2. Reporte de ventas ");
            System.out.println("3. Salir");
            menu = sc.nextInt();
            System.out.println("------------------------------");
            if(menu == 1){
                if(ventas.mostrar_vasos() <= 0){
                    System.out.println("Se término los vasos.");
                }else{
                    System.out.println("---- MENÚ --------------------");
                    System.out.println("1. Limonada con azucar ");
                    System.out.println("2. Limonada sin azucar ");
                    System.out.println("------------------------------");
                    option = sc.nextInt();
                    while(ventas.mostrar_vasos() - vasos < 0 || vasos == 0){
                        System.out.println("Cuantos vasos desea comprar? Hay " + ventas.mostrar_vasos() + " disponibles");
                        vasos = sc.nextInt();
                    }
                    if(option == 1){
                        if (ventas.mostrar_cucharadas() <= 0){
                            System.out.println("Se término la azucar.");
                        }else {
                            while(ventas.mostrar_cucharadas() - cucharadas < 0 || cucharadas < 1 || cucharadas > 3){
                                System.out.println("Cuantas cucharadas de azucar por vaso? 1 ,2 ,3  Hay " + ventas.mostrar_cucharadas() + " disponibles");
                                cucharadas = sc.nextInt();
                            }
                            System.out.println("Precio de venta es: $" + ventas.calcularPrecio(vasos, cucharadas));
                        }
                    }else if(option == 2){
                        System.out.println("Precio de venta es: $" + ventas.calcularPrecio(vasos));
                    }
                }
            }else if (menu == 2){
                System.out.println("---- Reporte de ventas -------");
                System.out.println("Facturación: $"  + ventas.mostrar_ganancias());
                System.out.println("Vasos utilizados "  + ventas.total_vasos_utilizados() + "/100");
                System.out.println("cucharaditas de azucar utilizados: "  + ventas.total_azucar_utilizados() + "/80");
                System.out.println("------------------------------");
            }
            System.out.println("------------------------------");
        }
        System.out.println("saliendo...");
        System.out.println("muchas gracias");

    }
}
