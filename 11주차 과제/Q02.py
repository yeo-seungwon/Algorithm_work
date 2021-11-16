def findElement(arr, n):
    answer = []
    leftMax = [None] * n
    leftMax[0] = arr[0]
 
    for i in range(1, n):
        leftMax[i] = max(leftMax[i-1], arr[i-1])
 
    rightMin = [None]*n
    rightMin[n-1] = arr[n-1]
 
    for i in range(n-2, -1, -1):
        rightMin[i] = min(rightMin[i+1], arr[i])

    for i in range(1, n-1):
        if leftMax[i-1] <= arr[i] and arr[i] <= rightMin[i+1]:
            answer.append(i)
 
    if len(answer) == 0 :
        return -1

    return answer
 
if __name__ == "__main__":

    arr = list(map(int, input().split(',')))
    n = len(arr)
    print("해당 조건을 만족하는 모든 인덱스 번호 : ", findElement(arr, n))