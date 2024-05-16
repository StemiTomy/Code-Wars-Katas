/*
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
*/

// sin el retrun en 24, el return no pasa por todas las funciones recursivas anteriores
function digitalRoot(n) {
    let nuevoNum = 0;
    let nArr = String(n).split("").map((n) => {
        return Number(n);
    })
    
    if (nArr.length == 1) return n; 
  
    nArr.forEach((number) => nuevoNum += number);
    
    return digitalRoot(nuevoNum);
}

// mejor solución
function digital_root(n) {
    return (n - 1) % 9 + 1;
}

/*
1. Resta 1 al número original: (n - 1). Esto se hace para ajustar la fórmula a fin de manejar el caso en que el número original es divisible por 9. Si el número original es divisible por 9, (n - 1) será divisible por 9 también, y si no es divisible por 9, entonces (n - 1) no lo será. Restando 1, aseguramos que la fórmula sea válida para todos los casos.

2. Calcula el módulo 9 de (n - 1): (n - 1) % 9. El operador % devuelve el resto de la división. Esto es útil porque los residuos de la división por 9 son precisamente los dígitos de 1 a 9. Si el resultado de la resta es divisible por 9, el residuo será 0, y si no es divisible por 9, el residuo será el número original.

3. Añade 1 al resultado del módulo 9: + 1. Esto se hace para asegurar que el resultado final esté en el rango de 1 a 9, ya que el residuo de la división por 9 siempre estará en ese rango.

En resumen, la fórmula (n - 1) % 9 + 1 calcula la raíz digital de un número de manera eficiente sin necesidad de convertir el número en una cadena ni utilizar recursión. Esta fórmula se basa en la propiedad matemática de que la raíz digital de un número está relacionada con su residuo al dividir por 9.
*/