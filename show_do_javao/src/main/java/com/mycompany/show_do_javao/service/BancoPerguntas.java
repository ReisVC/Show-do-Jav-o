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
        perguntas.add(new Pergunta("Qual planeta é conhecido como o Planeta Vermelho?", "Marte", "Vênus", "Júpiter", "Saturno"));
        perguntas.add(new Pergunta("Quem pintou a Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"));
        perguntas.add(new Pergunta("Em que ano o homem pisou na Lua pela primeira vez?", "1969", "1959", "1975", "1972"));
        perguntas.add(new Pergunta("Qual é a capital da Austrália?", "Camberra", "Sydney", "Melbourne", "Brisbane"));
        perguntas.add(new Pergunta("Quem escreveu 'Dom Quixote'?", "Miguel de Cervantes", "William Shakespeare", "Fernando Pessoa", "Machado de Assis"));
        perguntas.add(new Pergunta("Qual é o maior oceano do mundo?", "Oceano Pacífico", "Oceano Atlântico", "Oceano Índico", "Oceano Ártico"));
        perguntas.add(new Pergunta("Qual elemento químico tem o símbolo O?", "Oxigênio", "Ouro", "Prata", "Carbono"));
        perguntas.add(new Pergunta("Em que país nasceu Albert Einstein?", "Alemanha", "Suíça", "Áustria", "Estados Unidos"));
        perguntas.add(new Pergunta("Qual é o idioma mais falado no mundo?", "Chinês mandarim", "Inglês", "Espanhol", "Hindi"));
        perguntas.add(new Pergunta("Quem foi o primeiro presidente do Brasil?", "Deodoro da Fonseca", "Getúlio Vargas", "Dom Pedro II", "Floriano Peixoto"));

        perguntas.add(new Pergunta("Quantos planetas há no sistema solar?", "8", "7", "9", "10"));
        perguntas.add(new Pergunta("Quem descobriu o Brasil?", "Pedro Álvares Cabral", "Cristóvão Colombo", "Vasco da Gama", "Américo Vespúcio"));
        perguntas.add(new Pergunta("Qual é a montanha mais alta do mundo?", "Everest", "K2", "Kangchenjunga", "Makalu"));
        perguntas.add(new Pergunta("Quem escreveu 'O Pequeno Príncipe'?", "Antoine de Saint-Exupéry", "J.K. Rowling", "Clarice Lispector", "George Orwell"));
        perguntas.add(new Pergunta("Qual é a fórmula da água?", "H2O", "CO2", "NaCl", "O2"));
        perguntas.add(new Pergunta("Em que continente fica o Egito?", "África", "Ásia", "Europa", "América"));
        perguntas.add(new Pergunta("Quem foi o cientista que propôs a teoria da relatividade?", "Albert Einstein", "Isaac Newton", "Galileu Galilei", "Stephen Hawking"));
        perguntas.add(new Pergunta("Qual é a moeda do Japão?", "Iene", "Won", "Yuan", "Dólar"));
        perguntas.add(new Pergunta("Qual animal é conhecido como o rei da selva?", "Leão", "Tigre", "Elefante", "Pantera"));
        perguntas.add(new Pergunta("Quem foi o autor de 'Romeu e Julieta'?", "William Shakespeare", "Victor Hugo", "Machado de Assis", "José de Alencar"));

        perguntas.add(new Pergunta("Qual é o maior país do mundo em território?", "Rússia", "Canadá", "China", "Estados Unidos"));
        perguntas.add(new Pergunta("Em que ano terminou a Segunda Guerra Mundial?", "1945", "1939", "1950", "1942"));
        perguntas.add(new Pergunta("Quem foi o primeiro homem a viajar ao espaço?", "Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "Alan Shepard"));
        perguntas.add(new Pergunta("Qual é o símbolo químico do ouro?", "Au", "Ag", "Fe", "Hg"));
        perguntas.add(new Pergunta("Em qual cidade brasileira está o Cristo Redentor?", "Rio de Janeiro", "São Paulo", "Brasília", "Salvador"));
        perguntas.add(new Pergunta("Qual é a capital da França?", "Paris", "Londres", "Roma", "Berlim"));
        perguntas.add(new Pergunta("Quem escreveu '1984'?", "George Orwell", "Aldous Huxley", "Ray Bradbury", "Jules Verne"));
        perguntas.add(new Pergunta("Quantos continentes existem?", "7", "6", "5", "8"));
        perguntas.add(new Pergunta("Qual é o maior mamífero do mundo?", "Baleia-azul", "Elefante africano", "Orca", "Hipopótamo"));
        perguntas.add(new Pergunta("Quem descobriu a gravidade?", "Isaac Newton", "Albert Einstein", "Galileu Galilei", "Niels Bohr"));

        perguntas.add(new Pergunta("Qual é a capital da Argentina?", "Buenos Aires", "Santiago", "Lima", "Montevidéu"));
        perguntas.add(new Pergunta("Qual é o rio mais longo do mundo?", "Nilo", "Amazonas", "Yangtzé", "Mississippi"));
        perguntas.add(new Pergunta("Quem foi o líder do movimento da independência da Índia?", "Mahatma Gandhi", "Nehru", "Mandela", "Bhagat Singh"));
        perguntas.add(new Pergunta("Qual é o maior deserto do mundo?", "Antártida", "Saara", "Gobi", "Kalahari"));
        perguntas.add(new Pergunta("Qual a capital do Canadá?", "Ottawa", "Toronto", "Vancouver", "Montreal"));
        perguntas.add(new Pergunta("Quantos lados tem um hexágono?", "6", "5", "8", "7"));
        perguntas.add(new Pergunta("Quem foi o criador da teoria heliocêntrica?", "Nicolau Copérnico", "Galileu Galilei", "Kepler", "Ptolomeu"));
        perguntas.add(new Pergunta("Qual é o nome do processo de conversão de água em vapor?", "Evaporação", "Condensação", "Fusão", "Sublimação"));
        perguntas.add(new Pergunta("Em que país fica Machu Picchu?", "Peru", "Chile", "Bolívia", "México"));
        perguntas.add(new Pergunta("Quem é o deus do trovão na mitologia nórdica?", "Thor", "Loki", "Odin", "Balder"));
        
        perguntas.add(new Pergunta("Qual o país mais populoso do mundo?", "China", "Índia", "Estados Unidos", "Indonésia"));
        perguntas.add(new Pergunta("Quem pintou o teto da Capela Sistina?", "Michelangelo", "Leonardo da Vinci", "Raphael", "Donatello"));
        perguntas.add(new Pergunta("Quantos segundos tem uma hora?", "3600", "600", "1200", "1800"));
        perguntas.add(new Pergunta("Qual é o menor país do mundo?", "Vaticano", "Mônaco", "San Marino", "Liechtenstein"));
        perguntas.add(new Pergunta("Quem foi o primeiro homem a pisar na Lua?", "Neil Armstrong", "Yuri Gagarin", "Buzz Aldrin", "Michael Collins"));
        perguntas.add(new Pergunta("Qual é o número atômico do hidrogênio?", "1", "2", "8", "10"));
        perguntas.add(new Pergunta("Em que continente está o Brasil?", "América do Sul", "América Central", "América do Norte", "Europa"));
        perguntas.add(new Pergunta("Quem é o autor de 'Os Lusíadas'?", "Luís de Camões", "Fernando Pessoa", "José Saramago", "Eça de Queirós"));
        perguntas.add(new Pergunta("Qual é o maior órgão do corpo humano?", "Pele", "Fígado", "Pulmão", "Coração"));
        perguntas.add(new Pergunta("Quem descobriu a penicilina?", "Alexander Fleming", "Louis Pasteur", "Marie Curie", "Edward Jenner"));

        perguntas.add(new Pergunta("Qual é a capital da Alemanha?", "Berlim", "Frankfurt", "Munique", "Hamburgo"));
        perguntas.add(new Pergunta("Qual o nome do processo de transformação de gás em líquido?", "Condensação", "Evaporação", "Fusão", "Sublimação"));
        perguntas.add(new Pergunta("Em que país se encontra a Torre Eiffel?", "França", "Itália", "Alemanha", "Reino Unido"));
        perguntas.add(new Pergunta("Quantos dentes tem um adulto normalmente?", "32", "28", "30", "36"));
        perguntas.add(new Pergunta("Quem escreveu 'Memórias Póstumas de Brás Cubas'?", "Machado de Assis", "José de Alencar", "Carlos Drummond de Andrade", "Graciliano Ramos"));
        perguntas.add(new Pergunta("Qual é a capital da Espanha?", "Madri", "Barcelona", "Lisboa", "Sevilha"));
        perguntas.add(new Pergunta("Qual o principal gás causador do efeito estufa?", "Dióxido de carbono", "Oxigênio", "Nitrogênio", "Gás hélio"));
        perguntas.add(new Pergunta("Quem pintou 'O Grito'?", "Edvard Munch", "Salvador Dalí", "Van Gogh", "Monet"));
        perguntas.add(new Pergunta("Qual é o maior planeta do sistema solar?", "Júpiter", "Saturno", "Urano", "Netuno"));
        perguntas.add(new Pergunta("Qual é o plural de 'pão'?", "Pães", "Pãos", "Pãozes", "Paões"));

        perguntas.add(new Pergunta("Quem foi o autor de 'O Príncipe'?", "Maquiavel", "Platão", "Aristóteles", "Sócrates"));
        perguntas.add(new Pergunta("Quantos graus tem um ângulo reto?", "90", "45", "180", "60"));
        perguntas.add(new Pergunta("Qual o símbolo químico do ferro?", "Fe", "F", "Ir", "Fr"));
        perguntas.add(new Pergunta("Qual é a capital da Itália?", "Roma", "Milão", "Veneza", "Nápoles"));
        perguntas.add(new Pergunta("Quem foi a primeira mulher a ganhar um Prêmio Nobel?", "Marie Curie", "Ada Lovelace", "Rosalind Franklin", "Jane Goodall"));
        perguntas.add(new Pergunta("Em que continente fica o Japão?", "Ásia", "Europa", "Oceania", "América"));
        perguntas.add(new Pergunta("Quantos lados tem um octógono?", "8", "6", "10", "7"));
        perguntas.add(new Pergunta("Quem escreveu 'A Metamorfose'?", "Franz Kafka", "Fiódor Dostoiévski", "Albert Camus", "Italo Calvino"));
        perguntas.add(new Pergunta("Qual é a capital de Portugal?", "Lisboa", "Porto", "Coimbra", "Braga"));
        perguntas.add(new Pergunta("Qual é o maior arquipélago do mundo?", "Indonésia", "Filipinas", "Maldivas", "Japão"));

    }
    
    public Pergunta getPerguntaAleatoria() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(perguntas.size());
        
        
        Pergunta pergunta = perguntas.get(valor);
        perguntas.remove(valor);
        return pergunta;
        
    }
}
