//////Universidad UAM
//////Curso de Programacion 1
//////Profesor Leonardo Sandoval
//////Jose Alberto Miranda Cortes

//////Fecha de inicio 05/11/2021
///////////////////////////////////////////////////////////
/////Bitacora de modificacion
//////Modificado por JOSE ALBERTO MIRANDA
/////Se ajustaron valores y se crearon opciones de menu y try catch
///////////Modificado el 23/11/2021 hora 10:00PM
///////////////////////////////////////////////////////////
///////Si este codigo es modificado tome en cuenta que la siguiente operacion consta de varias partes o metodos.
//////Por ende manejese con orden ya que si un valor es remplazado este puede ocacionar un error en el programa
package proyecto_pi;

import javax.swing.JOptionPane;    /////importe del mostrador de texto
import java.math.BigDecimal;     ///Importe de BigDecimal
import java.math.MathContext;

public class Proyecto_PI {
        public static String menu () 
    {
       return JOptionPane.showInputDialog (null,"menu\n\n1. Realizar calculo de Pi\n2.Salir" );
    }
             
        public static BigDecimal factorial(BigDecimal x)          //////metodo de factorial
        {
            BigDecimal cont1=new BigDecimal(1);        /////variable contadora
            BigDecimal total1=new BigDecimal(1);       /////total factorial
            BigDecimal mas= new BigDecimal(1);
          while ((cont1.compareTo(x))<= 0)
           {                                        /////inicio while
              total1 = total1.multiply(cont1);
              cont1.add(mas); 
           }                                         //////final while
            return (total1);
        }                                           /////final metodo

       
public static void main(String[] args) {
   boolean error1;
   error1= false; 
   boolean confirm;
  do {

    String Opcion;  ////////////////Opciones del menu
    Opcion= menu ();
    switch (Opcion)
        {
        case"1" ->  {                    //////opcion resolver pi
    //////////////Inicio del calculo
   
    MathContext mc1 = new MathContext(2000);          //////////////numero de decimales a utiizar
    MathContext mc = new MathContext(10);
    BigDecimal pi;                                   //////////variable para almacenar el valor de pi
    BigDecimal divi= new BigDecimal(0);          //////variable para almacenar valor de la division dentro de la sumatoria
    BigDecimal UNO = new BigDecimal(1);          //////variable sumadora en bd
    int k; 
    int contk = 0; 
    BigDecimal result1;     /////guarda-1 a la k
    BigDecimal result2;     /////guarda 6*k factorial
    BigDecimal result3;     /////guarda la suma larga por k
    BigDecimal result4;     /////guarda 3*k factorial
    BigDecimal result5;     /////guarda k factoial a la 3
    BigDecimal result6;     /////guarda la operacion con raiz
    
    try {
    
    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de k"));    /////////////valor que se le asignara a k
        while (contk==0) { 
               ////////////inicio           -1 elevado a la k
               BigDecimal muno = new BigDecimal(-1);
               result1 = muno.pow(contk);
              
                                                ////////final parte 1          
              /////////inicio ;                                  
              /////////inicio metodo 2        6 por k factorial    
               BigDecimal restmult = new BigDecimal(6*contk);
               result2 = factorial(restmult);
                      
                                                  /////////final metodo 2
           /////////inicio metodo 3         sumas de 2 numeros por k
           
               BigDecimal trecemil = new BigDecimal("13591409");
               BigDecimal cincuentamil = new BigDecimal("545140134");
               BigDecimal pork = new BigDecimal(contk);
               result3 = trecemil.add(cincuentamil.multiply(pork));
             
               
                                               /////////final metodo 3  
               /////////inicio metodo 4        3 por k factorial
               BigDecimal restmult2 = new BigDecimal(3*contk);
               result4 = factorial(restmult2);
                                                                          
                            
                                              /////final metodo 4
         
               ////////inicio metodo 5          k factorial elevado a la 3
                        int tres = 3;
                        BigDecimal facto = new BigDecimal(contk);
                        result5 = ((factorial(facto))); 
                        result5 = result5.pow(tres);
                         
                                              ///////final metodo 5 
               ////////inicio metodo 6           numero largo elevado a 6*k+3
               
                BigDecimal seis = new BigDecimal("640320");   
                
                int el = (6*contk);       //////seis por k
                int ele = el + 3;         /////resultado de seis por k + 3
                result6 = seis.pow(ele);    ///////numero largo elevado al resultado anterior 
                result6 = result6.sqrt(mc1);  ///////raiz cuadrada del resultado de todo
              
                                              //////final metodo 6  

                    BigDecimal a = result1.multiply(result2);     /////multiplicacion de los 3 valores superiores
                    BigDecimal b = a.multiply(result3);
         
                    BigDecimal c = result4.multiply(result5);     /////multiplicacion de los 3 valores inferiores
                    BigDecimal d = c.multiply(result6,mc1);
                    
                    divi = b.divide(d,mc1);             //////division dentro de las 2 partes  
                    
                    contk++;  
                       }
                           ///////final contador loop
    
            BigDecimal doce = new BigDecimal("12");             
            BigDecimal multfin = divi.multiply(doce);            
            BigDecimal uno = new BigDecimal("1");
            pi = uno.divide(multfin,mc1);   
        
        JOptionPane.showMessageDialog(null,"El resultado de pi es:"+pi+"res");
        
         } catch (NumberFormatException e){         /////inicio metodos catch
             JOptionPane.showMessageDialog(null, "ingrese unicamente numeros");
         }
         catch (ArithmeticException e) {  
               JOptionPane.showMessageDialog(null,"Dato ingresado no es valido");
                       }     /////fin catch
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea volver a realizar la operacion?", "Seleccione", JOptionPane.YES_NO_OPTION);
         if (respuesta == JOptionPane.YES_OPTION)
            {  ////inicio if
                confirm=true;
                pi= BigDecimal.valueOf(0);
                contk = 0;
            }  /////fin if
         if (respuesta == JOptionPane.NO_OPTION)
        {         /////inicio if
            System.exit(0);
        }         /////fin if
        }
        case"2" ->  {          //////inicio opcion 2
            JOptionPane.showMessageDialog(null,"Usted a elegido salir del programa, lindo dia! ");
            System.exit(0);
            break;
                    }           //////final opcion 2 
                 } ////final switch 
            
      }while (confirm=true);    /////////variable de repeticion de la operacion                
            
             }       ///////final main
                       
}     ///////final class               
              
      
                  
               
                

   

