package com.example.desafiosdosaber;

import android.content.Context;
import android.content.SharedPreferences;

public class IniciadorPerguntas {
    public static void inserirPerguntasIniciais(Context context, DatabaseHelper dbHelper) {
        SharedPreferences prefs = context.getSharedPreferences("QuizPrefs", Context.MODE_PRIVATE);
        boolean perguntasInseridas = prefs.getBoolean("perguntas_inseridas", false);

        if (!perguntasInseridas) {

            //Conhecimentos Gerais - Fácil
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Que grande evento histórico aconteceu em 1822 no Brasil?",
                    "Independência do Brasil", "Ditadura Militar", "Descobrimento do Brasil", "Construção de Brasília", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Em que região se localiza o estado de Minas Gerais?",
                    "Sudoeste", "Nordeste", "Centro-Oeste", "Norte", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Em que país foi construído o Muro de Berlim?",
                    "Alemanha", "Brasil", "Estados Unidos", "China", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Barack Obama foi presidente de que país?",
                    "Estados Unidos da America", "Africa do Sul", "Inglaterra", "Rússia", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Qual a nacionalidade de Napoleão Bonaparte?",
                    "Francesa", "Brasileira", "Mexicana", "Egípcio", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Quem pintou Mona Lisa?",
                    "Leonardo da Vinci", " Van Gogh", "Tarsila do Amaral", "Pablo Picasso", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Qual a maior floresta tropical do mundo?",
                    "Floresta Amazônica", "Caatinga", "Pampa", "Mata Atlântica", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Quantos continentes existem?",
                    "6", "8", "3", "5", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Qual o planeta mais próximo do Sol?",
                    "Mercúrio", "Terra", "Marte", "Júpter", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?",
                    "Aproximadamente 24 horas", "365 dias", "7 dias", "30 ou 31 dias", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", "De onde é a invenção do chuveiro elétrico?",
                    "Brasil", "França", "Inglaterra", "Austrália", 0);
            dbHelper.inserirPergunta("Conhecimentos Gerais", "Fácil", " Quais o menor e o maior país do mundo?",
                    "Vaticano e Rússia", "Brasil e Rússia", "Nauru e China", "São Marino e Índia", 0);

            //Conhecimentos Gerais - Médio

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Qual o nome popular do cloreto de sódio?",
                    "Sal de cozinha", "Vinagre", "Papel", "Fermento", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Quantos ossos temos no nosso corpo?",
                    "206", "300", "126", "18", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Quem inventou a lâmpada?",
                    "Thomas Edison", "Graham Bell", "Steve Jobs", "Santos Dumont", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Em que período da pré-história o fogo foi descoberto?",
                    "Paleolítico", "Idade dos Metais", "Idade Média", "Neolítico", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Qual é o rio mais longo do mundo?",
                    "Rio Amazonas", "Rio Mississippi", "Rio Nilo", "Rio Yangtzé", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Atualmente, quantos elementos químicos a tabela periódica possui?",
                    "118", "113", "108", "92", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Qual desses países não faz parte da União Europeia?",
                    "Noruega", "Portugal", "França", "Espanha", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "De quem é a famosa frase 'Penso, logo existo'?",
                    "Descartes", "Sócrates", "Francis Bacon", "Platão", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Quanto tempo a luz do Sol demora para chegar à Terra?",
                    "8 minutos", "12 segundos", "12 minutos", "1 dia", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Qual é o país mais populoso do mundo?",
                    "Índia", "China", "Indonésia", "Rússia", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "O que a palavra 'legend' significa em português?",
                    "Lenda", "Conto", "Legenda", "Legendário", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Médio", "Quantas casas decimais tem o número pi?",
                    "Infinitas", "Duas", "Milhares", "Vinte", 0);

