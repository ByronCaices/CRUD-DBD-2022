package dbd.LAB.crud.services;
import dbd.LAB.crud.models.Oferta;
import dbd.LAB.crud.repositories.OfertaRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.objenesis.instantiator.basic.ObjectInputStreamInstantiator;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class OfertaService {

    private final OfertaRepository ofertaRepository;

    public OfertaService(@Lazy OfertaRepository ofertaRepository) {
        this.ofertaRepository = ofertaRepository;
    }
    @PostMapping("/Oferta")
    @ResponseBody
    public Oferta crear(@RequestBody Oferta oferta){
        Oferta resultado = ofertaRepository.crear(oferta);
        return resultado;
    }
    @GetMapping("/Oferta")
    public List<Oferta> getAllOferta(){
        return ofertaRepository.getAll();
    }

    @GetMapping("/Oferta/{id_oferta}")
    public  List<Oferta> getOferta(@PathVariable int id_oferta){
        return ofertaRepository.show(id_oferta);
    }

    @PutMapping("/Oferta/{id_oferta}") //{id}(?)
    @ResponseBody
    public String update(@RequestBody Oferta oferta, int id_oferta){
        String retorno = ofertaRepository.update(oferta,id_oferta);
        return retorno;
    }

    @PutMapping("/OfertaStock/{id_oferta}")
    @ResponseBody
    public String updateStock(@RequestBody Oferta oferta, int id_oferta){
        String retorno = ofertaRepository.updateStock(oferta,id_oferta);
        return retorno;
    }

    @DeleteMapping("/Oferta/{id_oferta}")
    public void borrar(@PathVariable int id_oferta){
        ofertaRepository.delete(id_oferta);
    }
}
