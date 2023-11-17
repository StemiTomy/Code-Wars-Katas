/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
*/

function countSmileys(arr) {
  const cleanArr = arr.filter((value) => (value.startsWith(':') || value.startsWith(';')) && (value.endsWith(')') || value.endsWith('D')));

  for (i = 0; i < cleanArr.length; i++) {
    element = cleanArr[i];
    if (element.length >= 3) {
      if (!element.includes('~') && !element.includes('-') || element.length > 3) {
        cleanArr.splice(i, 1);
        i--;
      }
    }
  }

  return cleanArr.length;
}

// mejores soluciones x funciones:
function countSmileys(arr) {
    return arr.filter(x => /^[:;][-~]?[)D]$/.test(x)).length;
  }

const countSmileys = ss => ss.reduce((a, s) => a + /^[:;][-~]?[D)]$/.test(s), 0);