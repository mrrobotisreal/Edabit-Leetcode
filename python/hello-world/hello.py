# I could have simply done:
# print("Hello 世界!")
# But that seemed too simple, so I went with template literals

greeting = "Hello"
name = "世界"

print('String example 1:')
print(f'{greeting} {name}!')
# The code above is the newest way of writing template literals
# However, we could also use the old way of writing template literals
# The code below demonstrates this
print('String example 2:')
print('%s %s!' % (greeting, name))