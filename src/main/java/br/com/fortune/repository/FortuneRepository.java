package br.com.fortune.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Repository
public class FortuneRepository {
	
	@Getter
	private List<String> messages;
	
	@PostConstruct
	public void init() {
		messages = new ArrayList<String>();

		messages.add("A vida trará coisas boas se tiver paciência.");
		messages.add("Demonstre amor e alegria em todas as oportunidades e verá que a paz nasce dentro de si.");
		messages.add("Não compense na ira o que lhe falta na razão.");
		messages.add("Defeitos e virtudes são apenas dois lados da mesma moeda.");
		messages.add("A maior de todas as torres começa no solo.");
		messages.add("Não há que ser forte. Há que ser flexível.");
		messages.add("Todos os dias organiza os seus cabelos, por que não faz o mesmo com o coração?");
		messages.add("Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.");
		messages.add("A juventude não é uma época da vida, é um estado de espírito.");
		messages.add("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.");
		messages.add("Dê toda a atenção á formação dos seus filhos, sobretudo com bons exemplos da sua própria vida.");
		messages.add("Siga os bons e aprenda com eles.");
		messages.add("Não importa o tamanho da montanha, ela não pode tapar o sol.");
		messages.add("O bom-senso vale mais do que muito conhecimento.");
		messages.add("Quem quer colher rosas tem de estar preparado para suportar os espinhos.");
		messages.add("São os nossos amigos que nos ensinam as mais valiosas lições.");
		messages.add("Aquele que se importa com o sentimento dos outros, não é um tolo.");
		messages.add("A adversidade é um espelho que reflete o verdadeiro eu.");
		messages.add("Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.");
		messages.add("Uma bela flor é incompleta sem as suas folhas.");
		messages.add("Sem o fogo do entusiasmo, não há o calor da vitória.");
		messages.add("O riso é a menor distância entre duas pessoas.");
		messages.add("Os defeitos são mais fortes quando o amor é fraco.");
		messages.add("Amizade e Amor são coisas que se unem num piscar de olhos.");
		messages.add("Surpreender e ser surpreendido é o segredo do amor.");
		messages.add("Faça pequenas coisas hoje e coisas maiores lhe serão confiadas amanhã.");
		messages.add("A paciência na adversidade é sinal de um coração sensível.");
		messages.add("A sorte favorece a mente bem preparada.");
		messages.add("A sua visão se tornará mais clara apenas quando conseguir olhar para dentro do seu coração.");
		messages.add("Quem olha para fora sonha; quem olha para dentro acorda.");
		messages.add("As pessoas esquecerão o que você disse e o que você fez… mas nunca esquecerão como se sentiram.");
		messages.add("Espere pelo mais sábio dos conselhos: o tempo.");
		messages.add("Todas as coisas são difíceis antes de se tornarem fáceis.");
		messages.add("Se você se sente só é porque construiu muros ao invés de pontes.");
		messages.add("Vencer é 90 por cento suor e 10 por cento de engenho.");
		messages.add("O amor está sempre mais próximo do que você imagina.");
		messages.add("Você é do tamanho do seu sonho.");
		messages.add("Pare de procurar eternamente; a felicidade está mesmo aqui ao seu lado.");
		messages.add("O conhecimento é a única virtude e a ignorância é o único vício.");
		messages.add("O nosso primeiro e último amor é… o amor-próprio.");
		messages.add("Deixe de lado as preocupações e seja feliz.");
		messages.add("A vontade das pessoas é a melhor das leis.");
		messages.add("Nós somos o que pensamos.");
		messages.add("A maior barreira para o sucesso é o medo do fracasso.");
		messages.add("O pessimista vê a dificuldade em cada oportunidade; O otimista vê a oportunidade em cada dificuldade.");
		messages.add("Muitas das grandes realizações do mundo foram feitas por homens cansados e desanimados que continuaram o seu trabalho.");
		messages.add("O insucesso é apenas uma oportunidade para recomeçar de novo com mais experiência.");
		messages.add("Coragem é a resistência ao medo, domínio do medo, e não a ausência do medo.");
		messages.add("O verdadeiro homem mede a sua força, quando se defronta com o obstáculo.");
		messages.add("Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.");
		messages.add("A adversidade desperta em nós capacidades que, em circunstâncias favoráveis, teriam ficado adormecidas.");
		messages.add("Motivação não é sinónimo de transformação, mas um passo em sua direção.");
		messages.add("O que empobrece o ser humano, não é a falta de dinheiro, mais sim, a falta de fé,motivação e criatividade.");
		messages.add("A inspiração vem dos outros. A motivação vem de dentro de nós.");
		messages.add("Não acredite mais em pessoas especiais, mas em momentos especiais com pessoas normais.");
		messages.add("A nossa vida tem 4 sentidos… Amar, Sofrer, Lutar e Vencer. Ame muito, sofra pouco, lute bastante e vença sempre!");
		messages.add("Nada é por acaso… Acredite em seus sonhos e nos seus potenciais….Na vida tudo se supera..");
		messages.add("Acredite em milagres, mas não dependa deles.");
		messages.add("Você sempre será a sua melhor companhia!");
		messages.add("Realize o óbvio, pense no improvável e conquiste o impossível.");
		messages.add("A vida trará coisas boas se tiveres paciência.");
		messages.add("Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.");
		messages.add("Não compense na ira o que lhe falta na razão.");
		messages.add("Defeitos e virtudes são apenas dois lados da mesma moeda.");
		messages.add("A maior de todas as torres começa no solo.");
		messages.add("Não há que ser forte. Há que ser flexível.");
		messages.add("Gente todo dia arruma os cabelos, por que não o coração?");
		messages.add("Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.");
		messages.add("A juventude não é uma época da vida, é um estado de espírito.");
		messages.add("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.");
		messages.add("Dê toda a atenção para a formação dos teus filhos, sobretudo por exemplos de tua própria vida.");
		messages.add("Siga os bons e aprenda com eles.");
		messages.add("Não importa o tamanho da montanha, ela não pode tapar o sol.");
		messages.add("O bom-senso vai mais longe do que muito conhecimento.");
		messages.add("Quem quer colher rosas deve suportar os espinhos.");
		messages.add("São os nossos amigos que nos ensinam as mais valiosas lições.");
		messages.add("Uma iniciativa mal-sucedida não significa o final de tudo. Sempre existe uma nova oportunidade.");
		messages.add("Aquele que se importa com o sentimento dos outros, não é um tolo.");
		messages.add("A adversidade é um espelho que reflete o verdadeiro eu.");
		messages.add("Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.");
		messages.add("Uma bela flor é incompleta sem suas folhas.");
		messages.add("Sem o fogo do entusiasmo, não há o calor da vitória.");
		messages.add("Não há melhor negócio que a vida. A gente há obtém a troco de nada.");
		messages.add("O riso é a menor distância entre duas pessoas.");
		messages.add("Você é jovem apenas uma vez. Depois precisa inventar outra desculpa.");
		messages.add("É mais fácil conseguir o perdão do que a permissão.");
		messages.add("Os defeitos são mais fortes quando o amor é fraco.");
		messages.add("Amizade e Amor são coisas que podem virar uma só num piscar de olhos.");
		messages.add("Surpreender e ser surpreendido é o segredo do amor.");
		messages.add("Faça pequenas coisas agora e maiores coisas lhe serão confiadas cada dia.");
		messages.add("Todo mundo é capaz de denominar uma dor, exceto quem a sente.");
		messages.add("A paciência na adversidade é o sinal de um coração sensível.");
		messages.add("A sorte favorece a mente bem preparada.");
		messages.add("Sua visão se tornará clara apenas quando você puder olhar dentro de seu coração.");
		messages.add("Quem olha para fora sonha; quem olha para dentro acorda.");
		messages.add("As pessoas se esquecerão do que você disse e do que você fez… mas nunca se esquecerão de como você as fez sentir.");
		messages.add("Espere pelo mais sábio dos conselhos: o tempo.");
		messages.add("Todas as coisas são difíceis antes de se tornarem fáceis.");
		messages.add("Você pode encontrar a si mesmo fazendo ou dizendo coisas que você nunca imaginou possíveis.");
		messages.add("Se você se sente só é porque construiu muros ao invés de pontes.");
		messages.add("Vencer é 90 por cento suor e 40 por cento técnica.");
		messages.add("O amor está mais próximo do que você imagina.");
		messages.add("A vida coloca em nossa frente opções.");
		messages.add("Você é do tamanho do seu sonho.");
		messages.add("Pare de procurar eternamente; a felicidade está bem ao seu lado.");
		messages.add("Conhecimento é a única virtude e ignorância é o único vício.");
		messages.add("O nosso primeiro e último amor é… o amor-próprio.");
		messages.add("Deixe de lado as preocupações e seja feliz.");
		messages.add("A vontade das pessoas é a melhor das leis.");
		messages.add("Nós somos o que pensamos.");
		messages.add("A maior barreira para o sucesso é o medo do fracasso.");
		messages.add("O pessimista vê a dificuldade em cada oportunidade; O otimista vê a oportunidade em cada dificuldade.");
		messages.add("Muitas das grandes realizações do mundo foram feitas por homens cansados e desanimados que continuaram trabalhando.");
		messages.add("O insucesso é apenas uma oportunidade para recomeçar de novo com mais inteligência.");
		messages.add("O futuro pertence àqueles que acreditam na beleza de seus sonhos.");
		messages.add("Coragem é a resistência ao medo, domínio do medo, e não a ausência do medo.");
		messages.add("O verdadeiro homem mede a sua força, quando se defronta com o obstáculo.");
		messages.add("Você precisa fazer aquilo que pensa que não é capaz de fazer.");
		messages.add("Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.");
		messages.add("A adversidade desperta em nós capacidades que, em circunstâncias favoráveis, teriam ficado adormecidas.");
		messages.add("A vida é para quem topa qualquer parada. Não para quem pára em qualquer topada.");
		messages.add("Motivação não é sinônimo de transformação, mas um passo em sua direção.");
		messages.add("O que empobrece o ser humano, não é a falta de dinheiro, mais sim, a falta de fé,motivação e criatividade.");
		messages.add("Inspiração vem dos outros. Motivação vem de dentro de nós.");
		messages.add("Não acredite mais em pessoas especiais, mas em momentos especiais com pessoas habituais.");
		messages.add("“A nossa vida tem 4 sentidos…amar, sofrer, lutar e vencer. Ame muito, sofra pouco,lute bastante e vença sempre!”");
		messages.add("Nada é por acaso…Acredite em seus sonhos e nos seus potenciais….Na vida tudo se supera..");
		messages.add("Acredite em milagres, mas não dependa deles.");
		messages.add("Você sempre será a sua melhor companhia!");
		messages.add("Realize o óbvio, pense no improvável e conquiste o impossível Latumia.");		
	}
}
