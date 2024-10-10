file_path = 'file.txt'

text_to_append = "\nThis is the appended text."

try:
    with open(file_path, 'a') as file:
        file.write(text_to_append)

    with open(file_path, 'r') as file:
        content = file.read()
        print("Updated File Content:")
        print(content)

except FileNotFoundError:
    print(f"The file at {file_path} was not found.")
except IOError:
    print("An error occurred while accessing the file.")
