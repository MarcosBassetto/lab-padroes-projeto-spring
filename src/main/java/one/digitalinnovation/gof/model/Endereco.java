package one.digitalinnovation.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Endereco {

    @Id
    @NotBlank(message = "CEP é obrigatório")
    private String cep;

    @NotBlank(message = "Logradouro é obrigatório")
    private String logradouro;

    private String complemento;

    @NotBlank(message = "Bairro é obrigatório")
    private String bairro;

    @NotBlank(message = "Localidade é obrigatório")
    private String localidade;

    @NotBlank(message = "UF é obrigatório")
    private String uf;

    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
    
    
	public String getCep() {
		return cep;
	}
    
    
}