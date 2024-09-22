
package pe.edu.ucs.ec1.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ucs.ec1.dao.RolDao;
import pe.edu.ucs.ec1.daoImpl.RolDaoImpl;
import pe.edu.ucs.ec1.entity.Rol;

/**
 *
 * @author Docente
 */
public class RolController extends HttpServlet {
    private RolDao rolDao = new RolDaoImpl();
    private Gson g = new Gson();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int opcion = Integer.parseInt(request.getParameter("opc"));        
        switch(opcion){
            case 1 -> out.println(g.toJson(rolDao.readAll()));
            case 2 -> out.println(rolDao.createRol(new Rol(0,request.getParameter("rol"),1)));
            case 3 -> out.println(rolDao.deleteRol(Integer.parseInt(request.getParameter("id"))));
            case 4 -> out.println(g.toJson(rolDao.readRol(Integer.parseInt(request.getParameter("id")))));
            case 5 -> out.println(rolDao.updateRol(new Rol(Integer.parseInt(request.getParameter("id")),request.getParameter("rol"),1)));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
