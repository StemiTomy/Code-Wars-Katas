/*
The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
*/
function count(string) {
    var letterValue = 0;
    const dict = new Object();

    for (var letter of string) {
        for (var i = 0; i < string.length; i++) {
            if (letter == string.charAt(i)) letterValue += 1;
        }
        dict[letter] = letterValue;
        letterValue = 0;
    }
    if (string != "") return dict;

    return {};
}

// mejor solución
function count (string) {  
    var count = {};
    string.split('').forEach(function(s) {
       count[s] ? count[s]++ : count[s] = 1;
    });
    return count;
}