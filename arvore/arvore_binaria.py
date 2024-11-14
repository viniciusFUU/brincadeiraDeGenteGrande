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
        if elemento < self.no:
            if self.esquerda:
                self.esquerda = self.esquerda.remove(elemento)
        elif elemento > self.no:
            if self.direita:
                self.direita = self.direita.remove(elemento)
        else:
            print(f'elemento {elemento} removido da arvore')
            
            if self.esquerda is None:
                return self.direita
            if self.direita is None:
                return self.esquerda
            
            menor_no = self.direita
            while menor_no.esquerda:
                menor_no = menor_no.esquerda
            self.no = menor_no.no

            self.direita = self.direita.remove(menor_no.no)

        return self
    
    def calcular_profundidade(self):
        esquerda_profundidade = self.esquerda.calcular_profundidade() if self.esquerda else 0
        direita_profundidade = self.direita.calcular_profundidade() if self.direita else 0
        return 1 + max(esquerda_profundidade, direita_profundidade)
        
    
arvore = Node(5)
arvore.insert(4)
arvore.insert(7)
arvore.insert(8)
arvore.insert(6)
arvore.insert(3)

arvore.remove(3)
arvore.remove(8)

print(arvore.calcular_profundidade())