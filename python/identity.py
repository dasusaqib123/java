# Identity
print("\n--- Identity Operators ---")
a=int(input("enter number:"))
b=int(input("enter another number:"))
m = [a, b]
n = [a, b]
p = m
print("m is p:", m is p)     
print("m is n:", m is n)     
print("m is not n:", m is not n)
