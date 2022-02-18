/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Gustavo Cuéllar
 */
// parte de Kevin Antonio Cortez Gutiérrez
public class Persona {
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private char sexo;
    private int telefono;
    private String dui;
    private String direccion;
    private String ocupacion;
    private String estadoCivil;
    
    //Método constructor con parametros
    public Persona(String _nombres, String _apellidos, Date _fechaNacimiento, char _sexo, int _telefono, String _dui, String _direccion, String _ocupacion, String _estadoCivil)
    {
        this.nombres = _nombres;
        this.apellidos = _apellidos;
        this.fechaNacimiento = _fechaNacimiento;
        this.sexo = _sexo;
        this.telefono = _telefono;
        this.dui = _dui;
        this.direccion = _direccion;
        this.ocupacion = _ocupacion;
        this.estadoCivil = _estadoCivil;
    }
    
    //Método para modificar el nombre
    public void setNombres(String _nombres)
    {
        this.nombres = _nombres;
    }
     public String getNombres()
     {
         return this.nombres;
     }
     
     //Método para modificar el apellido
     public void setApellidos(String _apellidos)
     {
         this.apellidos = _apellidos;
     }
     public String getApellidos()
     {
         return this.apellidos;
     }
     
     //Método para modificar la fecha de nacimiento
     public void setFechaNacimiento(Date _fechaNacimiento)
     {
         this.fechaNacimiento = _fechaNacimiento;
     }
     //Calculo de la edad
     public int getEdad()
     {
        LocalDate _fechaNacimiento = LocalDate.of(this.fechaNacimiento.getYear(), this.fechaNacimiento.getMonth(), this.fechaNacimiento.getDay());
        LocalDate ahora = LocalDate.now();
        Period p = Period.between(_fechaNacimiento, ahora);
        return p.getYears();
     }
     
     //Método para modificar el sexo
     public void setSexo(char _sexo)
     {
         this.sexo = _sexo;
     }
     //El siguiente método verifica si el caracter es "f" para verificar si es femenino o masculino
     public String getSexo()
     {
         char sx = "f".charAt(0);
         if (sx == this.sexo)
         {
             return "femenino";
         }
         else
         {
             return "masculino";
         }
     }
     
     //Método para modificar el número de teléfono
     public void setTelefono(int _telefono)
     {
         this.telefono = _telefono;
     }
     public int getTelefono()
     {
         return this.telefono;
     }
     
     //Método para modificar el DUI
     public void setDui(String _dui)
     {
         this.dui = _dui;
     }
     public String getDui()
     {
         return this.dui;
     }
     
     //Método para modificar la dirección
     public void setDireccion(String _direccion)
     {
         this.direccion = _direccion;
     }
     public String getDireccion()
     {
         return this.direccion;
     }
     
     //Método para modificar la ocupación
     public void setOcupacion(String _ocupacion)
     {
         this.ocupacion = _ocupacion;
     }
     public String getOcupacion()
     {
         return this.ocupacion;
     }
     
     //Método para modificar el estado civil
     public void setEstadoCivil(String _estadoCivil)
     {
         this.estadoCivil = _estadoCivil;
     }
     public String getEstadoCivil()
     {
         return this.estadoCivil;
     }
     
     //Parte De Gustavo Ernesto Cuellar Delgado.
public class clinica {
    
    private double precioMedicamentos; 
    private final double precioComida=1.25; 
    private double serviciosMedicos; 
    private double agua; 
    private double luz; 
    private double hospitalizacion;
    private double internet;
    private double pagarAgua;
    private double pagarLuz;
    private double cobrarComida;
    private double _precioMedicamentos;
    
    //Metodo para hacer el cobro de medicamento.
    public void setcobrarMedicamento () 
    {
        this.precioMedicamentos=_precioMedicamentos; 
    }
    public double getprecioMedicamentos ()
    {
        return this.precioMedicamentos; 
    }
    //Metodo para hacer el cobro de comida.
    public void setcobrarComida (double _cobrarComida)
    {
        this.cobrarComida= _cobrarComida;
    }
    
    public double getcobrarComida()
    {
        return this.cobrarComida; 
    }
    //Metodo para hacer el cobro de los servicios Medicos. 
    public void setcobrarServiciosMedicos (double _serviciosMedicos)
    {
        this.serviciosMedicos=_serviciosMedicos;
    }
    
    public double getcobrarServiciosMedicos()
    {
        return this.serviciosMedicos;
    }
    //Metodo para hacer el pago del agua
    public void setpagarAgua (double _pagarAgua)
    {
        this.agua=_pagarAgua;
    }
    
    public double getcobrarAgua ()
    {
        return this.pagarAgua;
    }
    //Metodo para hacer el pago de luz. 
    public void setpagarLuz (double pagarLuz)
    {
        this.luz=pagarLuz;
    }
    
    public double getcobrarLuz()
    {
        return this.pagarLuz;       
    }
    //Metodo para hacer el cobro de hospitalizacion/
    public void sethospitalizacion (double _cobrarHospitalizacion)
    {
        this.hospitalizacion=_cobrarHospitalizacion;
    }
    
    public double gethospitalizacion ()
    {
        return this.hospitalizacion;
    }
    //Metodo para hacer el pago de internet. 
    public void setinternet (double _cobrarInternet)
    {
        this.internet=_cobrarInternet;
    }
    
    public double getinternet ()
    {
        return this.internet; 
    }
    }
}
