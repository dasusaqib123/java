# Assignment
print("\n--- Assignment Operators ---")
a=int (input("enter the vlaue:"))
b=int(input("enter another value:"))
x = a
print("Start: x =", x)
x += b
print("x += b:", x)
x -= b
print("x -= b:", x)
x *= b
print("x *= b:", x)
if b != 0:
    x //= b
    print("x //= b:", x)
