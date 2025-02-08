package app.service;

import app.entity.Autor;
import app.entity.Livro;
import app.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public String save(Livro livro) {

        this.livroRepository.save(livro);
        return "Livro salvo com sucesso!";

    }

    public Livro findById(Long id) {

        Livro livro = this.livroRepository.findById(id).get();
        return livro;
    }

    public List<Livro> findAll() {

        List<Livro> livroList = this.livroRepository.findAll();
        return livroList;

    }

    public String update(Livro livro, Long id){
        livro.setId(id);
        this.livroRepository.save(livro);
        return "Livro atualizado com sucesso!";
    }

    public String delete(Long id){

        this.livroRepository.deleteById(id);
        return "Livro excluído com sucesso!";
    }
}
