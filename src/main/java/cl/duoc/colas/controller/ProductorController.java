package cl.duoc.colas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.colas.model.Inscripcion;
import cl.duoc.colas.service.ProductorService;

@RestController
public class ProductorController {

    @Autowired
    private ProductorService producer;

@PostMapping("/send")
public String sendInscripcion(@RequestBody Inscripcion inscripcion) {
    producer.sendMessage(inscripcion);
    return "Inscripción enviada: " + inscripcion.getNombreEstudiante();
}

}