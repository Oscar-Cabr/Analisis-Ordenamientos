/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 22-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento PancakeSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar y su tamaño.
*/

package ordenamientos;

public class PancakeSort {
    static int conteo_operaciones;

    public static int pancakeSortBegin(int[] arr, int size) {
        conteo_operaciones = 0;
        pancakeSort(arr, size);
        return conteo_operaciones;
    }

    static void flip(int arr[], int i) {
        int temp, start = 0;
        while (start < i) {
            conteo_operaciones++;
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    static int findMax(int arr[], int n) {
        int mi = 0;
        for (int i = 0; i < n; ++i)
            if (arr[i] > arr[mi])
                mi = i;
        return mi;
    }

    static void pancakeSort(int arr[], int n) {
        for (int i = n; i > 1; i--) {
            int mi = findMax(arr, i);
            if (mi != i - 1) {
                flip(arr, mi);
                flip(arr, i - 1);
            }
        }
    }
}