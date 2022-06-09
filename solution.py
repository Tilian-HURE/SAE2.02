# return string without spaces
def erase(text):
    """
    Removes only single spaces from given string.
    :param text : string to edit
    :return : edited string
    """
    listedText = list(text)
    for i, char in enumerate(listedText):
        if (char == " " and listedText[max(i-1, 1)] != " " and listedText[min(i+1, len(listedText)-2)] != " "):
            del listedText[i]
    return "".join(char for char in listedText)