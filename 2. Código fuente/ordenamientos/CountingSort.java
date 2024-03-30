/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 22-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento CountingSort, que devuelve el valor entero del número de operaciones realizadas, a partir del arreglo a ordenar, su tamaño y el rango de sus elementos.
*/

package ordenamientos;

import principal.Utilerias;

public class CountingSort {
    static int conteo_operaciones;

    public static int countingSort(int[] array, int size, int numElements){
        conteo_operaciones = 0;

        int[] counting = new int[numElements + 1];
        int[] sorted = new int[size];

        count(array, counting, size);
        suma(counting, numElements);
        sort(array, sorted, counting, size);

        return conteo_operaciones;
    }
    static void count(int[] array, int[] counting, int size){
        for(int i = 0; i < size; i++){
            conteo_operaciones++;
            counting[array[i]]++;
        }
    }
    static void suma(int[] counting, int numElements){
        for(int i = 1; i <= numElements; i++){
            counting[i] += counting[i - 1];
        }
    }
    static void sort(int[] array, int[] sorted, int[] counting, int size){
        for(int i = size - 1; i >= 0; i--){
            conteo_operaciones++;
            sorted[counting[array[i]] - 1] = array[i];
            counting[array[i]]--;
        }
        Utilerias.copyArray(sorted, array, size);
    }
}
