#include <iostream>
using namespace std;

struct node
{
    int data;
    node *proximo;
};

void insertNode(node *&n, int elemento)
{
    node *primeiro = new node;
    node *ultimo = primeiro;

    primeiro->data = elemento;
    primeiro->proximo = nullptr;

    if (n == nullptr) {
        n = primeiro;
        ultimo = primeiro;
        return;
    }

    node *u = n;

    while (u->proximo != nullptr)
    {
        u = u->proximo;
    }

    u->proximo = ultimo;
}


int removeNode(node *&n)
{    
    int valorRemovido;

    if(n != nullptr){
        node *&primeiraPosicao = n;
        valorRemovido = primeiraPosicao->data;

        n = n->proximo;
    }

    return valorRemovido;
}

void imprimir(node *l)
{
    while (l != NULL)
    {
        cout << l->data << "\n";
        l = l->proximo;
    }
}

int main()
{
    node *lista = NULL; // Inicializa a lista como vazia

    // Inserindo alguns elementos na lista
    insertNode(lista, 10); // Insere 10
    insertNode(lista, 20); // Insere 20
    insertNode(lista, 30); // Insere 30
    removeNode(lista);

    // Imprimindo os elementos da lista
    cout << "Elementos da lista:\n";
    imprimir(lista); // Chama a função para imprimir os elementos

    return 0;
}