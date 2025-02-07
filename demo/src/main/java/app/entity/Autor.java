package app.entity;

public class Autor {

    private static long id;
    private String nomeCompleto;
    private int idade;

    public Autor(long id, String nomeCompleto, int idade) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    // getters and setters


    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
