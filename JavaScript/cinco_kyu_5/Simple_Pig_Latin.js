/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/

/**
 * Esta expresión regular utiliza \b para coincidir con los límites de palabras,
 * (\w) para capturar la primera letra de la palabra, (\w*) para capturar 
 * el resto de la palabra, y luego reorganiza estas partes en el orden 
 * deseado (resto de la palabra, primera letra, y "ay"). La bandera g
 * al final de la expresión regular indica que la búsqueda debe ser global
 * en todo el string.
 * 
 * @param {*} str 
 * @returns 
 */
function pigIt(str){
    return str.replace(/\b(\w)(\w*)\b/g, '$2$1ay');
}