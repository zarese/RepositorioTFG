package Com.IncSilence.BACK_TFG.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="trabajadores")
public class Trabajador implements Serializable{
    
    @Id
	@Column(name="id_trabajador")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name="nombre", nullable=false, length=100)
	private String nombre;

    @Column(name="apellidos", nullable=false, length=100)
	private String apellidos;

    @Column(name="DNI", nullable=false, length=100)
	private String dni;

    @Column(name="email", nullable=false, length=100)
	private String email;

    @Column(name="estado", nullable=false, length=100)
	private String estado;

    @Column(name="puesto", nullable=true, length=100)
	private String puesto;
    
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    
}
