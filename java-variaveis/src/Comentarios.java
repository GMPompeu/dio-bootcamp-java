public class Comentarios {
    public static void main(String[] args) {

        // Comentario de linha unica

        /*
         * comentario de uma ou mais linhas
         */

    }

    /**
     * comentário a nivel de documentação com um * a mais
     */
    public void metodo() {
    }

    /*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade de somar ou  multiplicar
     * dois números
    */
    public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}

}
