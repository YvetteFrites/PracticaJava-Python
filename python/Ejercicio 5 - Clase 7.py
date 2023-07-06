calific = int(input('Digite una calificacion del 0 al 10: '))

if 9 <= calific <= 10:
    print('A')
elif 8 <= calific < 9:
    print('B')
elif 7 <= calific < 8:
    print('C')
elif 6 <= calific < 7:
    print('D')
elif 0 <= calific < 6:
    print('F')
else:
    print('Calificacion no valida')
