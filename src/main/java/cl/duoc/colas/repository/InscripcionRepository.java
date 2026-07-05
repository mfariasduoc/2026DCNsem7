package cl.duoc.colas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.duoc.colas.model.Inscripcion;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}