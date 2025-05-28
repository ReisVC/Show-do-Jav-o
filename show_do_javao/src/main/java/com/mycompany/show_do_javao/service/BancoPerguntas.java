/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show_do_javao.service;

import com.mycompany.show_do_javao.model.Pergunta;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Aluno
 */
public class BancoPerguntas {
    
    ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    
    public BancoPerguntas (){
        perguntas.add(new Pergunta("Qual a capital da França?", "Paris", "Brasília", "Madrid", "Roma"));
        perguntas.add(new Pergunta("Quem pintou a Mona Lisa?", "Leonardo da Vinci", "Michelangelo", "Pablo Picasso", "Vincent van Gogh"));
        perguntas.add(new Pergunta("Qual o maior planeta do Sistema Solar?", "Júpiter", "Terra", "Marte", "Saturno"));
        perguntas.add(new Pergunta("Qual o símbolo químico da água?", "H2O", "CO2", "O2", "NaCl"));
        perguntas.add(new Pergunta("Quem escreveu 'Dom Casmurro'?", "Machado de Assis", "José de Alencar", "Clarice Lispector", "Graciliano Ramos"));
        perguntas.add(new Pergunta("Em que continente está o Egito?", "África", "Ásia", "Europa", "América"));
        perguntas.add(new Pergunta("Qual a capital do Japão?", "Tóquio", "Pequim", "Seul", "Bangkok"));
        perguntas.add(new Pergunta("Quantos lados tem um triângulo?", "3", "4", "5", "6"));
        perguntas.add(new Pergunta("Qual o menor número primo?", "2", "1", "3", "0"));
        perguntas.add(new Pergunta("Quem descobriu o Brasil?", "Pedro Álvares Cabral", "Dom Pedro I", "Cristóvão Colombo", "Américo Vespúcio"));
        perguntas.add(new Pergunta("Qual animal é conhecido como 'rei da selva'?", "Leão", "Tigre", "Elefante", "Urso"));
        perguntas.add(new Pergunta("Em que país se fala italiano?", "Itália", "Espanha", "França", "Portugal"));
        perguntas.add(new Pergunta("Quantos segundos há em um minuto?", "60", "100", "30", "90"));
        perguntas.add(new Pergunta("Que cor resulta da mistura de azul com amarelo?", "Verde", "Roxo", "Laranja", "Marrom"));
        perguntas.add(new Pergunta("Quem foi Albert Einstein?", "Físico", "Cantor", "Pintor", "Jogador de futebol"));
        perguntas.add(new Pergunta("Qual é o oceano que banha o litoral brasileiro?", "Atlântico", "Pacífico", "Índico", "Ártico"));
        perguntas.add(new Pergunta("Quantas patas tem uma aranha?", "8", "6", "10", "4"));
        perguntas.add(new Pergunta("Qual é o número do primeiro dígito do PI?", "3", "1", "2", "4"));
        perguntas.add(new Pergunta("Em que país fica a Torre Eiffel?", "França", "Inglaterra", "Alemanha", "Itália"));
        perguntas.add(new Pergunta("O que é necessário para ferver a água?", "Calor", "Frio", "Pressão baixa", "Eletricidade"));
        perguntas.add(new Pergunta("Qual é o nome da partícula responsável pela massa das outras partículas?", "Bóson de Higgs", "Neutrino", "Fóton", "Quark"));
        perguntas.add(new Pergunta("Quem formulou a teoria da relatividade?", "Albert Einstein", "Isaac Newton", "Galileu Galilei", "Stephen Hawking"));
        perguntas.add(new Pergunta("Quantos elementos químicos a tabela periódica possui atualmente (2025)?", "118", "112", "115", "120"));
        perguntas.add(new Pergunta("Qual foi a primeira civilização a desenvolver a escrita?", "Suméria", "Egípcia", "Grega", "Romana"));
        perguntas.add(new Pergunta("Em que ano ocorreu a queda do Muro de Berlim?", "1989", "1991", "1985", "1993"));
        perguntas.add(new Pergunta("Quem escreveu a peça 'Hamlet'?", "William Shakespeare", "Molière", "Sófocles", "Fernando Pessoa"));
        perguntas.add(new Pergunta("Qual é a capital da Islândia?", "Reykjavík", "Oslo", "Helsinque", "Copenhague"));
        perguntas.add(new Pergunta("Qual o nome da galáxia onde está o sistema solar?", "Via Láctea", "Andrômeda", "Nuvem de Magalhães", "Nebulosa de Órion"));
        perguntas.add(new Pergunta("Qual é a linguagem de programação criada por James Gosling em 1995?", "Java", "C#", "Python", "Ruby"));
        perguntas.add(new Pergunta("Quem foi o autor de 'A Origem das Espécies'?", "Charles Darwin", "Gregor Mendel", "Louis Pasteur", "Carl Linnaeus"));
    }
    
    public Pergunta getPerguntaAleatoria() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(perguntas.size());
        
        
        Pergunta pergunta = perguntas.get(valor);
        perguntas.remove(valor);
        return pergunta;
        
    }
}
