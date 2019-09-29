package com.apirest.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.apirest.models.Produto;
import com.apirest.models.ProdutoFactory;
import com.apirest.repository.EspecificacoesRepository;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.validation.Valid;
import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*", allowedHeaders = "*") //Determina quais domínios podem acessar a API
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
        
        @Autowired
        EspecificacoesRepository espec;
	
        private static final Session s = new ProdutoFactory().getSession();

	@ApiOperation(value = "Mostra uma lista de produtos")
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
            
            return produtoRepository.findAll();
	}
	
	@ApiOperation(value="Mostra um unico produto")
	@GetMapping("/produto/{id}")
	public Produto listaProdutoUnico(@PathVariable(value="id")long id) {
		return produtoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um Produto")
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@ApiOperation(value="Deleta um produto")
	@DeleteMapping("/produto/{id}")
	public void deletarProduto(@PathVariable(value="id")long id) {
		produtoRepository.delete(produtoRepository.findById(id));
	}
	
	@ApiOperation(value="Atualiza um produto")
	@PutMapping("/produto")
	public Produto atualizarProduto(@RequestBody @Valid Produto produto) {
            return produtoRepository.save(produto);
	}
        
        
        /*Metodo responsável para receber a foto, atualmente ainda está sendo efetuado os testes */
       @RequestMapping(method=RequestMethod.POST, value="/send")
       public ResponseEntity<String> receiveData(MultipartFile foto) {
           Path filepath = Paths.get("c://tets/" , foto.getName() );
           try(OutputStream os = Files.newOutputStream(filepath)){
               os.write(foto.getBytes());
               //System.out.println(foto.getOriginalFilename());
               return ResponseEntity.ok("Ok");
           }catch(Exception e){
               e.printStackTrace();;
               return ResponseEntity.ok(e.getMessage());
           }
          
    }

}
