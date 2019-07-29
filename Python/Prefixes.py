stringSet = ['dog', 'deer', 'deal']
prefix = 'de'

def getPrefixSet():
    outputSet = []
    for word in stringSet:
        counter = 0
        counter2 = 0
        for letter in prefix:
            if word[counter] == letter:
                counter2 += 1;
            counter += 1
        if counter2 == len(prefix):
            outputSet.append(word)

    return outputSet

print(getPrefixSet())
            

            
