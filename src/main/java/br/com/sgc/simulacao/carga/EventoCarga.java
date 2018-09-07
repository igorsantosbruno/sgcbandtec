package br.com.sgc.simulacao.carga;

import java.util.ArrayList;
import java.util.List;

import br.com.sgc.simulacao.model.EventoSimulacao;

public class EventoCarga {

	private final EventoSimulacao eventoSimulacao = new EventoSimulacao(1, "Festa do caqui",
			"Neste evento será permitido fazer o que bem entender");

	private final EventoSimulacao eventoSimulacao2 = new EventoSimulacao(2,
			"Somos mais que programadores, somos Javeiros", "Aqui você descobrirá que Java é bem legal");

	private final EventoSimulacao eventoSimulacao3 = new EventoSimulacao(3, "Tecnologia da informação nos dias de hoje",
			"Venha ver como cada vez mais somos dependentes de tecnologia da informação");

	private final EventoSimulacao eventoSimulacao4 = new EventoSimulacao(4, "Hakathon da primavera",
			"Será montado times de estudantes do geração futura e desafiá-los a desenvolver um jogo na plataforma mobile");

	private final EventoSimulacao eventoSimulacao5 = new EventoSimulacao(5, "Game of the year",
			"Uma palestra exclusiva com o diretor de desenvolvimento da warner bros games e IOI falando de Hitman 2");

	private final EventoSimulacao eventoSimulacao6 = new EventoSimulacao(6, "A melhor empresa do mundo",
			"Um evento de interação com a própria plataforma de inteligência artificial da Stefanini, a Sophie!");

	private final EventoSimulacao eventoSimulacao7 = new EventoSimulacao(7, "3 horas de bate papo com a Célia",
			"Depois de participar deste evento você será capaz de realizar uma prova no fim de dia faltando 10 minutos para acabar a aula");
	
	public EventoCarga() {
		
	}
	
	public List<EventoSimulacao> getCargaEvento() {
		
		List<EventoSimulacao> eventosSimulados = new ArrayList<>();
		eventosSimulados.add(this.eventoSimulacao);
		eventosSimulados.add(this.eventoSimulacao2);
		eventosSimulados.add(this.eventoSimulacao3);
		eventosSimulados.add(this.eventoSimulacao4);
		eventosSimulados.add(this.eventoSimulacao5);
		eventosSimulados.add(this.eventoSimulacao6);
		eventosSimulados.add(this.eventoSimulacao7);
		return eventosSimulados;
	}
}






