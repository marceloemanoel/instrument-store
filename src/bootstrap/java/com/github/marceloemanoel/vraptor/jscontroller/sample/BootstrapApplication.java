package com.github.marceloemanoel.vraptor.jscontroller.sample;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class BootstrapApplication {
    
    public static void main(String[] args) throws Exception {
        Server server = new Server(getPort());
        server.setHandler(createWebAppContext());
        server.start();
        server.join();   
    }

    private static Integer getPort() {
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        Integer port = Integer.valueOf(webPort);
        return port;
    }

    private static WebAppContext createWebAppContext() {
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setParentLoaderPriority(true);
        root.setWar(getWarFilename());
        return root;
    }

    private static String getWarFilename() {
        File warDir = new File("build/libs");
        String[] warFiles = warDir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".war");
            }
        });
        String warFile = new File(warDir, warFiles[0]).getPath();
        return warFile;
    }

}
