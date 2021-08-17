package com.java_essential.examples.lesson7.example;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

import javax.ws.rs.core.UriBuilder;

public class HttpProxyFactory {

    public static Proxy getProxy(String baseURL) {
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).build();

        cm.setMaxTotal(10);
        cm.setDefaultMaxPerRoute(1);

        ApacheHttpClient4Engine engine = new ApacheHttpClient4Engine(httpClient);
        ResteasyClientBuilder builder = new ResteasyClientBuilder();

        ResteasyClient client = builder.httpEngine(engine).build();
        ResteasyWebTarget target = client.target(UriBuilder.fromPath(baseURL));

        return target.proxy(Proxy.class);
    }

    public static CloseableHttpClient getProxyV2() {
        return HttpClients.createSystem();
    }
}
