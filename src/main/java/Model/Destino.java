/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MARY
 */
@Entity
@Table(name = "destino")
@NamedQueries({
    @NamedQuery(name = "Destino.findAll", query = "SELECT d FROM Destino d")})
public class Destino implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_destino")
    private Integer idDestino;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "hotel")
    private String hotel;
    @Column(name = "num_personas")
    private Integer numPersonas;
    @JoinColumn(name = "id_reservacion", referencedColumnName = "id_reservacion")
    @ManyToOne
    private Reservacion idReservacion;

    public Destino() {
    }

    public Destino(String ciudad, String hotel, Integer numPersonas, Reservacion idReservacion) {
        this.ciudad = ciudad;
        this.hotel = hotel;
        this.numPersonas = numPersonas;
        this.idReservacion = idReservacion;
    }
    

    public Destino(Integer idDestino) {
        this.idDestino = idDestino;
    }

    public Integer getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Integer idDestino) {
        this.idDestino = idDestino;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Integer getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(Integer numPersonas) {
        this.numPersonas = numPersonas;
    }

    public Reservacion getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Reservacion idReservacion) {
        this.idReservacion = idReservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDestino != null ? idDestino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destino)) {
            return false;
        }
        Destino other = (Destino) object;
        if ((this.idDestino == null && other.idDestino != null) || (this.idDestino != null && !this.idDestino.equals(other.idDestino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Destino[ idDestino=" + idDestino + " ]";
    }
    
}
