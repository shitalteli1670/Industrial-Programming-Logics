file_path = 'file.txt'

num_characters = 0
num_words = 0
num_lines = 0

try:
    with open(file_path, 'r') as file:
        for line in file:
            num_lines += 1                   
            num_characters += len(line)      
            num_words += len(line.split())   
            
    print(f"Number of characters: {num_characters}")
    print(f"Number of words: {num_words}")
    print(f"Number of lines: {num_lines}")

except FileNotFoundError:
    print(f"The file at {file_path} was not found.")
except IOError:
    print("An error occurred while reading the file.")
