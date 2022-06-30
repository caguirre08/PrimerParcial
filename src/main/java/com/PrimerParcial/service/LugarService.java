/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PrimerParcial.service;

import com.PrimerParcial.entity.Lugar;
import com.PrimerParcial.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author crist
 */
@Service
public class LugarService implements ILugarService {
    
    @Autowired
    private LugarRepository lugarRepository;

    @Override
    public List<Lugar> listPlace() {
       return (List<Lugar>)lugarRepository.findAll();
    }

 

}
