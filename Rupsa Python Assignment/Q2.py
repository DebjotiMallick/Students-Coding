word = 'ATGGGTCCG'
sorted_word = sorted(word)
sorted_word = ''.join(sorted_word)
print(sorted_word)

last_char = ""
max_char = ""
current_seq_len = 0
max_seq_len = 0

for c in sorted_word:
    if c == last_char:
        current_seq_len += 1
        if current_seq_len > max_seq_len:
            max_seq_len = current_seq_len
            max_char = c
    else:
        current_seq_len = 1
        last_char = c

print(max_char + " : " + str(max_seq_len))