package ar.edu.unju.fi.model;

@Getter
@Setter
@Entity
@Component
public class Automovil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String patente;
	private String marca;
	private String modelo;
	private String color;
	private String duenio;
	private Boolean estado;
}
