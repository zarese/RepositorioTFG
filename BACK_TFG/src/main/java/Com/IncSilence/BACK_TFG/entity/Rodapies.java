package Com.IncSilence.BACK_TFG.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="rodapies")
public class Rodapies implements Serializable {

    @Id
	@Column(name="id_rodapie")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name="color", nullable=false, length=100)
	private String color;

    @Column(name="acabado", nullable=false, length=100)
	private String acabado;

    @Column(name="medidas", nullable=false, length=100)
	private String medidas;

    @Column(name="stock", nullable=false)
	private Long stock;

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

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
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

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }
    
}
