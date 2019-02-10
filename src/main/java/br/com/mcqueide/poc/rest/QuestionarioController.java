package br.com.mcqueide.poc.rest;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mcqueide.poc.dto.ConstatacoesDTO;
import br.com.mcqueide.poc.dto.OrientacoesDTO;
import br.com.mcqueide.poc.dto.PerguntaDTO;
import br.com.mcqueide.poc.dto.QuestionarioDTO;
import br.com.mcqueide.poc.servico.QuestionarioServico;

@RestController
public class QuestionarioController {

	@Autowired
	private QuestionarioServico servico;
	
	@GetMapping("/")
	public String cadastrarQuestionario() {
		OrientacoesDTO orientacoesDTO = new OrientacoesDTO("orientacoes");
		ConstatacoesDTO constatacoesDTO = new ConstatacoesDTO("constatacoes", Collections.singletonList(orientacoesDTO));
		PerguntaDTO perguntaDTO = new PerguntaDTO("pergunta", Collections.singletonList(constatacoesDTO));
		QuestionarioDTO questionarioDTO = new QuestionarioDTO("questionario", Collections.singletonList(perguntaDTO));
		
		servico.cadastrar(questionarioDTO);
		
		return "funcinou";
	}
}
