/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaArboles.PracticaArboles.controller;



import PracticaArboles.PracticaArboles.domain.Arbol;
import PracticaArboles.PracticaArboles.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/arbol")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var arboles = arbolService.getArboles();
        model.addAttribute("arboles", arboles);
        return "/arbol/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Arbol arbol) {
        return "/arbol/modifica";
    }

    @PostMapping("/guardar")
    public String guardar(Arbol arbol) {
        arbolService.save(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/eliminar/{idArbol}")
    public String eliminar(Arbol arbol) {
        arbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String modificar(Arbol arbol, Model model) {
        arbol = arbolService.getArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }
}
