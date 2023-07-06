import math

# Pedimos al usuario que ingrese el radio
radio = float(input("Ingrese el radio del círculo: "))

# Calcular el área
area = math.pi * radio ** 2

# Calcular la longitud
longitud = 2 * math.pi * radio

# Mostrar los resultados
print("El área del círculo es:", area)
print("La longitud de la circunferencia es:", longitud)
