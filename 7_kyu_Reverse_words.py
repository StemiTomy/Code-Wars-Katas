"""7 kyu Reverse words
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
"""

def reverse_words(text):
    """Reverse words function

    Args:
        text (String): given a string

    Returns:
        String: returns a string reversed word by word
    """
    text = text.split(" ")
    s = ""
    for word in text:
        word = word[::-1]
        s += word+" "
    s = s[:-1]
    return s
