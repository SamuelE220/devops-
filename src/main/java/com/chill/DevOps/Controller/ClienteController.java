package com.chill.DevOps.Controller;
import com.chill.DevOps.dto.ClienteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/Cliente")
    public ResponseEntity<ClienteDto> getCliente() {
        ClienteDto cliente = new ClienteDto();
        cliente.setNombre("Carlos");
        cliente.setApellido("Martínez");
        cliente.setTelefono("7485-3291");
        cliente.setDireccion("Colonia Escalón, San Salvador");
        cliente.setEdad(32);
        cliente.setDui("02548632-7");
        cliente.setNit("0614-010192-102-5");
        cliente.setAltura(1.75);  // en metros
        cliente.setPeso(72.5);    // en kilogramos

        return ResponseEntity.ok(cliente);
    }
}