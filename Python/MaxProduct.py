
arr = [-10, -10, 5, 2]
products = []

def multiply(a):
	sum = 1
	for i in a:
		sum = sum*i
	return sum


def maxProduct(a):
	products.append(multiply(a))

	if (len(a) >1):
		for i in a:
			maxProduct(a.remove(i))

	

maxProduct(arr)
print(products)