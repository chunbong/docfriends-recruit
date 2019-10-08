q = input()

'''
가장 작은 수와 가장 큰 수가 여러번 나오는데 
어떤 기준으로 a번째, b번째가 정해지는지 명확하지 않아서
가장 작은 수와 가장 큰 수의 위치를 모두 저장하고
a, b를 입력 받아서 가장 작은 수의 인덱스, 가장 큰 수의 인덱스 일 때 정답을 출력하도록 했습니다
'''
a, b = map(int, input().split())

numbers = []
minNumIndex = []
maxNumIndex = []
for i in range(len(q)):
    if "0" <= q[i] <= "9":
        numbers.append(q[i])
    if q[i] == "0":
        minNumIndex.append(i)
    if q[i] == "9":
        maxNumIndex.append(i)
