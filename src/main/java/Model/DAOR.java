/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author MARY
 */
public class DAOR {
    private static SessionFactory sesionFactory;
    private static Session sesion;
    private static Transaction tranza;
    
    public DAOR(){
        sesionFactory=Utilidad.getSessionFactory();
        sesion=sesionFactory.openSession();
        tranza=sesion.beginTransaction();  
    }
    
    public void cerrarTodo(){
        tranza.commit();
        sesion.close();
    }
   
    public void guardarReservacion(Reservacion r, Tarjeta t, Destino d)throws Exception{
        //abrir();
        sesion.save(r);
        sesion.save(t);
        sesion.save(d);
        cerrarTodo();
  
    }
    
    
   public ArrayList<Reservacion> buscarTodos()throws Exception{
        ArrayList<Reservacion> reservacion=( ArrayList<Reservacion>)sesion.createCriteria(Reservacion.class).list();
        cerrarTodo();
        return reservacion;
    }
    
   
   public Reservacion buscarPorId (Integer id)throws Exception{
        Reservacion a=(Reservacion) sesion.createCriteria(Reservacion.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTodo();
        return a;
    }
}
