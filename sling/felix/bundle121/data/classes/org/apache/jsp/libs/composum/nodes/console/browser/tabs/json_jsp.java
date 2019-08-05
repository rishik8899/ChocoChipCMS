package org.apache.jsp.libs.composum.nodes.console.browser.tabs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class json_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  sling:defineObjects
      org.apache.sling.scripting.jsp.taglib.DefineObjectsTag _jspx_th_sling_005fdefineObjects_005f0 = (org.apache.sling.scripting.jsp.taglib.DefineObjectsTag) _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.get(org.apache.sling.scripting.jsp.taglib.DefineObjectsTag.class);
      _jspx_th_sling_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sling_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_sling_005fdefineObjects_005f0 = _jspx_th_sling_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_sling_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      out.write('\n');
      //  cpn:component
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_005fcomponent_005f0 = (com.composum.sling.cpnl.ComponentTag) _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_005fcomponent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_005fcomponent_005f0.setParent(null);
      // /libs/composum/nodes/console/browser/tabs/json.jsp(5,0) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setId("browser");
      // /libs/composum/nodes/console/browser/tabs/json.jsp(5,0) name = type type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/console/browser/tabs/json.jsp(5,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setScope("request");
      int _jspx_eval_cpn_005fcomponent_005f0 = _jspx_th_cpn_005fcomponent_005f0.doStartTag();
      if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.nodes.browser.Browser browser = null;
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_005fcomponent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_005fcomponent_005f0.doInitBody();
        }
        browser = (com.composum.sling.nodes.browser.Browser) _jspx_page_context.findAttribute("browser");
        do {
          out.write("\n");
          out.write("  <div class=\"json detail-panel\">\n");
          out.write("    <div class=\"json-toolbar detail-toolbar\">\n");
          out.write("      <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("        <div class=\"depth input-group input-group-sm widget number-field-widget\">\n");
          out.write("          <span class=\"fa fa-level-down input-group-addon text-muted\" title=\"content depth\"></span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" />\n");
          out.write("          <span class=\"input-group-addon spinner\">\n");
          out.write("              <span class=\"decrement fa fa-minus\" title=\"decrement\"></span>\n");
          out.write("              <span class=\"increment fa fa-plus\" title=\"increment\"></span>\n");
          out.write("          </span>\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"props btn-group btn-group-sm widget select-buttons-widget\">\n");
          out.write("        <button type=\"button\" data-value=\"source\" class=\"fa fa-sticky-note-o btn btn-default\" title=\"render as JSON source\"><span class=\"label\">Source</span></button>\n");
          out.write("        <button type=\"button\" data-value=\"notype\" class=\"fa fa-times btn btn-default\" title=\"no type hints in values\"><span class=\"label\">no type</span></button>\n");
          out.write("        <button type=\"button\" data-value=\"type\" class=\"fa fa-exclamation btn btn-default\" title=\"type hints in values\"><span class=\"label\">no type</span></button>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"binary btn-group btn-group-sm widget select-buttons-widget\">\n");
          out.write("        <button type=\"button\" data-value=\"link\" class=\"fa fa-external-link btn btn-default\" title=\"embed link to binary data\"><span class=\"label\">Link</span></button>\n");
          out.write("        <button type=\"button\" data-value=\"base64\" class=\"fa fa-plus-square btn btn-default\" title=\"embed binary data base64 encoded\"><span class=\"label\">Base 64</span></button>\n");
          out.write("        <button type=\"button\" data-value=\"skip\" class=\"fa fa-minus-square-o btn btn-default\" title=\"skip binary data\"><span class=\"label\">Skip</span></button>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("        <div class=\"indent input-group input-group-sm widget number-field-widget\" data-options=\"0:2:4\">\n");
          out.write("          <span class=\"fa fa-indent input-group-addon text-muted\" title=\"text indent\"></span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" />\n");
          out.write("          <span class=\"input-group-addon spinner\">\n");
          out.write("              <span class=\"decrement fa fa-minus\" title=\"decrement\"></span>\n");
          out.write("              <span class=\"increment fa fa-plus\" title=\"increment\"></span>\n");
          out.write("          </span>\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("        <button type=\"button\" class=\"copy fa fa-copy btn btn-default\" title=\"Copy JSON to clipboard\"><span class=\"label\">Copy</span></button>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("        <a href=\"\" class=\"download fa fa-download btn btn-default\" title=\"Download as JSON file\"><span class=\"label\">Download</span></a>\n");
          out.write("        <button type=\"button\" class=\"upload fa fa-upload btn btn-default\" title=\"Update from an uploaded JSON file\"><span class=\"label\">Upload</span></button>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"menu btn-group btn-group-sm dropdown\" role=\"group\">\n");
          out.write("        <button type=\"button\" class=\"reload fa fa-refresh btn btn-default\" title=\"Reload JSON view\"><span class=\"label\">Reload</span></button>\n");
          out.write("        <button type=\"button\"\n");
          out.write("                class=\"glyphicon-menu-hamburger glyphicon btn btn-default dropdown-toggle\"\n");
          out.write("                data-toggle=\"dropdown\" title=\"Source type...\"><span class=\"label\">Source type...</span>\n");
          out.write("        </button>\n");
          out.write("        <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
          out.write("          <li class=\"active\"><a href=\"#json\" class=\"json\"\n");
          out.write("                 title=\"Show a JSON view of the source\">JSON</a></li>\n");
          out.write("          <li><a href=\"#xml\" class=\"xml\"\n");
          out.write("                 title=\"Show a XML view of the source\">XML</a></li>\n");
          out.write("        </ul>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <div class=\"embedded frame-container detail-content\">\n");
          out.write("      <iframe src=\"\" width=\"100%\" height=\"100%\"></iframe>\n");
          out.write("    </div>\n");
          out.write("  </div>\n");
          int evalDoAfterBody = _jspx_th_cpn_005fcomponent_005f0.doAfterBody();
          browser = (com.composum.sling.nodes.browser.Browser) _jspx_page_context.findAttribute("browser");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_cpn_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.reuse(_jspx_th_cpn_005fcomponent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.reuse(_jspx_th_cpn_005fcomponent_005f0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
