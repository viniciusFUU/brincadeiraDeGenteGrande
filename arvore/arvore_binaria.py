class Node:
    def __init__(self, elemento):
        self.no = elemento
        self.esquerda = None
        self.direita = None

    def insert(self, elemento):
        if elemento < self.no:
            if self.esquerda == None:
                self.esquerda = Node(elemento)
            else:
                self.esquerda.insert(elemento)
        elif elemento > self.no:
            if self.direita == None:
                self.direita = Node(elemento)
            else:
                self.direita.insert(elemento)
    
arvore = Node(5)
arvore.insert(4)
arvore.insert(8)
arvore.insert(7)
arvore.insert(6)

print(arvore.esquerda.no)
print(arvore.no)
print(arvore.direita.esquerda.esquerda.no)
print(arvore.direita.esquerda.no)
print(arvore.direita.no)