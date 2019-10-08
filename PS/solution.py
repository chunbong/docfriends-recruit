'''
가장 작은 수와 가장 큰 수가 여러번 나오는데 
어떤 기준으로 a번째, b번째가 정해지는지 명확하지 않아서
가장 작은 수와 가장 큰 수의 위치를 모두 저장하고,
저장된 위치를 출력, a, b를 선택하도록 했습니다.
'''

q = input()

numbers = []
minNumIndex = []
maxNumIndex = []

for i in range(len(q)):     # 전체 문자열에서 숫자 배열을 생성
    if "0" <= q[i] <= "9":
        numbers.append(q[i])

for i in range(len(numbers)):   # 숫자 배열에서 가장 작은 수(0)과 가장 큰 수(9)의 인덱스들을 저장
    if numbers[i] == "0":
        minNumIndex.append(i)
    if numbers[i] == "9":
        maxNumIndex.append(i)

print(minNumIndex)
print(maxNumIndex)

a, b = map(int, input().split())    # a b 형태로 입력
print(a + b)
