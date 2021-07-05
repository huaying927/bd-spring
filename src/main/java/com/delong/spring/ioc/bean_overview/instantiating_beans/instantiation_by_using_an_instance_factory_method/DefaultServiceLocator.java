package com.delong.spring.ioc.bean_overview.instantiating_beans.instantiation_by_using_an_instance_factory_method;

public class DefaultServiceLocator
{
    private static ClientService clientService = new ClientService();

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}
