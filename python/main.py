# Pedimos al usuario ingresar los valores de a, b y c
a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valor de b: "))
c = float(input("Ingrese el valor de c: "))

# Calculamos el resultado de la expresión
numerador = (a ** 3) * ((b ** 2) - (2 * a * c))
denominador = 2 * b
resultado = numerador / denominador

# Mostramos el resultado final
print("El resultado es:", resultado)