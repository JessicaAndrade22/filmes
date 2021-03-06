package sin.multiprog.usjt.br.meusfilmes;

import java.io.Serializable;

/**
*
*Nome: Jéssica de Andrade Oliveira RA: 201515225
*
*/

public class Filme implements Serializable{
    private int id;
    private String nome,direcao,descricao,popularidade,lancamento;

    public Filme(int id, String nome, String direcao, String descricao, String popularidade, String lancamento) {
        this.id = id;
        this.nome = nome;
        this.direcao = direcao;
        this.descricao = descricao;
        this.popularidade = popularidade;
        this.lancamento = lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(String popularidade) {
        this.popularidade = popularidade;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getFoto(){
        String foto = descricao.replace('@','_');
        return foto.replace('.','_');
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", direcao='" + direcao + '\'' +
                ", descricao='" + descricao + '\'' +
                ", popularidade='" + popularidade + '\'' +
                ", lancamento='" + lancamento + '\'' +
                '}';
    }

}
