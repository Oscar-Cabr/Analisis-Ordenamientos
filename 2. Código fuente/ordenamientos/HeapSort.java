/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 22-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento HeapSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar y su tamaño.
*/

package ordenamientos;

import principal.Utilerias;

public class HeapSort{
  static int heapSize;
  static int conteo_operaciones;
  
  public static int heapSort(int[] array, int size){
    conteo_operaciones = 0;
    
    buildHeap(array, size);
    for(int i = size-1; i > 0; i--){
      Utilerias.swap(array, 0, heapSize);
      heapSize--;
      heapify(array, 0, size);
    }

    return conteo_operaciones;
  }
  public static void heapify(int[] array, int i, int size){
    ++conteo_operaciones;
    int l = 2*i+1;
    int r = 2*i+2;
    int largest;
    
    if(l <= heapSize && array[l] > array[i])
      largest = l;
    else
      largest = i;
    if(r <= heapSize && array[r] > array[largest])
      largest = r;
    if(largest != i){
      Utilerias.swap(array, i, largest);
      heapify(array, largest, size);
    }
  }
  public static void buildHeap(int[] array, int size){
    heapSize = size-1;
    for(int i = (size-1)/2; i >= 0; i--){
      ++conteo_operaciones;
      heapify(array, i, size);
    }
  }
}