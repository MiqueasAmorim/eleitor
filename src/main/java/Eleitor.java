public class Eleitor {

    private String nome;
    private int idade;

    public Eleitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getSituacao() {
        if (idade < 16) {
            return "Proibido votar";
        } else if (idade < 18 || idade >= 70) {
            return "Voto facultativo";
        } else {
            return "Voto obrigatório";
        }
    }

}
