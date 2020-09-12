package academy.digitallab.store.customer.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name="tbl_customers")
public class Customer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7303138455978442904L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El n�mero de documento no puede ser vac�o")
    @Size( min = 8 , max = 8, message = "El tama�o del n�mero de documento debe ser 8")
    @Column(name = "number_id" , unique = true ,length = 8, nullable = false)
    private String numberID;

    @NotEmpty(message = "El nombre no puede ser vac�o")
    @Column(name="first_name", nullable=false)
    private String firstName;

    @NotEmpty(message = "El apellido no puede ser vac�o")
    @Column(name="last_name", nullable=false)
    private String lastName;

    @NotEmpty(message = "El correo no puede estar vac�o")
    @Email(message = "No es un direcci�n de correo bien formada")
    @Column(unique=true, nullable=false)
    private String email;

    @Column(name="photo_url")
    private String photoUrl;


    @NotNull(message = "La regi�n no puede ser vacia")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Region region;

    private String state;
}
