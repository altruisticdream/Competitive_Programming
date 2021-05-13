import random
lower="abcdefghijklmnopqrstuvwxyz"
upper="ABCDEFGHIJKLMONPQRSTUVWXYZ"
number="0123456789"
symbol="[]{}()*:/,._-"

all=lower+upper+number+symbol
length=16
password="".join(random.sample(all,length))
print(password)
