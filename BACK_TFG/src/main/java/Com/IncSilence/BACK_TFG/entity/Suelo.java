package Com.IncSilence.BACK_TFG.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="suelos")
public class Suelo implements Serializable{
    @Id
	@Column(name="id_suelo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name="color", nullable=false, length=100)
	private String color;

    @Column(name="acabado", nullable=false, length=100)
	private String acabado;

    @Column(name="tipo", nullable=false, length=100)
	private String tipo;

    @Column(name="compatibilidad_rad", nullable=false, length=100)
	private String compatibilidad_rad;

    @Column(name="material", nullable=false, length=100)
	private String material;

    @Column(name="instalacion", nullable=false)
	private String instalacion;

    @Column(name="img", nullable=false, length=100)
	private String img ;
    
    @Column(name="precio", nullable=false, length=100)
	private Long precio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAcabado() {
		return acabado;
	}

	public void setAcabado(String acabado) {
		this.acabado = acabado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCompatibilidad_rad() {
		return compatibilidad_rad;
	}

	public void setCompatibilidad_rad(String compatibilidad_rad) {
		this.compatibilidad_rad = compatibilidad_rad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getInstalacion() {
		return instalacion;
	}

	public void setInstalacion(String instalacion) {
		this.instalacion = instalacion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}
}
