package com.customutils.forservlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;

public class GeneralOperate {
    public void showRequestFullContent(HttpServletRequest request) throws IOException {
        //1. 获取请求方式、处理乱码问题
        String method = request.getMethod();
        println(method);

        //servletRequest中的方法
        request.setCharacterEncoding("utf-8");
        //1. 获取请求体的编码方式
        String characterEncoding = request.getCharacterEncoding();
        println("getCharacterEncoding = " + characterEncoding);

        //2. get body length
        int contentLength = request.getContentLength();
        println("getContentLength = " + contentLength);

        //3. MIME type
        String mimeType = request.getContentType();
        println("getContentType = " + mimeType);

        //4. 接收请求的接口的 Internet Protocol (IP) 地址
        String ip = request.getLocalAddr();
        println("getLocalAddr = " + ip);

        //5. 基于 Accept-Language 头，返回客户端将用来接受内容的首选 Locale 客户端语言环境
        Locale locale = request.getLocale();
        println("getLocale = " + locale);

        //6. 所有的语言环境
        Enumeration<Locale> locales = request.getLocales();
        while (locales.hasMoreElements()) {
            Locale temp = locales.nextElement();
            println("\n Locales = " + temp);
        }

        //7. 接收请求的 Internet Protocol (IP) 接口的主机名
        String localName = request.getLocalName();
        println("localName = " + localName);

        //8. 接收请求的接口的 Internet Protocol (IP) 端口号
        int localPort = request.getLocalPort();
        println("localPort = " + localPort);

        //9. 返回请求使用的协议的名称和版本
        String protocol = request.getProtocol();
        println("protocol = " + protocol);

        //10. 读取请求正文信息
        BufferedReader reader = request.getReader();
        println("getReader = " + reader.toString());

        //11. 发送请求的客户端
        String remoteAddr = request.getRemoteAddr();
        println("RemoteAddr = " + remoteAddr);

        //12. 发送请求的客户主机
        String remoteHost = request.getRemoteHost();
        println("RemoteHost = " + remoteHost);

        //13. 发送请求的客户主机端口
        int remotePort = request.getRemotePort();
        println("RemotePort = " + remotePort);

        //14. 返回用于发出此请求的方案名称，例如：http 、 https 、 ftp
        String scheme = request.getScheme();
        println("Scheme = " + scheme);

        //15. 返回请求被发送到的服务器的主机名。它是Host头值":"(如果有)之前的那部分的值。 或者解析服务器名称或服务器的IP地址
        String serverName = request.getServerName();
        println("ServerName = " + serverName);

        //16. 返回请求被发送到的端口。他是"Host"头值":" （如果有）之后的那部分的值，或者接受客户端连接的服务器端口。
        int serverPort = request.getServerPort();
        println("ServerPort = " + serverPort);

        //17. 返回一个boolean值，指示此请求是否是使用安全通道(比如HTTPS) 发出的。
        boolean secure = request.isSecure();
        println("isSecure = " + secure);

        //以上方法为 ServletRequest 接口提供的


        //以下方法为 HttpServletRequest 接口提供的

        /*
         * 18. 返回用于保护servlet的验证方法名称。 所有的servlet容器都支持
         * basic、 form和client certificate验证, 并且可能还支持digest验证
         */
        String authType = request.getAuthType();
        println("authType = " + authType);

        //19. getDateHeader ??
        request.getDateHeader("");

        //20. 返回请求头包含的所有头名称的枚举。
        Enumeration<String> headerNames = request.getHeaderNames();
        println("<hr/>");
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            println(" headerNmea = " + name + ";　　　getHeader = " + request.getHeader(name));
        }

        println("<hr/>");
        //21. 以int的形式返回指定请求头的值。 ???
        request.getIntHeader("123");

        //22. 返回与客户端发出此请求时发送的URL相关联的额外路径信息。
        String pathInfo = request.getPathInfo();
        println("PathInfo = " + pathInfo);

        //23. 返回包含在请求RUL中路径后面的查询字符串。如果没有查询字符串返回null
        String remoteUser = request.getRemoteUser();
        println("RemoteUser = " + remoteUser);

        //24. 返回客户端制定的回话ID
        String requestedSessionId = request.getRequestedSessionId();
        println("requestSessionId = " + requestedSessionId);

        //25. 返回请求调用servlet的URL部分
        String servletPath = request.getServletPath();
        println("servletPath = " + servletPath);

        //26. 返回与此请求关联的当前HttpSession，如果没有当前会话并且参数为true,则返回一个新会话。
        HttpSession session = request.getSession(true);
        println("getSession(true) = " + session);

        //27. 返回包含当前已经过验证的用户的名称的java.security.Principal对象。如果用户没有经过验证，则该方法返回null
        Principal userPrincipal = request.getUserPrincipal();
        println("userPrincipal = " + userPrincipal);

        //28. 检查会话的id是否作为Cook进入的
        boolean sessionIdFromCookie = request.isRequestedSessionIdFromCookie();
        println("sessionIdFromCookie = " + sessionIdFromCookie);

        //29. 检查请求的会话ID是否作为请求的URL的一部分进入的
        boolean sessionIdFromURL = request.isRequestedSessionIdFromURL();
        println("sessionIdFormURL = " + sessionIdFromURL);
    }

    private void println(Object obj) {
        System.out.println(obj);
    }
}
