def is_triangle(sides: list[int | float]) -> bool:
    a, b, c = sides[0], sides[1], sides[2]
    if a == 0 and b == 0 and c == 0:
        return False
    return  a + b >= c and b + c >= a and a + c >= b

def equilateral(sides: list[int | float]):
    return (sides[0] == sides[1] == sides[2]) and is_triangle(sides)


def isosceles(sides: list[int | float]):
    return (sides[0] == sides[1] or sides[0] == sides[2] or sides[1] == sides[2]) and is_triangle(sides)


def scalene(sides: list[int | float]):
    return (sides[0] != sides[1] and sides[0] != sides[2] and sides[1] != sides[2]) and is_triangle(sides)
