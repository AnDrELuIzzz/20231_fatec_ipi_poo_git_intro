import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
    static public void main(String... abc){

        int op = Integer.parseInt (JOptionPane.showInputDialog("1-RH\n2-ADS\n"));
        //isso é uma variável de referência
        //LivroDeNotas livroDeNotas;

        //new: operador de construção de objetos
        //isso é a construção do objeto
        //atribuição faz com que a variável de referência referencie o objeto
        //livroDeNotas = new LivroDeNotas()
        if (op == 1){
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDoCurso = "ADS";
        livroDeNotas.exibirMensagem();
        }
        else if (op == 2){
        LivroDeNotas livroDeNotasRH = new LivroDeNotas();
        livroDeNotasRH.nomeDoCurso = "RH";
        livroDeNotasRH.exibirMensagem();
        }

        switch(op){
        case 1:
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDoCurso = "ADS";
        livroDeNotas.exibirMensagem();
    
        case 2:
        LivroDeNotas livroDeNotasRH = new LivroDeNotas();
        livroDeNotasRH.nomeDoCurso = "RH";
        livroDeNotasRH.exibirMensagem();
        }
    }
}