# 비밀지도
# https://programmers.co.kr/learn/courses/30/lessons/17681 

def solution(n, arr1, arr2):
    answer = []
    for i,j in zip(arr1,arr2):
        a12 = str(bin(i|j)[2:])
        a12 = a12.rjust(n,'0')
        a12 = a12.replace('1','#')
        a12 = a12.replace('0',' ')
        answer.append(a12)

    return answer

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
n = len(arr1)

# n = 5
# arr1 = [9, 20, 28, 18, 11]
# arr2 = [30, 1, 21, 17, 28]

print(solution(n, arr1, arr2))