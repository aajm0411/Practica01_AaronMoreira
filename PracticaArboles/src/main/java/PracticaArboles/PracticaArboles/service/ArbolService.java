/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaArboles.PracticaArboles.service;



import PracticaArboles.PracticaArboles.domain.Arbol;
import PracticaArboles.PracticaArboles.repository.ArbolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArbolService {

    @Autowired
    private ArbolRepository arbolRepository;

    public List<Arbol> getArboles() {
        return arbolRepository.findAll();
    }

    public void save(Arbol arbol) {
        arbolRepository.save(arbol);
    }

    public void delete(Arbol arbol) {
        arbolRepository.delete(arbol);
    }

    public Arbol getArbol(Arbol arbol) {
        return arbolRepository.findById(arbol.getIdArbol()).orElse(null);
    }
}
