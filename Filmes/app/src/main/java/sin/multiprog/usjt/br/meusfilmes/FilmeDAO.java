package sin.multiprog.usjt.br.meusfilmes;

/**
*
*Nome: Jéssica de Andrade Oliveira RA: 201515225
*
*/

public class FilmeDAO {
    private static Filme[] filmes;

    private FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){

            filmes = new Filme[10];
            filmes[0] = new Filme(1,"Os Bad Boys","Michael Bay",
            "Marcus Burnett (Martin Lawrence) e Mike Lowrey (Will Smith) são dois policiais do departamento de polícia de Miami que devem se juntar para recuperar um carregamento de drogas perdido. Eles contarão com a ajuda de uma testemunha, Julie, " +
                    "porém para isso um terá que se passar pela identidade do outro. Um carregamento de heroína confiscada, avaliada em 100 milhões de dólares, foi simplesmente roubado do depósito","100", "07/03/1995");
            filmes[1] = new Filme(2,"Bad Boys II","Michael Bay","Os detetives de narcóticos Mike Lowrey (Smith) e Marcus Burnett (Lawrence) foram escolhidos para uma tarefa de alta tecnologia na investigação do tráfico de ecstasy em Miami." +
                    " Os inquéritos inadvertidamente os levam para uma conspiração maior a um traficante, que se auto nomeia Johnny Tapia (Jordi Mollà) cujas ambições de tomar conta da cidade iniciarão uma guerra de quadrilhas.","100","18/07/2003");
            filmes[2] = new Filme(3,"Batman - O Cavaleiro das Trevas"," Christopher Nolan","Após dois anos desde o surgimento do Batman (Christian Bale), os criminosos de Gotham City têm muito o que temer. Com a ajuda do tenente James Gordon (Gary Oldman) e do promotor público Harvey Dent (Aaron Eckhart), Batman luta contra o crime organizado." +
            " Acuados com o combate, os chefes do crime aceitam a proposta feita pelo Coringa (Heath Ledger) e o contratam para combater o Homem-Morcego.","100","18/08/2008");
            filmes[3] = new Filme(4,"Titanic","James Cameron","Em 1996, o caçador de tesouros Brock Lovett e sua equipe exploram os destroços do RMS Titanic, à procura de um colar de diamante chamado de Coração do Oceano. Eles recuperam o cofre de Caledon \"Cal\" Hockley, acreditando que o colar está dentro, porém acabam encontrando apenas um desenho de uma mulher nua usando o colar, " +
                    "datado do dia 14 de abril de 1912, o dia em que o Titanic colidiu com um iceberg. Uma mulher idosa chamada Rose Dawson Calvert, vendo o desenho numa reportagem de TV a respeito da expedição, liga para Lovett e afirma ser a mulher do desenho, viajando junto com sua neta Lizzy até o navio de pesquisa. Ao ser perguntada sobre o diamante, Rose lembra de seu tempo abordo do Titanic, " +
                    "revelando ser Rose DeWitt Bukater, uma passageira de primeira classe que acreditava-se estar morta.[9]","70","19/12/1997");
            filmes[4] = new Filme(5,"X-Men: Apocalipse","Bryan Singer","O mutante psíquico En Sabah Nur, conhecido como Apocalipse, que governava o antigo Egito no ano de 3600 A.C está prestes a mudar o seu corpo em uma cerimônia para preservar a sua imortalidade. Mas durante a cerimônia, ele é traído por alguns de seus adoradores que " +
                    "tentam matá-lo antes que transferência seja concluída, mas seus guerreiros, os Quatro Cavaleiros, conseguem matá-los e protegê-lo até que a transformação fique completa, mas acabam morrendo durante a tarefa e En Sabah Nur é enterrado vivo, em uma espécie de tumba.","89","19/05/2006");
            filmes[5] = new Filme(6,"PX-Men: Dias de um Futuro Esquecido","Bryan Singer","Em 1973, Mística assassinou Bolívar Trask, um cientista que odiava mutantes e planejava criar os robôs Sentinelas para caçá-los, durante os Acordos de Paz de Paris. 50 anos depois, numa versão distópica do ano de 2023, uma versão avançada das Sentinelas com poderes de transfiguração estudados " +
                    "de Mística exterminou a maior parte da humanidade, tendo assassinado tanto os mutantes quanto os humanos que poderiam gerar filhos com mutação.","90","23/05/2014");
            filmes[6] = new Filme(7,"O Senhor dos Anéis: O Retorno do Rei","Peter Jackson","Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf (Ian McKellen) e Pippin (Billy Boyd) partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden (Bernard Hill) em Rohan, em mais uma tentativa de deter as forças de Sauron. " +
            "Enquanto isso Frodo (Elijah Wood), Sam (Sean Astin) e Gollum (Andy Serkins) seguem sua viagem rumo à Montanha da Perdição, para destruir o Um Anel.","70","25/12/2003");
            filmes[7] = new Filme(8,"The Pursuit of Happyness","Gabriele Muccino","Chris Gardner é um pai de família que enfrenta muitas dificuldades financeiras, vendendo " +
                    "aparelhos médicos que ninguém quer comprar por serem muito caros. Gardner torna-se obstinado pela sobrevivência e sustento de sua família.","100","15/12/2006");
            filmes[8] = new Filme(9,"The Godfather","Francis Ford Coppola","No verão de 1945, Don Vito Corleone ouve pedidos de favores durante o casamento da sua filha Connie, enquanto o seu consigliere " +
                    "e filho adotivo, Tom Hagen, apenas escuta. O cantor e \"afilhado\" do Don, Johnny Fontane, pede ajuda para estrelar um filme que vai ajudá-lo a reerguer sua carreira. ","100","15/03/1972");
            filmes[9] = new Filme(10,"300","Zack Snyder","O filme começa com um orador espartano a contar a vida do jovem rei Leónidas I, revelando também o rigor e a disciplina a que foi submetido durante a" +
                    " sua infância. Aos sete anos, é tirado da sua mãe para iniciar o agogê - um período de privações a que todos os cidadãos de Esparta são submetidos.","99","09/12/2006");
        }

        return filmes;
    }

}
