package com.customutils.forservlet;

import javax.servlet.http.HttpServletRequest;

public class GeneralOperate {
    public void showRequestFullContent(HttpServletRequest request) {
        System.out.println("Protocol: " + request.getProtocol());
        System.out.println("Scheme: " + request.getScheme());
        System.out.println("Server Name: " + request.getServerName());
        System.out.println("Server Port: " + request.getServerPort());
        System.out.println("Protocol: " + request.getProtocol());
        System.out.println("Server Info: " + request.getServletContext().getServerInfo());
        System.out.println("Remote Addr: " + request.getRemoteAddr());
        System.out.println("Remote Host: " + request.getRemoteHost());
        System.out.println("Character Encoding: " + request.getCharacterEncoding());
        System.out.println("Content Length: " + request.getContentLength());
        System.out.println("Content Type: " + request.getContentType());
        System.out.println("Auth Type: " + request.getAuthType());
        System.out.println("HTTP Method: " + request.getMethod());
        System.out.println("Path Info: " + request.getPathInfo());
        System.out.println("Path Trans: " + request.getPathTranslated());
        System.out.println("Query String: " + request.getQueryString());
        System.out.println("Remote User: " + request.getRemoteUser());
        System.out.println("Session Id: " + request.getRequestedSessionId());
        System.out.println("Request URL: " + request.getRequestURL());
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Servlet Path: " + request.getServletPath());
        System.out.println("Accept: " + request.getHeader("Accept"));
        System.out.println("Host: " + request.getHeader("Host"));
        System.out.println("Referer : " + request.getHeader("Referer"));
        System.out.println("Accept-Language : " + request.getHeader("Accept-Language"));
        System.out.println("Accept-Encoding : " + request.getHeader("Accept-Encoding"));
        System.out.println("User-Agent : " + request.getHeader("User-Agent"));
        System.out.println("Connection : " + request.getHeader("Connection"));
        System.out.println("Cookie : " + request.getHeader("Cookie"));
    }

}
