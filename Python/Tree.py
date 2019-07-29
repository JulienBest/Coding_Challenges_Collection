class Node:
    def __init__(self, val, left = None, right = None):
        self.val = val
        self.left = left
        self.right = right

class Tree:
    def __init__(self):
        self.depthLeft = 0
        self.depthRight = 0

    leftSubTree = []
    rightSubTree= []

    def increaseDepthLeft(self):
        self.depthLeft+=1
    def increaseDepthRight(self):
        self.depthRight+=1

    def serialize(self, root):
        if self.depthLeft == 0 and self.depthRight == 0:
            print('Depth '+str(0)+ '(Root Node): '+ root.val)

        if root.left == None and root.right == None:
            return

        if root.left != None:
            self.increaseDepthLeft()
            print('Depth '+str(self.depthLeft)+ ': '+ root.left.val)

        if root.right != None:
            self.increaseDepthRight()
            print('Depth '+str(self.depthRight)+ ': '+ root.right.val)

        if root.left != None:
            self.serialize(root.left)

        if root.right != None:
            self.serialize(root.right)



    def deserialize(self, string):
        return string


node6 = Node('left6')
node5 = Node('left5')
node4 = Node('right4')
node2 = Node('left2', node5, node4)
node3 = Node('right3', node6)
rootNode = Node('first', node2, node3)
tree = Tree()
tree.serialize(rootNode)
