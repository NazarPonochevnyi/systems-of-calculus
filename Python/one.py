def start_10(num, n):
    len_n = len(num) - 1
    return trek_10(num, len_n, n, 0, 0)

def trek_10(num, len_n, n, i, result):
    result += int(num[i]) * pow(n, len_n - i)
    if i != len_n:
        return trek_10(num, len_n, n, i + 1, result)
    return result

def trek_n(num, n, result = ''):
    dm = divmod(num, n)
    if num != 0:
        return trek_n(dm[0], n, str(dm[1]) + result)
    return result

num1 = start_10(input('\nInput first number: ').strip(),
                int(input('Input system of calculus: ')))
num2 = start_10(input('\nInput second number: ').strip(),
                int(input('Input system of calculus: ')))

do = {
    '+': num1 + num2,
    '-': num1 - num2,
    '*': num1 * num2,
    '/': num1 / num2,
}

result = trek_n(do[input('\nInput action: ').strip()],
                int(input('Input system of calculus for answer: ')))
print('\nResult: ' + result)
