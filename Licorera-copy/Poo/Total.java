
/**
 * Write a description of class Total here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Total
{
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int numeroArti = 3;
       Registro[]losregistro= new Registro[50];
       String nombre, tele, direc,artic;
       double canti,total=0,pre;
        System.out.println("BIENVENIDOS A LA MEJOR LICORERA DE LA CIUDAD TODA LAS VARIEDADES DEL MERCADO");
        System.out.println("LICORERA JR");
        System.out.println("NIT:10196026-8");
        System.out.println("CRA 23#70-20");
        System.out.println("TELEFONO: 7351197-3208964538");
        System.out.println("Digite el nombre del cliente: ");
        nombre = sc.next();
        System.out.println("Digite el telefono del cliente: ");
        tele = sc.next();
        System.out.println("Digite la direccion: ");
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
        direc = sc.next();
        for(int i = 0; i < numeroArti; i++){
       
        System.out.println("Articulos que desea llevar: ");
        artic = sc.next();
        
        System.out.println("Digite el precio: ");
        pre = sc.nextDouble();
        System.out.println ("Digite la catidad : ");
        canti= sc.nextInt();
        Registro unregistro= new Registro();
          
        
        
            unregistro.nombre = nombre;
            unregistro.tele =tele;
            unregistro.direc = direc;
            unregistro.artic = artic;
            unregistro.canti = canti;
            unregistro.pre = pre;
            unregistro.total = total;
            losregistro[i]=unregistro;
            }
        for(int i = 0; i < numeroArti; i++){
        double x = (losregistro[i].canti * losregistro[i].pre ) ;
       total = total + (losregistro[i].canti * losregistro[i].pre);
        }
        System.out.println("el TOTAL es: " + total);
        System.out.println("FACTURA DE COMPRA:");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Direccion: " + direc);
        System.out.println("Telefono: " + tele);
        System.out.println("Articulos:  " + numeroArti);
        
        System.out.println("total de la compra: $" + total);
        System.out.println("GRACIAS POR ELEGIRNOS");
        System.out.println("VUELVE PRONTO");

    }
   
            
            
            
            
            
            
            
    }
      
   



                                    
