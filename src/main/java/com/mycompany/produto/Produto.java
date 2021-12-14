package com.mycompany.produto;

import java.time.LocalDate;

public class Produto {
    private long id;
    private String titulo;//obrigatorio
    private String descricao;//obrigatorio
    private String marca;
    private String modelo;
    private int estoque = 0;
    private double preco;//obrigatorio
    private LocalDate dataCadastro;//obrigatorio
    private LocalDate dataUltimaAtualizacao;//obrigatorio
    private String urlFoto;
    private String categoria;//obrigatorio
    private Vendedor vendedor;//obrigatorio
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    Produto(String titulo, String descricao,double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao,String categoria, Vendedor vendedor) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataCadastro(dataCadastro);
        this.setDataUltimaAtualizacao(dataUltimaAtualizacao);
        this.setCategoria(categoria);
        this.setVendedor(vendedor);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.equals("")) throw new IllegalArgumentException("Titulo não pode estar vazio");
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.equals("")) throw new IllegalArgumentException("Descrição não pode estar vazio");
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (marca == null || marca.equals("")) throw new IllegalArgumentException("Só é possível informar modelo se ja houver cadastrado a marca.");
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 1) throw new IllegalArgumentException("Preço deve ser maior que 0");
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        if (dataCadastro == null) throw new IllegalArgumentException("DataCadastro não pode ser menor que a data Atual");
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if (dataUltimaAtualizacao == LocalDate.now()) throw new IllegalArgumentException("DataUltimaAtualização não pode ser menor que a data Atual");
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.equals("")) throw new IllegalArgumentException("Categoria não pode estar vazia");
        this.categoria = categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        if (vendedor.getNome() == null || vendedor.getNome().equals("")) throw new IllegalArgumentException("Vendedor não pode estar vazio");
        this.vendedor = vendedor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Produtos\n" +"Título: " + titulo + "\nDescrição: "
                + descricao + "\nPreço: " + preco + "\nData Cadastro: " + dataCadastro 
                + "\nData Ultima Atualização: " + dataUltimaAtualizacao + "\nCategoria: " + categoria 
                + "\nVendedor | ID: " + vendedor.getId()+" | Nome: "+vendedor.getNome()
                + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}
