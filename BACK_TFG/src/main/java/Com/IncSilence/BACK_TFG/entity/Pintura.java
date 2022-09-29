package Com.IncSilence.BACK_TFG.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="pinturas")
public class Pintura implements Serializable{
    @Id
	@Column(name="id_pintura")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name="color", nullable=false, length=100)
	private String color;

    @Column(name="tipo", nullable=false, length=100)
	private String tipo;

    @Column(name="lugar", nullable=false, length=100)
	private String lugar;

    @Column(name="stock", nullable=false)
	private Long email;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Long getEmail() {
        return email;
    }

    public void setEmail(Long email) {
        this.email = email;
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
