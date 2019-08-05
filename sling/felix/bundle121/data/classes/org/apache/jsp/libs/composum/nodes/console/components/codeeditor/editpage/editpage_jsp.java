package org.apache.jsp.libs.composum.nodes.console.components.codeeditor.editpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editpage_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.release();
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.release();
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
      // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(5,0) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setId("editor");
      // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(5,0) name = type type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setType("com.composum.sling.nodes.components.codeeditor.CodeEditor");
      // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(5,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setScope("request");
      int _jspx_eval_cpn_005fcomponent_005f0 = _jspx_th_cpn_005fcomponent_005f0.doStartTag();
      if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.nodes.components.codeeditor.CodeEditor editor = null;
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_005fcomponent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_005fcomponent_005f0.doInitBody();
        }
        editor = (com.composum.sling.nodes.components.codeeditor.CodeEditor) _jspx_page_context.findAttribute("editor");
        do {
          out.write("\n");
          out.write("    <html data-context-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${slingRequest.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("    <head>\n");
          out.write("        <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1, maximum-scale=1, user-scalable=no\"/>\n");
          out.write("        <title>Edit - ");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editor.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</title>\n");
          out.write("        ");
          if (_jspx_meth_cpn_005fclientlib_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </head>\n");
          out.write("    <body id=\"editor\" class=\"composum-nodes-components-codeeditor_page\"\n");
          out.write("          data-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editor.contentPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-type=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editor.textType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("    ");
          if (_jspx_meth_sling_005fcall_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_005fcall_005f1(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_005finclude_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_cpn_005fclientlib_005f1(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </body>\n");
          out.write("    </html>\n");
          int evalDoAfterBody = _jspx_th_cpn_005fcomponent_005f0.doAfterBody();
          editor = (com.composum.sling.nodes.components.codeeditor.CodeEditor) _jspx_page_context.findAttribute("editor");
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
      out.write('\n');
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

  private boolean _jspx_meth_cpn_005fclientlib_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:clientlib
    com.composum.sling.cpnl.ClientlibTag _jspx_th_cpn_005fclientlib_005f0 = (com.composum.sling.cpnl.ClientlibTag) _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.get(com.composum.sling.cpnl.ClientlibTag.class);
    _jspx_th_cpn_005fclientlib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_005fclientlib_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(10,8) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005fclientlib_005f0.setType("css");
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(10,8) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005fclientlib_005f0.setPath("composum/nodes/console/clientlibs/codeeditor");
    int _jspx_eval_cpn_005fclientlib_005f0 = _jspx_th_cpn_005fclientlib_005f0.doStartTag();
    if (_jspx_th_cpn_005fclientlib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(14,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f0.setScript("/libs/composum/nodes/commons/components/dialogs/alert.jsp");
    int _jspx_eval_sling_005fcall_005f0 = _jspx_th_sling_005fcall_005f0.doStartTag();
    if (_jspx_th_sling_005fcall_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f1 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(15,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f1.setScript("/libs/composum/nodes/console/page/dialogs/user-status.jsp");
    int _jspx_eval_sling_005fcall_005f1 = _jspx_th_sling_005fcall_005f1.doStartTag();
    if (_jspx_th_sling_005fcall_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(16,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f0.setResourceType("composum/nodes/console/components/codeeditor");
    int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
    if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_cpn_005fclientlib_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:clientlib
    com.composum.sling.cpnl.ClientlibTag _jspx_th_cpn_005fclientlib_005f1 = (com.composum.sling.cpnl.ClientlibTag) _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.get(com.composum.sling.cpnl.ClientlibTag.class);
    _jspx_th_cpn_005fclientlib_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cpn_005fclientlib_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(17,4) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005fclientlib_005f1.setType("js");
    // /libs/composum/nodes/console/components/codeeditor/editpage/editpage.jsp(17,4) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_005fclientlib_005f1.setPath("composum/nodes/console/clientlibs/codeeditor");
    int _jspx_eval_cpn_005fclientlib_005f1 = _jspx_th_cpn_005fclientlib_005f1.doStartTag();
    if (_jspx_th_cpn_005fclientlib_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcpn_005fclientlib_005ftype_005fpath_005fnobody.reuse(_jspx_th_cpn_005fclientlib_005f1);
    return false;
  }
}
