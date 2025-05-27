/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.controller;

import com.mycompany.show_do_javao.model.Pergunta;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class PerguntaController {
    
    public String getPergunta(Pergunta pergunta) {
        return pergunta.getEnunciado();
    }
    
    public List<String> getAlternativas(Pergunta pergunta) {
        return pergunta.getAlternativas();
    }
    
    public String getRespostaCerta(Pergunta pergunta) {
        return pergunta.getRespostaCerta();
    }
    
    public boolean verificarResposta(String resposta, String respostaCerta) {
        return resposta.equals(respostaCerta);
    }
    
}
