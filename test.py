
nota_a = 0
nota_b = 0

a = float(input("Please enter the student grade on test 1: \n"))
b = float(input("Please enter the student grade on test 2: \n"))

def media_nota(a, b):
    
    media = (a + b)/2
    return float(media)

print("A média é de: " + str(media_nota(a, b)))