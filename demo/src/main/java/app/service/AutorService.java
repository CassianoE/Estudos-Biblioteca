package app.service;

import app.entity.Autor;
import app.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public String save(Autor autor) {

        this.autorRepository.save(autor);

        return "O autor: " + autor.getNomeCompleto() + " foi salvo com sucesso ";
    }

    public Autor findById(Long id) {

        Autor autor = this.autorRepository.findById(id).get();
        return autor;

    }

    public List<Autor> findAll() {

        List<Autor> autorList = this.autorRepository.findAll();
        return autorList;
    }

    public String update(Autor autor,Long id) {
        autor.setId(id);
        this.autorRepository.save(autor);
        return "O autor: " + autor.getNomeCompleto() + " foi atualizado com sucesso ";
    }

    public String delete(long id) {

        this.autorRepository.deleteById(id);
        return "O autor com id: " + id + " foi deletado com sucesso ";
    }


}
