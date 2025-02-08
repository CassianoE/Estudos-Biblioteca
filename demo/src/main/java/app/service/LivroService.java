package app.service;

import app.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    public String save(Livro livro) {

        return "O livro: " + livro.getTitulo() + " Foi salvo com sucesso";
    }

    public Livro findById(Long id) {

        Livro livro = new Livro(1,"Titulo",2025,"Terror");

        if (livro.getId() == id) {
            return livro;
        } else {
            return null;
        }
    }

    public List<Livro> findAll() {

        List<Livro> livroList = new ArrayList<>();

        livroList.add(new Livro(1,"Titulo 1",2020,"Ficcao"));
        livroList.add( new Livro(2,"Titulo 2",2021,"Acao"));
        livroList.add(new Livro(3,"Titulo 3",2022,"Terror"));

        return livroList;

    }

    public String update(Livro livro, Long id){

        return "o livro: " + livro.getTitulo() + " foi atualizado com sucesso";
    }

    public String delete(Long id){

        return "O livro foi excluido com sucesso";
    }
}
