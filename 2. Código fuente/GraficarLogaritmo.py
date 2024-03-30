"""
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 23-03-2024
Propósito del archivo: Realizar pruebas sobre el funcionamiento de la graficación con Python y visualización de la forma de la gráfica 'y = x log(x)' iniciando desde 0.01 y desde 200.
"""

import numpy as np
import matplotlib.pyplot as plt

# Definir el rango de valores de x
x = np.linspace(200, 5000, 400)

# Calcular y = x*log(x)
y = x * np.log(x)

# Crear el gráfico
plt.figure(figsize=(8, 6))
plt.plot(x, y, label='$xlog(x)$', color='blue')
plt.title('Gráfica de $xlog(x)$')
plt.xlabel('x')
plt.ylabel('$xlog(x)$')
plt.grid(True)
plt.legend()
plt.show()