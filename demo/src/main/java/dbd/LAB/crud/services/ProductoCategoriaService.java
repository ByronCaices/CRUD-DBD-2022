package dbd.LAB.crud.services;
import dbd.LAB.crud.models.ProductoCategoria;
import dbd.LAB.crud.repositories.ProductoCategoriaRepository;


import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@CrossOrigin
@RestController
public class ProductoCategoriaService {
    private final ProductoCategoriaRepository ProductoCategoriaRepository;

    ProductoCategoriaService(@Lazy ProductoCategoriaRepository ProductoCategoriaRepository){
        this.ProductoCategoriaRepository = ProductoCategoriaRepository;
    }

    // crear C
    @PostMapping("/ProductoCategoria")
    @ResponseBody
    public ProductoCategoria crear(@RequestBody ProductoCategoria ProductoCategoria){
        ProductoCategoria resultado = ProductoCategoriaRepository.crear(ProductoCategoria);
        return resultado;
    }



    // get R
    @GetMapping("/ProductoCategoria")
    public List<ProductoCategoria> getAllProductoCategorias(){
        return ProductoCategoriaRepository.getAll();
    }
    //get by
    @GetMapping("/ProductoCategoria/{id}")
    public List<ProductoCategoria> getCategoria(@PathVariable int id){
        return ProductoCategoriaRepository.show(id);
    }

    @GetMapping("/ProductoCategoria/stock/{id}")
    public List<ProductoCategoria> getStock(@PathVariable int id){
        return ProductoCategoriaRepository.verificaStock(id);
    }



    // actualizar U
    @PutMapping("/ProductoCategoria/{id}") //{id}(?)
    @ResponseBody
    public String updateProductoCategoria(@RequestBody ProductoCategoria ProductoCategoria, @PathVariable int id){
        String retorno = ProductoCategoriaRepository.update(ProductoCategoria,id);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/ProductoCategoria/{id}")
    public void borrar(@PathVariable int id){
        ProductoCategoriaRepository.delete(id);
    }
}
