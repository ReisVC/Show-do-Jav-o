/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.show_do_javao;

import com.mycompany.show_do_javao.service.BancoPerguntas;

/**
 *
 * @author Aluno
 */
public class Show_do_javao {

    public static void main(String[] args) {
        BancoPerguntas perguntas = new BancoPerguntas();
        
        for(int i = 0; i < 20; i++) {
        System.out.println(perguntas.getPerguntaAleatoria().getEnunciado());
        }
        
    }
}
