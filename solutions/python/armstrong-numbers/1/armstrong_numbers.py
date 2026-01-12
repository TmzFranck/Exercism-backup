def is_armstrong_number(number: int) -> bool:
    return sum([int(i) ** len(str(number)) for i in str(number)]) == number
