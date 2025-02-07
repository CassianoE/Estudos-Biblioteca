package app.service;

import app.entity.Autor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService {

    public String save(Autor autor) {

        return "O autor: " + autor.getNomeCompleto() + " foi salvo com sucesso ";
    }

    public List<Autor> findAll() {

        List<Autor> autorList = new ArrayList<>();

        autorList.add(new Autor(1,"Joao",30));
        autorList.add(new Autor(2,"Maria",25));
        autorList.add(new Autor(3,"Pedro",28));
        return autorList;
    }

    public Autor findById(long id) {

        Autor autor = new Autor(1,"Luan",40);

        if (Autor.getId() == id) {
            return autor;
        } else {
            return null;
        }
    }

    public String update(Autor autor,Long id) {

        return "O autor: " + autor.getNomeCompleto() + " foi atualizado com sucesso ";
    }

    public String delete(long id) {

        return "O autor foi excluído com sucesso ";
    }


}
