package com.itb.inf2am.pizzariaa.controller;


// No spring é comum adicionarmos anotações (annotations) em classes, atributos e métodos
// Uma annotation é uma forma de adicionar informações (metadados) ao seu código que podem
// ser interpretadas pelo compilador ou em tempo de execução por ferramentas e frameworks
// como o Spring.
// Uma annotation é uma palavra iniciada com '@' que você coloca acima de uma classe, método,
// atributo ou parâmetro, para dar instruções extras ao Java ou a algum framework sobre como
// aquele elemento deve ser tratado.


import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();


    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabreza");
        p1.setDescricao("Pizza com muita calabreza e cebola");
        p1.setValorVenda(49.50);

        // Exercicio: Criar mais um objeto

        Produto p2 = new Produto();
        p2.setNome("Pizza de Muçarela");
        p2.setDescricao("Pizza com muita muçarela  com bastante queijo");
        p2.setValorVenda(63.57);

        // Adicionando o produto
        produtos.add(p1);
        produtos.add(p2);

        return produtos;
    }



}
