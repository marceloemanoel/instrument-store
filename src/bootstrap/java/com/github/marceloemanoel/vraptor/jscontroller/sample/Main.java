package com.github.marceloemanoel.vraptor.jscontroller.sample;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
    
    public static void main(String[] args) throws Exception {
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        
        File warDir = new File("build/libs");
        String[] warFiles = warDir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".war");
            }
        });
        
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setWar(new File(warDir, warFiles[0]).getPath());
        root.setParentLoaderPriority(true);
        
        Server server = new Server(Integer.valueOf(webPort));
        server.setHandler(root);
        server.start();
        server.join();   
    }

}
