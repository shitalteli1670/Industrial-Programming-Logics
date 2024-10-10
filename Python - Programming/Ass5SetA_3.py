allowed_characters = set("abcdefghijklmnopqrstuvwxyz0123456789_")

input_string = "valid_string_123"

is_valid = all(char in allowed_characters for char in input_string)

if is_valid:
    print("The string contains only defined characters.")
else:
    print("The string contains invalid characters.")
