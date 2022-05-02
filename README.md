# limonada
ejemplo de java problema de la limonada

Se desea llevar un registro de las ventas de limonadas del puesto de un niño del vecindario.  Hay dos tipos de limonadas que vende: endulzadas a 0.50 centavos el vaso y sin dulce a 0.45 centavos. El  DIA se inicia con 100 vasos y 80 cucharadas de azúcar y cada limonada consume 1 a 3 cucharadas.
Haga un programa que presente un menú que controle la preferencia de limonada, una opción de impresión de totales: de dinero, de vasos y de azúcar consumidos
Valide la venta con respecto a la cantidad de vasos y azúcar.
El programa debe aplicar la característica de herencia y considerar una clase que fue desarrollada  para hacer los cálculos de  las limonadas sin azúcar,  que  es la siguiente:
import java.io.*;
class SinAzucar // Es la superclase
{ private int vasos;
  SinAzucar() //Es el constructor
  {        vasos = 100;   }
  public int mostrar_vasos()
  {  return vasos;    }
  public double calcularPrecio(int ventavasos) 
  {        vasos = vasos - ventavasos;
            return 0.45 * ventavasos;
  }
  public int total_vasos_utilizados()
  {return 100-vasos;
  }
}
![image](https://user-images.githubusercontent.com/49157674/166312598-de3bd455-216a-4bf5-97e0-289030030242.png)
