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
@Table(name = "tarjeta")
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t")})
public class Tarjeta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarjeta")
    private Integer idTarjeta;
    @Column(name = "nombre_tarjeta")
    private String nombreTarjeta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Float saldo;
    @Column(name = "numero_tarjeta")
    private Integer numeroTarjeta;
    @JoinColumn(name = "id_reservacion", referencedColumnName = "id_reservacion")
    @ManyToOne
    private Reservacion idReservacion;

    public Tarjeta() {
    }

    public Tarjeta(String nombreTarjeta, Float saldo, Integer numeroTarjeta, Reservacion idReservacion) {
        this.nombreTarjeta = nombreTarjeta;
        this.saldo = saldo;
        this.numeroTarjeta = numeroTarjeta;
        this.idReservacion = idReservacion;
    }
    

    public Tarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
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
        hash += (idTarjeta != null ? idTarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.idTarjeta == null && other.idTarjeta != null) || (this.idTarjeta != null && !this.idTarjeta.equals(other.idTarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Tarjeta[ idTarjeta=" + idTarjeta + " ]";
    }
    
}
