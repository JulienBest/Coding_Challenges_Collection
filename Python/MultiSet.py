
valuesFalse = [15, 5, 20, 10, 35]
valuesTrue = [15, 5, 20, 10, 35,15,10]
sums = []

def isTrue():
    for i in range(len(sums)):
        for j in range(len(sums)):
            if sums[i] == sums[j]:
               return True
    return False

def subSet(a):
    sums.append(sum(a))
    for i in range(len(a)):
        subSet(a.remove(a[i])


