package com.cmardones.pruebauno.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/barco")
public class BarcoController {

    @RequestMapping("")
    public String inicio(@ModelAttribute("barco") Barco barco) {
        
        return "barco.jsp";
    }
    
    @PostMapping("/guardar")
    public String guardarBarco(@Valid @ModelAttribute("barco") Barco barco,
    BindingResult resultado,
    Model model) {
        
        
    if(resultado.hasErrors()) {
        model.addAttribute("msgError","Datos erroneos");
        return "barco.jsp";
    }else {
        //enviamos el obeto a persistir en base datos
        barcoService.guardarBarco(barco);
        //obtener una lista de barco
        List<Barco> listaBarcos = barcoService.findAll();
        //pasamos la lista de barcos al jsp
        model.addAttribute("barcosCapturados", listaBarcos);
        return "mostrarBarcos.jsp";
    }
}

//solo mostrar el listado de barcos
@RequestMapping("/mostrar")
public String mostrar(Model model) {
    //obtener una lista de barcos
    List<Barcos> listaBarcos = BarcoService.findAll();
    //pasamos la lista de barcos al jsp
    model.addAttribute("barcosCapturados", listaBarcos);
    return "mostrarBarcos.jsp";
}
}