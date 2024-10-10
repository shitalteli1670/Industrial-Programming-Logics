input_string = "Valid_String_123"

allowed_characters = set("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_")
is_valid = all(char in allowed_characters for char in input_string)

if is_valid:
    print("The string contains only uppercase and lowercase letters, numbers, and underscores.")
else:
    print("The string contains invalid characters.")
