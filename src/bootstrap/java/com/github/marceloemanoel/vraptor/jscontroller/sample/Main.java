package com.github.marceloemanoel.vraptor.jscontroller.sample;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
    
    public static void main(String[] args) throws Exception {
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setWar("build/libs/instrument-store-0.2.war");
        root.setParentLoaderPriority(true);
        
        Server server = new Server(Integer.valueOf(webPort));
        server.setHandler(root);
        server.start();
        server.join();   
    }

}
