class Node:
    profundidade = 0

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

    def remove(self, elemento):
        valor_removido = int

        if elemento < self.no:
                print(self.no)
                self.esquerda = self.esquerda.remove(elemento)
        elif elemento > self.no:
                valor_removido = self.direita.no
                self.direita = self.direita.remove(elemento)
        else:
            if self.esquerda is None and self.direita is None:
                return None
            if self.esquerda is None:
                print(self.direita.no)
                return self.direita
            if self.direita is None:
                print(self.esquerda.no)
                return self.esquerda
    
    def percorrer_lista(self):
        if self.esquerda is None and self.direita is None:
            Node.profundidade+=1
        if self.esquerda is not None:
            Node.profundidade+=1
            print(self.no)
            self = self.esquerda.percorrer_lista()
        if self.direita is not None:
            Node.profundidade+=1
            self = self.direita.percorrer_lista()
        if self.esquerda is None and self.direita is None:
            print(Node.profundidade)

        return self
        
    
arvore = Node(5)
arvore.insert(4)
arvore.insert(7)
arvore.insert(8)
arvore.insert(6)
arvore.insert(3)

arvore.percorrer_lista()