array = [1,2,3,4,5]
outputArray = []

def getProductArray():
    for i in range(len(array)):
        product = 1
        for j in range(len(array)):
            if i != j:
                product *= array[j]
        outputArray.append(product)

    for i in range(len(outputArray)):
        print(outputArray[i])

getProductArray()
        
    
