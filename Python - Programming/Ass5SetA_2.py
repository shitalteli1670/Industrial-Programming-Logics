input_string = "this_is_a_test_string_with_lowercase_letters_and_underscores"

parts = input_string.split('_')

matches = [part for part in parts if part.islower()]

print("Sequences of lowercase letters joined by underscores:")
for match in matches:
    print(match)
