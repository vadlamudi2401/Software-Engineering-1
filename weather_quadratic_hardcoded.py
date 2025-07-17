def solve_quadratic(a, b, c):
    discriminant = b ** 2 - 4 * a * c
    if discriminant < 0:
        print("No real roots.")
    else:
        root1 = (-b + discriminant**0.5) / (2 * a)
        root2 = (-b - discriminant**0.5) / (2 * a)
        print(f"Roots: {root1}, {root2}")

if __name__ == "__main__":
    # Example coefficients for ax^2 + bx + c = 0
    a = 1
    b = -3
    c = 2
    solve_quadratic(a, b, c)