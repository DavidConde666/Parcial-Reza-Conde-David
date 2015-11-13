
package Model;


public class GenerarReservaciones {
    public static void main(String[] args) throws Exception {
        DAOR dao=new DAOR();
            
            Reservacion r = new Reservacion();
                       Tarjeta t = new Tarjeta();
 Destino d = new Destino();
            
            r.setNombre("Juan");
            r.setApellidoPaterno("Campitos");
            r.setEmail("nomerepruebe@gmail.com");
             
            t.setNombreTarjeta("Mastercard");
            t.setSaldo(1234f);
            t.setNumeroTarjeta(666);
             d.setCiudad("Los Angeles");
            d.setHotel("BestHotelEver");
            d.setNumPersonas(2);       
            dao.guardarReservacion(r,t, d);
            System.out.println("Reservacion reservada");

    }
}
