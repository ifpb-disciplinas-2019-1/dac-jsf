package br.edu.ifpb.web.jsp;

import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;
import br.edu.ifpb.infra.memory.PessoasEmMemoria;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo Job
 */
@WebServlet(name = "ControladorDePessoas",urlPatterns = {"/pessoas"})
public class ControladorDePessoas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        Pessoas service = (Pessoas) req.getSession().getAttribute("pessoas");
        if (service == null) {
            service = new PessoasEmMemoria();
        }
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorDePessoas</title>");
            out.println("</head>");
            out.println("<body>");

            service.todas().forEach(p
                -> out.println("<p>" + p + " </p>")
            );
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException {

        //tratar a requisição
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        Pessoa pessoa = new Pessoa(nome,cpf);

        //executar a lógica
        Pessoas service = (Pessoas) request.getSession().getAttribute("pessoas");
        if (service == null) {
            service = new PessoasEmMemoria();
        }
        service.nova(pessoa);
        request.getSession().setAttribute("pessoas",service);

        // redirecionar a resposta
        imprimir(response,request);
    }

    private void imprimir(HttpServletResponse response,HttpServletRequest request) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorDePessoas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Tudo certo :) </h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
