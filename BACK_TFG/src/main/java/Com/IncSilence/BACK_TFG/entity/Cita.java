package Com.IncSilence.BACK_TFG.entity;

import java.io.Serializable;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citas")
public class Cita implements Serializable{
    
    @Id
	@Column(name="id_citas")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name="trabajador_id", nullable=false, length=100)
	private Long trabajador;

    @Column(name="cliente_id", nullable=false, length=100)
	private Long cliente;

    @Column(name="motivo", nullable=false, length=700)
	private String motivo;

    @Column(name="interes_suelo", nullable=false, length=100)
	private Long suelo;

    @Column(name="interes_rodapie", nullable=false, length=100)
	private Long rodapie;

    @Column(name="interes_pintura", nullable=false, length=100)
	private Long pintura;

    @Column(name="direccion", nullable=false, length=100)
	private Long direccion;

    @Column(name="fecha", nullable=false)
	private Date fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Long trabajador) {
        this.trabajador = trabajador;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Long getSuelo() {
        return suelo;
    }

    public void setSuelo(Long suelo) {
        this.suelo = suelo;
    }

    public Long getRodapie() {
        return rodapie;
    }

    public void setRodapie(Long rodapie) {
        this.rodapie = rodapie;
    }

    public Long getPintura() {
        return pintura;
    }

    public void setPintura(Long pintura) {
        this.pintura = pintura;
    }

    public Long getDireccion() {
        return direccion;
    }

    public void setDireccion(Long direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
