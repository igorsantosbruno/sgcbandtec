package br.com.sgc.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgc.simulacao.carga.EventoCarga;
import br.com.sgc.simulacao.model.EventoSimulacao;

@RestController
@RequestMapping("/sgc")
public class SgcWebService {

	@GetMapping("/get_eventos_simulacoes")
	public List<EventoSimulacao> getEventosSimulacoes() {
		
		EventoCarga eventoCarga = new EventoCarga();
		return eventoCarga.getCargaEvento();
	}
}
