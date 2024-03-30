"""
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 22-03-2024
Propósito del archivo: Leer los valores promedio del conteo de operaciones producido por cada algoritmo de ordenamiento de sus archivos de texto correspondientes, y mostrar la gráfica de complejidad de ellos en tres bloques distintos.
"""

import matplotlib.pyplot as plt
import numpy as np

def graficar_A(insertion, selection, bubble, pancake, tamaños):
  tamaños_np = np.array(tamaños)
  y_cuadrado = tamaños_np ** 2
  plt.figure('Gráfico de complejidad para Insertion, Selection y Bubble Sort')
  plt.plot(tamaños, y_cuadrado, label='y = x^2')
  plt.plot(tamaños, insertion, label='InsertionSort')
  plt.plot(tamaños, selection, label='SelectionSort')
  plt.plot(tamaños, bubble, label='BubbleSort')
  plt.plot(tamaños, pancake, label='PancakeSort')
  plt.title('Gráfico de complejidad para Insertion, Selection, Bubble y PancakeSort')
  plt.xlabel('Número de elementos de entrada')
  plt.ylabel('Número de operaciones realizadas')
  plt.grid(True)
  plt.legend()
  plt.show()

def graficar_B(heap, quick, merge, tamaños):
  plt.figure('Gráfico de complejidad para Heap, Quick y Merge Sort')
  plt.plot(tamaños, tamaños * np.log(tamaños), label='y = xlog(x)')
  plt.plot(tamaños, heap, label='HeapSort')
  plt.plot(tamaños, quick, label='QuickSort')
  plt.plot(tamaños, merge, label='MergeSort')
  plt.title('Gráfico de complejidad para Heap, Quick y Merge Sort')
  plt.xlabel('Número de elementos de entrada')
  plt.ylabel('Número de operaciones realizadas')
  plt.grid(True)
  plt.legend()
  plt.show()

def graficar_C(counting, radix, tamaños):
  plt.figure('Gráfico de complejidad para Heap, Quick y Merge Sort')
  plt.plot(tamaños, tamaños, label='y = x')
  plt.plot(tamaños, counting, label='CountingSort')
  plt.plot(tamaños, radix, label='RadixSort')
  plt.title('Gráfico de complejidad para Counting y Radix Sort')
  plt.xlabel('Número de elementos de entrada')
  plt.ylabel('Número de operaciones realizadas')
  plt.grid(True)
  plt.legend()
  plt.show()

def graficar_D(insertion, selection, bubble, pancake, heap, quick, merge, counting, radix, tamaños):
  plt.figure('Gráfico de complejidad para todos los ordenamientos')
  plt.plot(tamaños, insertion, label='InsertionSort')
  plt.plot(tamaños, selection, label='SelectionSort')
  plt.plot(tamaños, bubble, label='BubbleSort')
  plt.plot(tamaños, pancake, label='PancakeSort')
  plt.plot(tamaños, heap, label='HeapSort')
  plt.plot(tamaños, quick, label='QuickSort')
  plt.plot(tamaños, merge, label='MergeSort')
  plt.plot(tamaños, counting, label='CountingSort')
  plt.plot(tamaños, radix, label='RadixSort')
  plt.title('Gráfico de complejidad para todos los ordenamientos')
  plt.xlabel('Número de elementos de entrada')
  plt.ylabel('Número de operaciones realizadas')
  plt.grid(True)
  plt.legend()
  plt.show()

def graficar_E(heap, quick, merge, counting, radix, tamaños):
  plt.figure('Gráfico de complejidad para los ordenamientos con comportamiento nlog(n) y n')
  plt.plot(tamaños, heap, label='HeapSort')
  plt.plot(tamaños, quick, label='QuickSort')
  plt.plot(tamaños, merge, label='MergeSort')
  plt.plot(tamaños, counting, label='CountingSort')
  plt.plot(tamaños, radix, label='RadixSort')
  plt.title('Gráfico de complejidad para los ordenamientos con comportamiento nlog(n) y n')
  plt.xlabel('Número de elementos de entrada')
  plt.ylabel('Número de operaciones realizadas')
  plt.grid(True)
  plt.legend()
  plt.show()

with open("tamanios.txt", "r") as file:
  tamaños = [int(line.strip()) for line in file.readlines()]
with open("insertion.txt", "r") as file:
  insertion = [int(line.strip()) for line in file.readlines()]
with open("selection.txt", "r") as file:
  selection = [int(line.strip()) for line in file.readlines()]
with open("bubble.txt", "r") as file:
  bubble = [int(line.strip()) for line in file.readlines()]
with open("heap.txt", "r") as file:
  heap = [int(line.strip()) for line in file.readlines()]
with open("quick.txt", "r") as file:
  quick = [int(line.strip()) for line in file.readlines()]
with open("merge.txt", "r") as file:
  merge = [int(line.strip()) for line in file.readlines()]
with open("counting.txt", "r") as file:
  counting = [int(line.strip()) for line in file.readlines()]
with open("radix.txt", "r") as file:
  radix = [int(line.strip()) for line in file.readlines()]
with open("pancake.txt", "r") as file:
  pancake = [int(line.strip()) for line in file.readlines()]

graficar_A(insertion, selection, bubble, pancake, tamaños)
graficar_B(heap, quick, merge, tamaños)
graficar_C(counting, radix, tamaños)
graficar_D(insertion, selection, bubble, pancake, heap, quick, merge, counting, radix, tamaños)
graficar_E(heap, quick, merge, counting, radix, tamaños)