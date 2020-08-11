package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2><CENTER><font color =\"#FFFFFF\"> AUDITORIA </CENTER></h2>\n");
      out.write("        <p>La auditoría de sistemas se encarga de recoger agrupar y evaluar evidencias para determinar si los sistemas\n");
      out.write("            de información salvaguarda los activos y mantienen la integridad de los datos a través del uso eficaz\n");
      out.write("            de los recursos de la organización.\n");
      out.write("            .</p>\n");
      out.write("        <p>La auditoría de sistemas procura la disponibilidad integridad veracidad y privacidad de la información\n");
      out.write("            a través de técnicas de validación y recomendaciones basadas en las mejores prácticas y estándares internacionales.\n");
      out.write("            Esta función puede operar a lo interno o externo de la empresa.\n");
      out.write("            La auditoría interna es realizada por un agente interno de la empresa que tiene como función realizar\n");
      out.write("            un análisis profesional objetivo y crítico como resultado de la evaluación de los controles internos\n");
      out.write("            y el cumplimiento de planes con el fin de mejorar la operación de la empresa.\n");
      out.write("\n");
      out.write("        </P>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
