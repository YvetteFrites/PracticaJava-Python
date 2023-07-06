# Pedimos al usuario ingresar los valores de a, b y c
a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valor de b: "))
c = float(input("Ingrese el valor de c: "))

# Calculamos el resultado de la expresión
resultado = ((a ** 3) * ((b ** 2) - (2 * a * c))) / (2 * b)

# Mostramos el resultado final
print("El resultado es:", resultado)