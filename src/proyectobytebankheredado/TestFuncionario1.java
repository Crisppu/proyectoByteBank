/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado;

/**
 *
 * @author Crist
 */
public class TestFuncionario1 {
    public static void main(String[] args) {
        // para saber cuantas Cuentas hay Static System.out.println(Cuenta.getTotalDeCuentas());

        /*Funcionario cris = new Funcionario();
        cris.setNombre("cris");
        cris.setDocumento("0123");
        cris.setSalario(2000);
        
        ControlBonificacion controlbonificacion = new ControlBonificacion();
        
        controlbonificacion.registrarSalario(cris);

        Gerente maria = new Gerente();
        
        maria.setSalario(500);
        controlbonificacion.registrarSalario(maria);

       Contador carlos = new Contador();
       carlos.setSalario(100);
       controlbonificacion.registrarSalario(carlos);
        System.out.println(controlbonificacion.getSuma());*/
        
        /* polimorfismo
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorro ca = new CuentaAhorro(1,2);
        
        cc.depositar(2000);
        //cc.retirar(1000);
        cc.transferir(1000, ca);
        System.out.println(cc.getSaldo());
        //System.out.println(ca.getSaldo());
        */
        
        /*metodo de abstraccion*/
        /*
        Funcionario fc = new Gerente();
        fc.setNombre("cris1");
        fc.setSalario(1000);
        fc.getBonificacion();
        System.out.println(fc.getBonificacion());
        
        Funcionario ct = new Contador();
        ct.setNombre("cris1");
       ct.setSalario(1000);
        ct.getBonificacion();
        System.out.println(ct.getBonificacion());
        
        ControlBonificacion controlbonificacion = new ControlBonificacion();
        controlbonificacion.registrarSalario(fc);
        controlbonificacion.registrarSalario(ct);
        controlbonificacion.getSuma();
        System.out.println(controlbonificacion.getSuma());
        
        CuentaCorriente d = new CuentaCorriente(1,1);
       
       d.depositar(4);
        Cuenta w = new CuentaCorriente(1,1);
        w.depositar(4);*/
        SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		gerente1.setclave("1234");
		sistema.autentica(gerente1);
		//sistema.autentica(admin);
                //gerente1.iniciarSecion(clave)
                
               
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        /*Cliente cli = new Cliente();
        cli.setclave("1234");
        sistema.autentica(cli);
        cc.depositar(100.0);
        cc.setCliente(cli);
        */
        System.out.println(cc.getCliente());
        cc.getCliente().setNombre("carlos");
        
        CuentaCorriente ccw = new CuentaCorriente(2222, 3333);
        Cliente c = new Cliente();
        ccw.setCliente(c);
        System.out.println(ccw.getCliente());

        
        
        
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

        calc.registra(cc);
        calc.registra(seguro);
        System.out.println(calc.getTotalImpuesto());
    
                
    }
    
}
