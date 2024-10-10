file_path = 'file.txt'

try:
    with open(file_path, 'r') as file:
        content = file.read()
        
    print(content)

except FileNotFoundError:
    print(f"The file at {file_path} was not found.")
except IOError:
    print("An error occurred while reading the file.")
  