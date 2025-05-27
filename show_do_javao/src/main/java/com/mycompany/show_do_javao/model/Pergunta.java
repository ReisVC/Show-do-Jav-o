/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Pergunta {
    private String enunciado;
    private String respostaCerta;
    private List<String> alternativas;

    public Pergunta(String enunciado, String respostaCerta, String errada1, String errada2, String errada3) {
        this.enunciado = enunciado;
        this.respostaCerta = respostaCerta;

        // Criar e embaralhar alternativas
        alternativas = new ArrayList<>();
        alternativas.add(respostaCerta);
        alternativas.add(errada1);
        alternativas.add(errada2);
        alternativas.add(errada3);
        Collections.shuffle(alternativas);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public boolean verificarResposta(String respostaEscolhida) {
        return respostaCerta.equals(respostaEscolhida);
    }

    public String getRespostaCerta() {
        return respostaCerta;
    }
}