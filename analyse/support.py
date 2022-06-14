from random import randint, choice


def random_spaced_string(size=10):
    """
    Generates random sized string with randomly placed spaces
    :param size : size of the string
    :return : generated string
    """
    return ''.join(chr(choice([randint(65, 122), 32])) for i in range(size)) # uses char 65 to 122 from ASCII table