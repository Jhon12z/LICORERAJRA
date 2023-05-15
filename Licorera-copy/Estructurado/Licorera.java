
/**
 * Write a description of class Licorera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Licorera
{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      
      String[] nombres = new String[50];
      String[] telefono = new String[50];
      String[] direccion = new String[50];
      String[] articulos = new String[50];
      double[] cantidad  = new double [50];
      
      double[] precio  = new double [50];
      int numeroArti = 3;
      String nombre, tele, direcc,artic;
      double canti,total=0,pre;
      
      System.out.println("LICORERA JR");
      System.out.println("NIT:10196026-8");
      System.out.println("CRA 23#70-20");
      System.out.println("TELEFONO: 7351197 / 3208964538");
      System.out.println("WHATSAPP: 3208964538");
      System.out.println("BIENVENIDOS A LA MEJOR LICORERA DE LA CIUDAD TODA LAS VARIEDADES DEL MERCADO");
      
        System.out.println("Digite el nombre del cliente: ");
        nombre = sc.next();
        System.out.println("Digite el telefono del cliente: ");
        tele = sc.next();
        System.out.println("Digite la direccion: ");
        direcc = sc.next();
        System.out.println(" Descripcion                Precio");
        System.out.println("-Aguardiente Amarillo       $25.000");
        System.out.println("-Nectar Verde               $15.000");                    
        System.out.println("-Nectar Rojo                $16.000");                     
        System.out.println("-Buchana's                  $130.000");                    
        System.out.println("-Baileys                    $60.000");                  
        System.out.println("-Vino Frontera              $15.000");                  
        System.out.println("-RedLabel                   $150.000");                 
        System.out.println("-Ron Caldas                 $38.000 ");               
        System.out.println("-Ron Medellin               $25.000");            
        System.out.println("-Vodka Filandia             $125.000");             
        System.out.println("-Antioqueño Verde           $17.500");             
        System.out.println("-Antioqueño Rojo            $19.500");             
        System.out.println("-Antioqueño Azul            $23.000");            
        System.out.println("-OldPar                     $125.000");                    
        System.out.println("-Champaña Piterlongo        $105.000");
      for(int i = 0; i < numeroArti; i++){
       
        System.out.println("Articulos que desea llevar: ");
        artic = sc.next();
        
        System.out.println("Digite el precio: ");
        pre = sc.nextDouble();
        System.out.println ("Digite la catidad : ");
        canti= sc.nextInt();
        cantidad[i]=canti;
        precio[i]=pre;
        articulos[i]=artic;
    
        
        
        
      
           
             
           }
        for(int i = 0; i < numeroArti; i++){
            total = total + ((precio[i] * cantidad [i]) );
            }
        System.out.println("El total es : " +total);
        
        System.out.println("FACTURA POS:");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Direccion: " + direcc);
        System.out.println("Telefono: " + tele);
        System.out.println(" Numero de articulos:  " + numeroArti);
        
        System.out.println("TOTAL DE LA COMPRA: $" + total);
        System.out.println("GRACIAS POR ELEGIRNOS");
        System.out.println("VUELVE PRONTO");

         
}
}
