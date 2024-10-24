#include <iostream>
using namespace std;

struct node
{
    int data;
    node *proximo;
};

void insertNode(node *&primeiro, node *&ultimo, int elemento)
{
    node *novo = new node();
    novo->data = elemento;
    novo->proximo = nullptr;

    if (primeiro == nullptr){
        primeiro = novo;
        ultimo = novo;
        return;
    }

    ultimo->proximo = novo;
    ultimo = novo;
}

int removeNode(node *&n)
{    
    int valorRemovido = -1; // Valor padrão caso a lista esteja vazia

    if(n != nullptr){
        node *primeiraPosicao = n; // Armazena o primeiro nó
        valorRemovido = primeiraPosicao->data; // Guarda o valor a ser removido
        n = n->proximo; // Move o ponteiro para o próximo nó
        primeiraPosicao = nullptr; // Libera a memória do nó removido
    }
    
    cout << "valor removido " << valorRemovido << "\n"; // Corrigido para imprimir o valor
    return valorRemovido;
}

void imprimir(node *l)
{
    while (l != NULL)
    {
        cout << l->data; 
        l = l->proximo;
        cout << "\n";
    }
    cout << "fim da lista\n";
}

int main()
{
    node *primeiro = NULL;
    node *ultimo = NULL;

    insertNode(primeiro, ultimo, 10); 
    imprimir(primeiro);
    insertNode(primeiro, ultimo, 20); 
    imprimir(primeiro);
    insertNode(primeiro, ultimo, 30); 
    imprimir(primeiro);
    removeNode(primeiro); // Apenas chama a função
    imprimir(primeiro);

    return 0;
}
