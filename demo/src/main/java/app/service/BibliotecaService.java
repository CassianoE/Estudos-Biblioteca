package app.service;

import app.entity.Biblioteca;
import app.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {

    public String save(Biblioteca biblioteca){

        return "a biblioteca: " + biblioteca.getNome() + " foi salva com sucesso";
    }

    public Biblioteca findById(Long id){

        Biblioteca biblioteca = new Biblioteca(1,"Biblioteca de foz","Foz","45 911223344");

        if(biblioteca.getId() == id){
            return biblioteca;
        } else {
            return null;
        }
    }

    public List<Biblioteca> findAll(){

        List<Biblioteca> bibliotecaList = new ArrayList<>();

        bibliotecaList.add(new Biblioteca (1,"Biblioteca de foz","Foz","45 911223344"));
        bibliotecaList.add(new Biblioteca(2, "Biblioteca do Centro", "Curitiba", "41 912345678"));
        bibliotecaList.add(new Biblioteca(3, "Biblioteca da Liberdade", "São Paulo", "11 988776655"));
        bibliotecaList.add(new Biblioteca(4, "Biblioteca Universitária", "Rio de Janeiro", "21 995533221"));

        return bibliotecaList;

    }

    public String update(Biblioteca biblioteca,Long id){

        return "A biblioteca: " + biblioteca.getNome() + " Foi salva com sucesso";

    }

    public String delete(Long id){

        return "A biblioteca foi excluida com sucesso";
    }


}
