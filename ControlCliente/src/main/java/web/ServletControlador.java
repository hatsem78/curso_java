package web;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author octavio
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCliente(request, response);
                    break;
                case "eliminar":
                    this.deleteCliente(request, response);
                    break;
                default:
                    this.accionDefult(request, response);

            }
        } else {
            this.accionDefult(request, response);
        }
    }
    
    private void editarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        ClienteDaoJDBC clienteDaoJDBC = new ClienteDaoJDBC();
        
        Cliente cliente = clienteDaoJDBC.encontrarCliente(new Cliente(idCliente));
        request.setAttribute("cliente", cliente);
        String jspEditar = "WEB-INF/paginas/cliente/editarCliente.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);        
        
    }

    private void accionDefult(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println(clientes);
        HttpSession session = request.getSession();
        session.setAttribute("clientes", clientes);
        session.setAttribute("totalClientes", clientes.size());
        session.setAttribute("saldoTotal", calcularSaldoTotal(clientes));
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);

        response.sendRedirect("clientes.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertCliente(request, response);
                    break;
                case "modificar":
                    this.updateCliente(request, response);
                    break;
                default:
                    this.accionDefult(request, response);

            }
        } else {
            this.accionDefult(request, response);
        }
    }

    private void insertCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ClienteDaoJDBC clienteDaoJDBC = new ClienteDaoJDBC();
        int row = 0;
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = 0;
        String saldoString = request.getParameter("saldo");

        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);

        row = clienteDaoJDBC.insertar(cliente);
        System.out.println("Registros insertados: " + row);
        this.accionDefult(request, response);
    }

    private void updateCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int row = 0;
        ClienteDaoJDBC clienteDaoJDBC = new ClienteDaoJDBC();

        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = Double.parseDouble(request.getParameter("saldo"));

        Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
        row = clienteDaoJDBC.actualizar(cliente);
        System.out.println("Registros modificados: " + row);
        this.accionDefult(request, response);
    }

    private void deleteCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int row = 0;
        ClienteDaoJDBC clienteDaoJDBC = new ClienteDaoJDBC();

        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        Cliente cliente = new Cliente(idCliente);
        row = clienteDaoJDBC.eliminar(cliente);
        System.out.println("Registros eliminados: " + row);
        this.accionDefult(request, response);
    }

    private double calcularSaldoTotal(List<Cliente> clientes) {
        double saldoTotal = 0;
        /*clientes.forEach(new Consumer<Cliente>() {
            @Override
            public void accept(Cliente elemento) {
                totalSaldo += elemento.getSaldo();
            }
        });*/

        for (Cliente cliente : clientes) {

            saldoTotal += cliente.getSaldo();
        }

        return saldoTotal;

    }
}
