# Sample input string
input_string = "Hello, World! 123 @#%&*"

# Remove all characters except letters and numbers
cleaned_string = ''.join(char for char in input_string if char.isalnum())

# Output the result
print("Original String:", input_string)
print("Cleaned String:", cleaned_string)
