package ifrn.eliezio.simplekart.simplekart.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ifrn.eliezio.simplekart.simplekart.domain.*;
import ifrn.eliezio.simplekart.simplekart.dto.CategoriaDTO;
import ifrn.eliezio.simplekart.simplekart.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService catService;
    
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity<Categoria> find(@PathVariable Integer id){
        
        Categoria cat = catService.find(id);
        return ResponseEntity.ok().body(cat);
    }

    @RequestMapping(method = RequestMethod.POST)
    //@ResponseBody
    public ResponseEntity<Void> insert(@RequestBody Categoria obj){
        obj = catService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Categoria obj, @PathVariable Integer id){
        obj.setId(id);
        obj = catService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Categoria> delete(@PathVariable Integer id){
        
        catService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CategoriaDTO>> findAll(){
        
        List<Categoria> cats = catService.findAll();
        List<CategoriaDTO> catsDTO = cats.stream().map(cat -> new CategoriaDTO(cat)).collect(Collectors.toList());
        return ResponseEntity.ok().body(catsDTO);
    }
}
