import javax.swing.JOptionPane;

public class TrabalhoOrdenacao {

    public static void main(String[] args) {
        String escolha;
        OrdenacaoPesquisa pesquisa = new OrdenacaoPesquisa();

        JOptionPane.showMessageDialog(null, "Vamos criar seu vetor de números inteiros");
        pesquisa.criarVetor();
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Qual opção de ordenação você deseja?\n\n" +
                    "(1) Ordenação por inserção\n" +
                    "(2) Ordenação por seleção\n" +
                    "(3) Ordenação por bolha\n" +
                    "        Pesquisa\n" +
                    "(4) Pesquisa Binária\n" +
                    "(5) Pesquisa Linear\n" +
                    "(6) Sair\n" +
                    "(7) Novo Vetor de inteiros");

            escolha = input.trim();

            switch (escolha) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Você escolheu a ordenação por inserção");
                    pesquisa.insercao();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Você escolheu a ordenação por seleção");
                    pesquisa.selecao();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Você escolheu a ordenação por bolha");
                    pesquisa.bolha();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Você escolheu Pesquisa Binária");
                    pesquisa.binaria();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Você escolheu Pesquisa Linear");
                    pesquisa.linear();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Você escolheu Sair");
                    i = 10;
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Você escolheu mudar o vetor");
                    pesquisa.criarVetor();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
                    i = 0;
                    break;
            }
        }
    }
}
