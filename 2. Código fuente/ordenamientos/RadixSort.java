/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 22-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento RadixSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar y su tamaño.
*/

package ordenamientos;

import java.util.ArrayDeque;
import java.util.Queue;

public class RadixSort {
    static int conteo_operaciones;

    public static int radixSort(int[] array, int size) {
        Queue<Integer> cola0 = new ArrayDeque<>();
        Queue<Integer> cola1 = new ArrayDeque<>();
        Queue<Integer> cola2 = new ArrayDeque<>();
        Queue<Integer> cola3 = new ArrayDeque<>();
        Queue<Integer> cola4 = new ArrayDeque<>();
        Queue<Integer> cola5 = new ArrayDeque<>();
        Queue<Integer> cola6 = new ArrayDeque<>();
        Queue<Integer> cola7 = new ArrayDeque<>();
        Queue<Integer> cola8 = new ArrayDeque<>();
        Queue<Integer> cola9 = new ArrayDeque<>();

        int iteraciones, key, copyKey, k;
        conteo_operaciones = 0;

        key = getMax(array, size);
        copyKey = key;
        iteraciones = getIterations(copyKey);

        for (int i = 0; i < iteraciones; i++) {
            for (int j = 0; j < size; j++) {
                ++conteo_operaciones;
                if (i == 0) {
                    key = array[j] % 10;
                } else {
                    key = array[j] / ((int) Math.pow(10, i)) % 10;
                }
                switch (key) {
                    case 0:
                        cola0.add(array[j]);
                        break;
                    case 1:
                        cola1.add(array[j]);
                        break;
                    case 2:
                        cola2.add(array[j]);
                        break;
                    case 3:
                        cola3.add(array[j]);
                        break;
                    case 4:
                        cola4.add(array[j]);
                        break;
                    case 5:
                        cola5.add(array[j]);
                        break;
                    case 6:
                        cola6.add(array[j]);
                        break;
                    case 7:
                        cola7.add(array[j]);
                        break;
                    case 8:
                        cola8.add(array[j]);
                        break;
                    case 9:
                        cola9.add(array[j]);
                        break;
                }
            }
            k = 0;
            while (!cola0.isEmpty())
                array[k++] = cola0.remove();
            while (!cola1.isEmpty())
                array[k++] = cola1.remove();
            while (!cola2.isEmpty())
                array[k++] = cola2.remove();
            while (!cola3.isEmpty())
                array[k++] = cola3.remove();
            while (!cola4.isEmpty())
                array[k++] = cola4.remove();
            while (!cola5.isEmpty())
                array[k++] = cola5.remove();
            while (!cola6.isEmpty())
                array[k++] = cola6.remove();
            while (!cola7.isEmpty())
                array[k++] = cola7.remove();
            while (!cola8.isEmpty())
                array[k++] = cola8.remove();
            while (!cola9.isEmpty())
                array[k++] = cola9.remove();
        }

        return conteo_operaciones;
    }

    static int getMax(int[] array, int size) {
        int max = 0;
        for (int i = 0; i < size; i++)
            if (max < array[i])
                max = array[i];
        return max;
    }

    static int getIterations(int key) {
        int iteraciones = 0;
        do {
            key /= 10;
            iteraciones++;
        } while (key != 0);
        return iteraciones;
    }
}
