/*
Write a function named first_non_repeating_letter that takes a string input, and returns the first character that is not repeated anywhere in the string.

For example, if given the input 'stress', the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.

As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.

If a string contains all repeating characters, it should return an empty string ("") or None -- see sample tests.
*/

// no te olvides de limpiarla antes! esto ha sido sin querer 'sucio'
function firstNonRepeatingLetter(s) {
    let letraMAX = 2;
    let letraMenor = 1;
    let letraFinal = '';
    let strMin = s.toLowerCase();
    
    for (let i = 0; i < s.length; i++) {
      let letraInicial = strMin[i];
      console.log("LI: "+letraInicial + " Vuelta "+(i+1))
      for (let z = 0; z < s.length; z++){
        let letraEspejo = strMin[z];
        if (letraInicial == letraEspejo) {
          letraMenor += 1;
          console.log("LM '"+z+"' "+letraMenor)
        }
      }
      
      if (letraMenor <= 2) {
        letraMenor = letraMAX
        letraFinal = s[i];
        return letraFinal;
      }
      
      letraMenor = 1;
    }
    return letraFinal;
  
  }

// mejor solución
function firstNonRepeatingLetter(s) {
    for(var i in s) {
      if(s.match(new RegExp(s[i],"gi")).length === 1) {
        return s[i];
      }
    }
    return '';
  }