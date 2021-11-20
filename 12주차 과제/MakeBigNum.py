def solution(numbers): 
    answer = '' 
    n = list(map(str, numbers)) 
    maxNum = len((n[-1]))
    n.sort(key=lambda x:x*(maxNum), reverse=True) 
    answer = str(int(''.join(n))) 
    return answer

numbers = list(map(int, input().split(',')))
print(solution(numbers))
