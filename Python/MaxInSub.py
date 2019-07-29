arr = [10, 5, 2, 7, 8, 7]
k = 3
output = []

def getMaxSubArray(arr):
    subArr = []
    if k > len(arr):
        print("k too big")
        return None
    if k == len(arr) or k == 1:
        output.append(max(arr))
        return None
    if k == 0:
        print("k cannot be 0")
        return None
    for i in range(k):
        subArr.append(arr[i])

    output.append(max(subArr))
    arr.pop(0)
    getMaxSubArray(arr)
    
    


getMaxSubArray(arr)
print(output)
    
