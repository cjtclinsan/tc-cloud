package com.example.sbmp;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

/**
 * @author lengleng
 * @date 2017/11/27
 */
public class IpCilentFilter extends ClientFilter {
    @Override
    public ClientResponse handle(ClientRequest clientRequest) throws ClientHandlerException {
        ClientResponse response = this.getNext().handle(clientRequest);
        return response;
    }
}
