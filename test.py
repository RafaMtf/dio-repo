
nota_a = 0
nota_b = 0

a = float(input("Please enter the student A grade on the test: "))
b = float(input("Please enter the student B grade on the test: "))

def media_nota(a, b):
    
    media = (a + b)/2
    return float(media)

print("A média é de: " + str(media_nota(a, b)))