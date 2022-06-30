/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerParcial.controller;

import com.PrimerParcial.entity.Conciertos;
import com.PrimerParcial.entity.Lugar;
import com.PrimerParcial.service.IConciertosService;
import com.PrimerParcial.service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author crist
 */
@Controller

public class ConciertosController 
{
@Autowired
private IConciertosService conciertosService;

@Autowired
private ILugarService lugarService;

@GetMapping ("/conciertos")
public String index (Model model)

{
List <Conciertos> listaConciertos = conciertosService.getAllConciertos();
model.addAttribute ("titulo", "Tabla Conciertos");
model.addAttribute ("conciertos", listaConciertos);
return "conciertos";
}

@GetMapping ("/conciertosP")
public String crearConciertos (Model model)

{
List <Lugar> listaLugar = lugarService.listPlace();
model.addAttribute ("conciertos", new Conciertos());
model.addAttribute ("lugar", listaLugar);
return "crear";
}

@PostMapping ("/save")
public String guardarConciertos (@ModelAttribute Conciertos conciertos) {
conciertosService.saveConciertos(conciertos);
        return "redirect:/conciertos";
}
}




