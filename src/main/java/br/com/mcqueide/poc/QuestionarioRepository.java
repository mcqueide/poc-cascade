package br.com.mcqueide.poc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mcqueide.poc.modelo.Questionario;

@Repository
public interface QuestionarioRepository extends JpaRepository<Questionario, Integer>{
}
