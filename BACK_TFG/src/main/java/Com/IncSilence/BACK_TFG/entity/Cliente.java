package Com.IncSilence.BACK_TFG.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

    @Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name="nombre", nullable=false, length=100)
	private String nombre;

    @Column(name="apellidos", nullable=false, length=100)
	private String apellidos;

    @Column(name="DNI_CIF", nullable=false, length=100)
	private String dni_cif;

    @Column(name="email", nullable=false, length=100)
	private String email;

    @Column(name="direccion_cliente", nullable=false, length=100)
	private String direccion;
    @Column(name="direccion2_cliente", nullable=true, length=100)
	private String segundireccion;
    
    @Column(name="telefono", nullable=false, length=100)
	private Long telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni_cif() {
        return dni_cif;
    }

    public void setDni_cif(String dni_cif) {
        this.dni_cif = dni_cif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSegundireccion() {
        return segundireccion;
    }

    public void setSegundireccion(String segundireccion) {
        this.segundireccion = segundireccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    
    
}
