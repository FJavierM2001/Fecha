/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author javiee Bustamante Toledo
 * @see java.util.Date
 * @see java.util.GregorianCalendar
 */
public class Fechas {

    /**
     *
     * @param fechaFactura Fecha de realización de la factura.
     * @return 
     *      0 si es el mismo día 
     *      -1 si es una fecha pasada
     *      1 si es una fecha futura 
     * @throws ParseException objeto que contiene información sobre las excepciones que se producen 
     */
    public int esFacturaCorrectaEnFecha(String fechaFactura) throws ParseException  {
        int iRespuesta = 0;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Date dateFechaFactura = sdf.parse(fechaFactura);
        Date dateFechaActual = sdf.parse(Hoy());
        
        iRespuesta = dateFechaFactura.compareTo(dateFechaActual);
        
        return iRespuesta;
    }
     /**
     * Método privado para conocer la fecha de hoy.
     * 
     * @return 
     *     devuelve la fecha actual 
     * 
     */
    private String Hoy () {
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
  
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente                                                     
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
  
        //Mostramos por pantalla dia/mes/año
        return año + "-" + (mes+1) + "-" + dia;
           
    }
}

/**
 * Pruebas de equivalencia:
 * 
 * testEsFacturaCorrectaEnFecha:
 * 
 * Fecha : 2021-05-28
 * expResultado: 0
 * 
 *  testEsFacturaCorrectaEnFecha2:
 * 
 * Fecha : 2022-05-28
 * expResultado: 1
 * 
 *  testEsFacturaCorrectaEnFecha3:
 * 
 * Fecha : 2001-05-28
 * expResultado: -1
 * 
 * Pruebas de bordes:
 * 
 *  testEsFacturaCorrectaEnFecha:
 * 
 * Fecha : 2021-05-28
 * expResultado: 0
 * 
 *  testEsFacturaCorrectaEnFecha2:
 * 
 * Fecha : 2021-05-27
 * expResultado: -1
 * 
 *  testEsFacturaCorrectaEnFecha3:
 * 
 * Fecha : 2021-05-29
 * expResultado: 1
*/
