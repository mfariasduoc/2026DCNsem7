package cl.duoc.colas.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.colas.model.Inscripcion;

@Service
public class ProductorService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(Inscripcion inscripcion) {
    rabbitTemplate.convertAndSend("myQueue", inscripcion);
}
}