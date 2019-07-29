array = [1,3,4,5]

def smallestNotInArray():
   maxNum = max(array)
   temp = 0
   while maxNum > 0:
      maxNum -= 1
      counter = 0;
      for i in range(len(array)):
         if(array[i] == maxNum):
            counter+=1
         if counter < len(array):
            temp = maxNum
   return temp

print(smallestNotInArray())
      
         
         
            
            
