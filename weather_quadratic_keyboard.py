def solve_quadratic(a, b, c):
    discriminant = b ** 2 - 4 * a * c
    if discriminant < 0:
        print("No real roots.")
    else:
        root1 = (-b + discriminant**0.5) / (2 * a)
        root2 = (-b - discriminant**0.5) / (2 * a)
        print(f"Roots: {root1}, {root2}")

if __name__ == "__main__":
    a = float(input("Enter a: "))
    b = float(input("Enter b: "))
    c = float(input("Enter c: "))
    solve_quadratic(a, b, c)