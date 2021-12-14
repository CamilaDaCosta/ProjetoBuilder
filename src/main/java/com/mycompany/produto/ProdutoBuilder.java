/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.produto;

import java.time.LocalDate;


public class ProdutoBuilder {

    private String titulo;
    private String descricao;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String categoria;
    private Vendedor vendedor;

    public ProdutoBuilder() {
    }

    public ProdutoBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto createProduto() {
        return new Produto(titulo, descricao, preco, dataCadastro, dataUltimaAtualizacao, categoria, vendedor);
    }
    
}
