input_sentence = "This is a test test sentence with with duplicate words words."

words = input_sentence.split()

unique_words = []
for word in words:
    if word not in unique_words:
        unique_words.append(word)

output_sentence = ' '.join(unique_words)

print("Original Sentence:", input_sentence)
print("Sentence without duplicates:", output_sentence)