            //Conhecimentos Gerais - Difícil

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Quem foi a primeira mulher a viajar para o espaço?",
                    "Valentina Tereshkova", "Svetlana Savitskaya", "Sally Ride", "Kathryn D. Sullivan", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Em qual ano foi fundada a ONU (Organização das Nações Unidas)?",
                    "1945", "1943", "1950", "1947", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "O esquema funcionava através da superfaturação de obras que faziam parte de um programa que tinha como objetivo acelerar o crescimento econômico no País. Essa descrição corresponde a uma operação criminosa no Brasil. Trata-se da:",
                    "Operação Navalha", "Operação Lava Jato", "Operação Panatenaico", "Operação Carne Fraca", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Quantos pares de costelas um ser humano, normalmente, possui?",
                    "12", "8", "10", "15", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Qual é o maior deserto do mundo, considerando tanto as áreas frias quanto quentes?",
                    "Antártida", "Deserto do Saara", "Deserto de Gobi", "Deserto da Arábia", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Qual o primeiro filme a representar o Brasil na disputa do Oscar de melhor filme estrangeiro?",
                    "O Pagador de Promessa", "Central do Brasil", "Cidade de Deus", "Orfeu Negro", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Quem foi o inventor da primeira vacina?",
                    "Edward Jenner", "Louis Pasteur", "Robert Koch", "Jonas Salk", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Qual filósofo grego pediu que Alexandre, o Grande, saísse da frente do sol, quando questionado sobre qual era o seu maior desejo?",
                    "Diógenes", "Epicuro", "Sócrates", "Heráclito", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Quais planetas do sistema solar realizam seu movimento de rotação em sentido horário?",
                    "Vênus e Urano", "Saturno e Júpiter", "Mercúrio e Saturno", "Terra e Marte", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Qual foi a célebre invenção feita por Robert Kahn e Vint Cerf?",
                    "Internet", "Telefone celular", "Televisão", "Rádio-gravador", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Quem foi o único imperador romano a abdicar voluntariamente?",
                    "Diocleciano", "Calígula", "Constantino", "Nero", 0);

            dbHelper.inserirPergunta("Conhecimentos Gerais", "Difícil", "Quem foi a primeira mulher a se eleger presidente de um país?",
                    "Vigdís Finnbogadóttir", "Cristina Kirchner", "Dilma Roussef", "Jacinda Ardern", 0);

            //Arte e Cultura - Fácil

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Qual artista é responsável por criar a famosa pintura 'Mona Lisa'?",
                    "Leonardo da Vinci", "Pablo Picasso", "Vincent Van Gogh", "Salvador Dalí", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Qual é o nome do icônico teatro de ópera localizado na cidade de Sydney?",
                    "Sydney Opera House", "Teatro Alla Scala", "Lincoln Center", "Royal Albert Hall", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Onde está localizado o Museu do Louvre?",
                    "Paris", "Roma", "Londres", "Madrid", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Salvador Dalí foi considerado um dos principais nomes de qual movimento de vanguarda?",
                    "Surrealismo", "Impressionismo", "Cubismo", "Realismo", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Quem escreveu o clássico 'Dom Quixote'?",
                    "Miguel de Cervantes", "William Shakespeare", "Márcio de Andrade", "Gabriel García Márquez", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Quem esculpiu a famosa estátua 'David'?",
                    "Michelangelo", "Rafael", "Leonardo da Vinci", "Donatello", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Quem é o famoso autor por trás do conto 'Romeu e Julieta'?",
                    "William Shakespeare", "Molière", "Anton Tchekhov", "Sófocles", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Qual o nome da técnica artística que utiliza pigmentos misturados com água aplicados sobre o gesso fresco?",
                    "Fresco", "Têmpera", "Óleo sobre tela", "Aquarela", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Vincent Van Gogh foi representante de qual movimento artístico?",
                    "Impressionismo", "Renascimento", "Cubismo", "Barroco", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Quem escreveu o poema épico 'A Divina Comédia'?",
                    "Dante Alighieri", "Homero", "Virgílio", "Petrarca", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Qual é o nome da prestigiada companhia de balé da Rússia?",
                    "Balé Bolshoi", "Companhia de Balé de Nova York", "Royal Ballet", "Balé Nacional de Cuba", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Fácil", "Há uma cidade Argentina que é famosa por sua arquitetura e cultura teatral, qual é o nome dessa cidade?",
                    "Buenos Aires", "Lima", "Montevidéu", "Santiago", 0);

            //Arte e Cultura - Médio

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Quem foi o pintor responsável pela obra 'A Ronda Noturna'?",
                    "Rembrandt", "Hieronymus Bosch", "Frans Hals", "Johannes Vermeer", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Quem compôs a famosa ópera 'Carmen'?",
                    "Georges Bizet", "Richard Wagner", "Ludwig Van Beethoven", "Giuseppe Verdi", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Qual escultor francês é responsável pela obra 'O Pensador'?",
                    "Auguste Rodin", "Camille Claudel", "Edgar Degas", "Aristide Maillol", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "O movimento Art Nouveau se destaca por quais características?",
                    "Linhas sinuosas inspiradas na natureza", "Formas geométricas e rígidas",
                    "Pinturas de paisagens românticas", "Cores vibrantes e traços agressivos", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Qual é a técnica usada por Georges Seurat no pontilhismo?",
                    "Uso de pequenos pontos de cor", "Texturas criadas com areia",
                    "Cores saturadas e mescladas", "Pinceladas largas e expressivas", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "'O nascimento de Vênus' foi pintado por qual artista renascentista?",
                    "Sandro Botticelli", "Rafael", "Leonardo da Vinci", "Michelangelo", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Qual é o nome completo do pintor Pablo Picasso?",
                    "Pablo Diego José Francisco de Paula Juan Nepomuceno Crispín Crispiano María Remedios de la Santísima Trinidad Ruiz Picasso",
                    "Pablo Andrés Miguel Ruiz", "Pablo Jesús Antonio Picasso", "Pablo Francisco Goya Picasso", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Qual escritor argentino é conhecido pela obra 'O Aleph'?",
                    "Jorge Luis Borges", "Roberto Arlt", "Adolfo Bioy Casares", "Julio Cortázar", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Em qual país surgiu o movimento impressionista?",
                    "França", "Espanha", "Alemanha", "Itália", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Quem projetou a famosa Brasílica da Sagrada Família, em Barcelona?",
                    "Antoni Gaudí", "Norman Foster", "Santiago Calatrava", "Frank Gehry", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Qual artista mexicano é famoso por seus murais de cunho político?",
                    "Diego Rivera", "José Clemente Orozco", "Rufino Tamayo", "David Alfaro Siqueiros", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Médio", "Qual é o autor do romance 'O Retrato de Dorian Gray'?",
                    "Oscar Wilde", "F. Scott Fitzgerald", "Henry James", "Charles Dickens", 0);


            //Arte e Cultura - Difícil

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Qual obra é considerada um ícone do movimento ready-made de Marcel Duchamp?",
                    "A Fonte", "A Garrafa de Anis", "Roda de Bicicleta", "O Grande Vidro", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Quem escreveu o livro 'As Flores do Mal', representando o simbolismo francês?",
                    "Charles Baudelaire", "Arthur Rimbaud", "Stéphane Mallarmé", "Paul Verlaine", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Qual pintor barroco flamengo é conhecido por suas cenas mitológicas ricas e retratos de corte?",
                    "Peter Paul Rubens", "Jacob Jordaens", "Anthony Van Dyck", "Frans Snyders", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Qual técnica Hieronymus Bosch utilizou para sua obra 'O Jardim das Delícias Terrenas'?",
                    "Óleo sobre madeira", "Fresco", "Têmpera sobre madeira", "Óleo sobre tela", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Quem escreveu o famoso ensaio 'A Obra de Arte na Era de sua Reprodutibilidade Técnica'?",
                    "Walter Benjamin", "Sigmund Freud", "Herbert Marcuse", "Theodor Adorno", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "A qual movimento teatral pertence a peça 'Esperando Godot', de Samuel Beckett?",
                    "Teatro do Absurdo", "Teatro Realista", "Teatro Expressionista", "Teatro Naturalista", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Qual obra de arte é considerada a principal representante do estilo Rococó?",
                    "O Embarque para Citera", "O Juramento dos Horácios", "A Morte de Marat", "O Casamento de Arnolfini", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Quem compôs a ópera 'Morte em Veneza', baseada na obra de Thomas Mann?",
                    "Benjamin Britten", "Gustav Mahler", "Richard Wagner", "Igor Stravinsky", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Quem pintou o famoso afresco 'A escola de Atenas'?",
                    "Rafael", "Leonardo da Vinci", "Michelangelo", "Sandro Botticelli", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Qual arquiteto renascentista italiano escreveu 'Os Quatro Livros de Arquitetura'?",
                    "Andrea Palladio", "Filippo Brunelleschi", "Donato Bramante", "Leon Battista Alberti", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "Qual é a obra mais renomada do escultor Gian Lorenzo Bernini?",
                    "Êxtase de Santa Teresa", "Apolo e Dafne", "Fonte dos Quatro Rios", "David", 0);

            dbHelper.inserirPergunta("Arte e Cultura", "Difícil", "A pintura 'O Grito', de Edvard Munch, está associada a qual movimento artístico?",
                    "Expressionismo", "Cubismo", "Impressionismo", "Surrealismo", 0);

            //Esportes - Fácil

            dbHelper.inserirPergunta("Esportes", "Fácil", "Qual esporte é conhecido como 'o esporte das multidões' no Brasil?",
                    "Futebol", "Basquete", "Vôlei", "Tênis", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Qual país é o maior vencedor da Copa do Mundo de Futebol?",
                    "Brasil", "Alemanha", "Itália", "Argentina", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Em qual cidade ocorreram os jogos olímpicos de 2016?",
                    "Rio de Janeiro", "Tóquio", "Atenas", "Londres", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Quem é conhecido como o 'Rei do futebol'?",
                    "Pelé", "Cristiano Ronaldo", "Diego Maradona", "Lionel Messi", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Qual esporte utiliza uma raquete e uma bola amarela como equipamento principal?",
                    "Tênis", "Beisebol", "Golfe", "Pólo aquático", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Qual é o nome da liga de basquete profissional dos Estados Unidos?",
                    "NBA", "NFL", "MLB", "NHL", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Em qual esporte é usada uma bola oval?",
                    "Futebol americano", "Rugby", "Hóquei", "Basquete", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Quantos jogadores compõem um time de vôlei em quadra?",
                    "6", "10", "8", "5", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Qual é o termo utilizado quando um jogador marca três gols em uma partida de futebol?",
                    "Hat-trick", "Poker", "Touchdown", "Double", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Quem foi o primeiro brasileiro a conquistar três títulos de Fórmula 1?",
                    "Ayrton Senna", "Emerson Fittipaldi", "Rubens Barrichello", "Nelson Piquet", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Qual é o nome do campeonato de clubes de futebol mais importante da Europa?",
                    "Liga dos Campeões", "Liga Europa", "Copa UEFA", "Libertadores", 0);

            dbHelper.inserirPergunta("Esportes", "Fácil", "Em qual esporte o atleta Michael Phelps é uma lenda?",
                    "Natação", "Ciclismo", "Ginástica artística", "Atletismo", 0);

            //Esportes - Médio

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual país sediou os primeiros Jogos Olímpicos da era moderna, em 1896?",
                    "Grécia", "Estados Unidos", "França", "Reino Unido", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual jogador de basquete tem o recorde de maior número de títulos da NBA?",
                    "Bill Russell", "LeBron James", "Kareem Abdul-Jabbar", "Michael Jordan", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual foi o primeiro time a vencer a Copa do Mundo de Futebol em 1930?",
                    "Uruguai", "Argentina", "Brasil", "Itália", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Quem foi o primeiro piloto de Fórmula 1 a conquistar sete títulos mundiais?",
                    "Michael Schumacher", "Sebastian Vettel", "Ayrton Senna", "Lewis Hamilton", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Em que ano o Brasil conquistou seu primeiro título de Copa do Mundo de Futebol?",
                    "1958", "1962", "1950", "1970", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Quantas medalhas de ouro a ginasta Simone Biles ganhou em uma única Olimpíada (Rio 2016)?",
                    "4", "6", "2", "3", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual atleta de futebol é o maior artilheiro da história das Copas do Mundo?",
                    "Miroslav Klose", "Pelé", "Lionel Messi", "Ronaldo", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual tenista conquistou o maior número de títulos de Grand Slam na história?",
                    "Novak Djokovic", "Pete Sampras", "Roger Federer", "Rafael Nadal", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual ciclista venceu o Tour de France por sete vezes consecutivas, mas depois perdeu os títulos devido a doping?",
                    "Lance Armstrong", "Miguel Induráin", "Chris Froome", "Alberto Contador", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Quem é o recordista de medalhas olímpicas em uma única edição dos Jogos Olímpicos?",
                    "Michael Phelps", "Usain Bolt", "Mark Spitz", "Carl Lewis", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Qual país é o maior vencedor de títulos mundiais de rugby?",
                    "Nova Zelândia", "Inglaterra", "África do Sul", "Austrália", 0);

            dbHelper.inserirPergunta("Esportes", "Médio", "Quantos rounds tem uma luta de boxe profissional em um campeonato mundial?",
                    "12", "7", "10", "15", 0);

            //Esportes - Difícil

            dbHelper.inserirPergunta("Esportes", "Difícil", "Qual obra é considerada um ícone do movimento ready-made de Marcel Duchamp?",
                    "A fonte", "A Garrafa de Anis", "Roda de Bicicleta", "O Grande Vidro", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Quem escreveu o livro 'As Flores do Mal', representando o simbolismo francês?",
                    "Charles Baudelaire", "Arthur Rimbaud", "Stéphane Mallarmé", "Paul Verlaine", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Qual pintor barroco flamengo é conhecido por suas cenas mitológicas ricas e retratos de corte?",
                    "Peter Paul Rubens", "Jacob Jordaens", "Anthony Van Dyck", "Frans Snyders", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Qual técnica Hieronymus Bosch utilizou para sua obra 'O Jardim das Delícias Terrenas'?",
                    "Óleo sobre madeira", "Fresco", "Têmpera sobre madeira", "Óleo sobre tela", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Quem escreveu o famoso ensaio 'A Obra de Arte na Era de sua Reprodutibilidade Técnica'?",
                    "Walter Benjamin", "Sigmund Freud", "Herbert Marcuse", "Theodor Adorno", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "A qual movimento teatral pertence a peça 'Esperando Godot', de Samuel Beckett?",
                    "Teatro do Absurdo", "Teatro Realista", "Teatro Expressionista", "Teatro Naturalista", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Qual obra de arte é considerada a principal representante do estilo Rococó?",
                    "O Embarque para Citera", "O Juramento dos Horácios", "A Morte de Marat", "O Casamento de Arnolfini", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Quem compôs a ópera 'Morte em Veneza', baseada na obra de Thomas Mann?",
                    "Benjamin Britten", "Gustav Mahler", "Richard Wagner", "Igor Stravinsky", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Quem pintou o famoso afresco 'A escola de Atenas'?",
                    "Rafael", "Leonardo da Vinci", "Michelangelo", "Sandro Botticelli", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Qual arquiteto renascentista italiano escreveu 'Os Quatro Livros de Arquitetura'?",
                    "Andrea Palladio", "Filippo Brunelleschi", "Donato Bramante", "Leon Battista Alberti", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "Qual é a obra mais renomada do escultor Gian Lorenzo Bernini?",
                    "Êxtase de Santa Teresa", "Apolo e Dafne", "Fonte dos Quatro Rios", "David", 0);

            dbHelper.inserirPergunta("Esportes", "Difícil", "A pintura 'O Grito', de Edvard Munch, está associada a qual movimento artístico?",
                    "Expressionismo", "Cubismo", "Impressionismo", "Surrealismo", 0);

            //Tecnologias - Fácil

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "O que significa a sigla 'CPU' em um computador?",
                    "Central Processing Unit", "Central Performance Unit", "Computer Processing Unit", "Core Processing Unit", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "Qual é o nome do sistema operacional de código aberto mais conhecido?",
                    "Linux", "Windows", "MacOS", "Android", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "Qual empresa desenvolveu o sistema operacional Android?",
                    "Google", "Microsoft", "Samsung", "Apple", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "Qual dessas linguagens de programação é usada principalmente para desenvolvimento web?",
                    "JavaScript", "Python", "Fortran", "C++", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "Qual é o nome do navegador de internet desenvolvido pela Google?",
                    "Chrome", "Edge", "Safari", "Firefox", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "Qual desses dispositivos é considerado uma 'entrada' em um computador?",
                    "Teclado", "Impressora", "Monitor", "Fone de ouvido", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "O que é um 'firewall' em termos de segurança digital?",
                    "Um sistema de proteção contra acessos não autorizados", "Um software de backup", "Um vírus de computador", "Um navegador de internet", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "O que é um 'browser'?",
                    "Um navegador de internet", "Um programa para editar imagens", "Um antivírus", "Um sistema de armazenamento na nuvem", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "Quem é o fundador da Microsoft?",
                    "Bill Gates", "Mark Zuckerberg", "Jeff Bezos", "Steve Jobs", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "O que é 'Wi-Fi'?",
                    "Wireless Networking Technology", "Wireless Finder", "Wireless Fidelity", "Wired Fiber", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "O que significa a sigla 'USB'?",
                    "Universal Serial Bus", "Universal Software Bus", "Unique Storage Box", "Uninterruptible Signal Bridge", 0);

            dbHelper.inserirPergunta("Tecnologia", "Fácil", "O que é um 'mouse' em termos de tecnologia?",
                    "Um dispositivo de entrada que controla o cursor na tela", "Um software antivírus", "Um tipo de processador", "Um cabo de conexão de rede", 0);

            //Tecnologias - Médio

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual desses dispositivos é utilizado para armazenar dados de forma permanente?",
                    "Disco rígido (HD)", "Memória RAM", "Placa de vídeo", "Fonte de alimentação", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual linguagem de programação é mais associada ao desenvolvimento de aplicativos iOS?",
                    "Swift", "JavaScript", "Kotlin", "Ruby", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual é a função do DNS na internet?",
                    "Traduzir nomes de domínio em endereços IP", "Controlar o tráfego de dados", "Proteger dados transmitidos", "Monitorar redes locais", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual empresa criou a linguagem de programação Python?",
                    "Guido van Rossum", "Microsoft", "Google", "Oracle", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "O que é 'cloud computing'?",
                    "Armazenamento e processamento de dados na internet", "Um tipo de servidor físico", "Um software de backup", "Um tipo de conexão de rede local", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual desses é um protocolo de segurança usado para transmitir dados criptografados na web?",
                    "HTTPS", "HTTP", "FTP", "SMTP", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "O que é 'open source'?",
                    "Software com código-fonte aberto e disponível para modificação", "Software que é pago por assinatura", "Software fechado e protegido por patentes", "Software para sistemas corporativos", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual o propósito do framework React?",
                    "Construir interfaces de usuário em aplicações web", "Criar backends para APIs", "Desenvolver sistemas operacionais", "Gerenciar bancos de dados", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "O que significa 'IoT'?",
                    "Internet of Things", "Internet of Technology", "Integration of Technology", "Intelligent Operating Technology", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual das seguintes é uma linguagem de consulta de banco de dados?",
                    "SQL", "SQL", "HTML", "CSS", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Quem desenvolveu o sistema operacional Linux?",
                    "Linus Torvalds", "Steve Jobs", "Bill Gates", "Dennis Ritchie", 0);

            dbHelper.inserirPergunta("Tecnologia", "Médio", "Qual linguagem de programação é amplamente usada para desenvolvimento de aplicativos Android?",
                    "Kotlin", "PHP", "Swift", "Ruby", 0);

            //Tecnologias - Difícil

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual foi a primeira linguagem de programação de alto nível?",
                    "COBOL", "C", "FORTRAN", "Assembly", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Quem é conhecido como o 'pai da computação'?",
                    "Charles Babbage", "John von Neumann", "Alan Turing", "Tim Berners-Lee", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual foi o primeiro sistema operacional gráfico amplamente utilizado?",
                    "Xerox Alto", "MacOS", "Windows 3.1", "Linux", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "O que é um 'hash' em criptografia?",
                    "Um método de compressão de arquivos", "Um código de erro",
                    "Um algoritmo que transforma dados em uma cadeia de caracteres de tamanho fixo",
                    "Um protocolo de segurança de redes", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual foi o primeiro processador de 64 bits amplamente utilizado em computadores pessoais?",
                    "Intel Pentium 4", "Intel Core 2 Duo", "AMD Athlon 64", "PowerPC G5", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "O que é a Lei de Moore?",
                    "A capacidade de armazenamento dobra a cada dois anos", "O poder de processamento se multiplica por quatro a cada ano",
                    "O número de transistores em um chip dobra a cada dois anos", "A eficiência energética dos chips dobra a cada dois anos", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual é o principal propósito da linguagem Assembly?",
                    "Criar interfaces gráficas", "Desenvolver aplicativos móveis",
                    "Interagir diretamente com o hardware, próximo ao nível da máquina", "Criar páginas web", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Quem inventou o conceito de 'hyperlink', crucial para a criação da World Wide Web?",
                    "Alan Turing", "Tim Berners-Lee", "Ted Nelson", "Vinton Cerf", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual é o nome do algoritmo de busca usado pelos motores de busca do Google?",
                    "QuickSort", "Dijkstra", "PageRank", "MapReduce", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual é a função de um 'proxy' em redes de computadores?",
                    "Criptografar dados", "Melhorar a velocidade de conexão",
                    "Atuar como intermediário entre o cliente e o servidor", "Monitorar a largura de banda", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual tecnologia de armazenamento usa memória flash não volátil e substituiu amplamente os discos rígidos tradicionais?",
                    "RAM", "HHD", "SSD", "HDD", 0);

            dbHelper.inserirPergunta("Tecnologia", "Difícil", "Qual é o princípio básico por trás da arquitetura de microserviços?",
                    "Servidores grandes e centralizados para todas as funções", "Sistemas legados operando em paralelo",
                    "Aplicações divididas em pequenos serviços independentes que se comunicam via APIs", "Bancos de dados distribuídos em redes globais", 0);

            prefs.edit().putBoolean("perguntas_inseridas", true).apply();
        }
    }
}
