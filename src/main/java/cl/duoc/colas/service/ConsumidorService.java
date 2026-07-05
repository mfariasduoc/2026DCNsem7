package cl.duoc.colas.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.colas.model.Inscripcion;
import cl.duoc.colas.repository.InscripcionRepository;

@Service
public class ConsumidorService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    @RabbitListener(queues = "myQueue")
    public void receiveMessage(Inscripcion inscripcion) { 
        System.out.println("Procesando inscripción de: " + inscripcion.getNombreEstudiante());
        
        // guarda el objeto que llego de la cola en la base de datos
        inscripcionRepository.save(inscripcion);
        System.out.println("Inscripción guardada en la base de datos.");
    }
}