# Pedimos al usuario ingresar los valores de a y b
a = int(input("Ingrese el valor de a: "))
b = int(input("Ingrese el valor de b: "))

# Mostramos los valores sin intercambiar
print("Valores originales:")
print("a =", a)
print("b =", b)

# Intercambiar los valores utilizando una variable auxiliar
aux = a
a = b
b = aux

# Mostramos el resultado final
print("Valores intercambiados:")
print("a =", a)
print("b =", b)