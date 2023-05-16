package bulvee.com.tests.binarytree;

public class ArvoreBinaria {
    NoArvoreBinaria raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private NoArvoreBinaria inserirRecursivo(NoArvoreBinaria no, int valor) {
        if (no == null) {
            return new NoArvoreBinaria(valor);
        }

        if (valor < no.valor) {
            no.filhoEsquerdo = inserirRecursivo(no.filhoEsquerdo, valor);
        } else if (valor > no.valor) {
            no.filhoDireito = inserirRecursivo(no.filhoDireito, valor);
        } else {
            // Valor já existe na árvore
            return no;
        }

        return no;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    private boolean buscarRecursivo(NoArvoreBinaria no, int valor) {
        if (no == null) {
            return false;
        }

        if (valor == no.valor) {
            return true;
        }

        if (valor < no.valor) {
            return buscarRecursivo(no.filhoEsquerdo, valor);
        } else {
            return buscarRecursivo(no.filhoDireito, valor);
        }
    }
}
