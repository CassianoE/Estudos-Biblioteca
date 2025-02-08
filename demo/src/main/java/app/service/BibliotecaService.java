package app.service;

import app.entity.Biblioteca;
import app.entity.Livro;
import app.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public String save(Biblioteca biblioteca){

        this.bibliotecaRepository.save(biblioteca);
        return "a biblioteca: " + biblioteca.getNome() + " foi salva com sucesso";
    }

    public Biblioteca findById(Long id){

        Biblioteca biblioteca = this.bibliotecaRepository.findById(id).get();
        return biblioteca;
    }

    public List<Biblioteca> findAll(){

        List<Biblioteca> bibliotecaList = this.bibliotecaRepository.findAll();
        return bibliotecaList;

    }

    public String update(Biblioteca biblioteca,Long id){

        biblioteca.setId(id);
        this.bibliotecaRepository.save(biblioteca);
        return "A biblioteca: " + biblioteca.getNome() + " Foi salva com sucesso";
    }

    public String delete(Long id){

        this.bibliotecaRepository.deleteById(id);
        return "A biblioteca foi excluida com sucesso";
    }


}
