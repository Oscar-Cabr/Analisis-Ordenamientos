/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 14-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento InsertionSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar y su tamaño.
*/

package ordenamientos;

public class InsertionSort{
  static int conteo_operaciones;
  static int conteo_comparaciones;
  static int conteo_intercambios;
  
  public static int insertionSort(int[] array, int size){
    int j, aux;
    conteo_operaciones = 0;

    for(int i = 1; i < size; i++){
      j = i;
      aux = array[i];
      while (j>0 && aux < array[j-1]){
        ++conteo_operaciones;
        array[j] = array[j-1];
        j--;
      }
      array[j]=aux;
    }

    return conteo_operaciones;
  }

}