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

n = (int, input())
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

print(solution(n, arr1, arr2))