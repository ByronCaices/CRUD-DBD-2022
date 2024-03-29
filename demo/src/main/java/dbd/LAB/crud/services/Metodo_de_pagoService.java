package dbd.LAB.crud.services;
import dbd.LAB.crud.models.Metodo_de_pago;
import dbd.LAB.crud.repositories.Metodo_de_pagoRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class Metodo_de_pagoService {

    private final Metodo_de_pagoRepository metodoDePagoRepository;

    public Metodo_de_pagoService(@Lazy Metodo_de_pagoRepository metodoDePagoRepository) {
        this.metodoDePagoRepository = metodoDePagoRepository;
    }


    @PostMapping("/Metodo_de_pago")
    @ResponseBody
    public Metodo_de_pago crear(@RequestBody Metodo_de_pago metodoDePago){
        Metodo_de_pago resultado = metodoDePagoRepository.crear(metodoDePago);
        return resultado;
    }
    @GetMapping("/Metodo_de_pago")
    public List<Metodo_de_pago> getAllMetodo_de_pago(){
        return metodoDePagoRepository.getAll();
    }
    @GetMapping("/Metodo_de_pago/{id_tipopago}")
    public List<Metodo_de_pago> getCategoria(@PathVariable int id_tipopago){
        return metodoDePagoRepository.show(id_tipopago);
    }
    @PutMapping("/Metodo_de_pago/{id_tipopago}") //{id}(?)
    @ResponseBody
    public String updateMetodopago(@RequestBody  Metodo_de_pago metodoDePago,@PathVariable int id_tipopago){
        String retorno = metodoDePagoRepository.update(metodoDePago,id_tipopago);
        return retorno;
    }
    @DeleteMapping("/Metodo_de_pago/{id_tipopago}")
    public void borrar(@PathVariable int id_tipopago){
        metodoDePagoRepository.delete(id_tipopago);
    }
}
