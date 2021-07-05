package com.delong.spring.ioc.bean_overview.instantiating_beans.instantiation_with_a_static_factory_method;

public class ClientService
{
    private static ClientService clientService = new ClientService();

    private ClientService ()
    {
        System.out.println("static factory...");
    }

    public static ClientService createInstance ()
    {
        return clientService;
    }
}
