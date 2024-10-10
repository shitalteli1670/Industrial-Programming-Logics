try:
    result = 10 / 0
except ZeroDivisionError as e:
    print(f"ZeroDivisionError: {e}")

try:
    result = float('inf') * 2 
    print(result)
except OverflowError as e:
    print(f"OverflowError: {e}")
