package ifrn.eliezio.simplekart.simplekart.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ifrn.eliezio.simplekart.simplekart.domain.Estado;
import ifrn.eliezio.simplekart.simplekart.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
    
    @Autowired
    EstadoService estadoService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        
        Estado cat = estadoService.buscar(id);
        return ResponseEntity.ok().body(cat);

    }
}
