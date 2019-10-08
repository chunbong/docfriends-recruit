q = input()

numbers = []
for i in range(len(q)):
    if "0" <= q[i] <= "9":
        numbers.append(q[i])
