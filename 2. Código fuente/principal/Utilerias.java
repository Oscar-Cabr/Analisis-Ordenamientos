/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 09-03-2024
Propósito del archivo: Funciones de uso general para el manejo de arreglos, operaciones de llenar, copiar e intercambiar dos de sus elementos.
*/

package principal;

import java.util.ArrayList;
import java.util.Random;

public class Utilerias {
    public static void copyArray(int array[], int copy[],int size){        
        for(int i = 0; i < size; i++)
            copy[i] = array[i];        
    }

    public static void setArray(int array[], int size, int rango) {
        Random random = new Random();

        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(rango) + 1;
    }
    
    public static void swap(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}