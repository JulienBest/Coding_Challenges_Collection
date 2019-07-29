list_size = raw_input("How many list items? ")
list = []
for i in range(int(list_size)):
    list.append(int(raw_input('Enter number '+str(i+1)+': ')))
numberK = int(raw_input("What is the number K? "))
def isAddingUp():
    for i in range(int(list_size)):
        for j in range(int(list_size)-1):
            if list[i] + list[j+1] == numberK:
                print(str(list[i]) + ' + ' + str(list[j+1]))
                return True
    return False
print(isAddingUp())

