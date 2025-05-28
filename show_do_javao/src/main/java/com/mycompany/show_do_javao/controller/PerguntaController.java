/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.controller;

import com.mycompany.show_do_javao.model.Pergunta;
import com.mycompany.show_do_javao.service.BancoPerguntas;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class PerguntaController {
    
    public static String getPergunta(
            BancoPerguntas pergunta, 
            JTextField enunciado,
            JTextField resposta1,
            JTextField resposta2,
            JTextField resposta3,
            JTextField resposta4
            ) 
    {
    Pergunta perguntaEsc=pergunta.getPerguntaAleatoria();
    enunciado.setText(perguntaEsc.getEnunciado());
    resposta1.setText(perguntaEsc.getAlternativas().get(0));
    resposta2.setText(perguntaEsc.getAlternativas().get(1));
    resposta3.setText(perguntaEsc.getAlternativas().get(2));
    resposta4.setText(perguntaEsc.getAlternativas().get(3));
    return perguntaEsc.getRespostaCerta();
    
    }
    
    public static List<String> getAlternativas(Pergunta pergunta) {
        return pergunta.getAlternativas();
    }
    
    public static String getRespostaCerta(Pergunta pergunta) {
        return pergunta.getRespostaCerta();
    }
    
    public static boolean verificarResposta(String resposta, String respostaCerta) {
        return resposta.equals(respostaCerta);
    }
    
}
