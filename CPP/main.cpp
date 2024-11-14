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

int removeNode(node *&inicio, node *&fim)
{    
    int valorRemovido;

    if(inicio == nullptr){
        cout << "A lista está vazia!\n";
        return -1;
    }

    valorRemovido = inicio->data;

    if(inicio == fim){
        delete inicio;
        inicio = nullptr;
        fim = nullptr;
    } else {
        node *temp = inicio;
        inicio = inicio->proximo;
        delete temp;
    }

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
    removeNode(primeiro, ultimo);
    imprimir(primeiro);

    return 0;
}
