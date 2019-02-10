package br.com.mcqueide.poc.servico;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mcqueide.poc.QuestionarioRepository;
import br.com.mcqueide.poc.dto.QuestionarioDTO;
import br.com.mcqueide.poc.modelo.Pergunta;
import br.com.mcqueide.poc.modelo.Questionario;

@Service
public class QuestionarioServico {

	@Autowired
	private QuestionarioRepository repository;
	
	public void cadastrar(QuestionarioDTO questionarioDTO) {
		Mapper mapper = new DozerBeanMapper();
		Questionario questionario = mapper.map(questionarioDTO, Questionario.class);
		
		List<Pergunta> perguntas = questionario.getPerguntas();
		perguntas.forEach(p -> {
			p.setQuestionario(questionario);
			
			p.getConstatacoes().forEach(c -> {
				c.setPergunta(p);
				
				c.getOrientacoes().forEach(o -> {
					o.setConstatacoes(c);
				});
			});
		});
		
		repository.save(questionario);
	}
}
