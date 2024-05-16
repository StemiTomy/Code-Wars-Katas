/*
You need to write regex that will validate a password to make sure it meets the following criteria:

At least six characters long
contains a lowercase letter
contains an uppercase letter
contains a digit
only contains alphanumeric characters (note that '_' is not alphanumeric)
*/
/* Explicación
// ^ == principio palabra y $ == final palabra
// {6,} == 6 o más
// (?=.*[a-z]) == contiene almenos 1 minúscula
// (?=.*\d) == que contenga un dígito
// [A-Za-z\d] == solo letras y números alphanuméricos
*/
const REGEXP = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[A-Za-z\d]{6,}$/;
