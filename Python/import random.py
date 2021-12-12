import random

LowWard = "qwertyuiopasdfghjk"
UpWard = "QWERTYUIOPASDFGHJKLZXCVBNM"
Number = "0123456789"
Symbol = "{}#[]()@$!%^&"

all = LowWard + UpWard + Number + Symbol
length = 9
password = "" .join(random.sample(all,length))
print("The Password you generate is: ",password)
