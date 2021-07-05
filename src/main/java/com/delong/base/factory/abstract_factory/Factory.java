package com.delong.base.factory.abstract_factory;

public interface Factory
{
   public abstract Benz getBenzProduct(String type);
   
   public abstract Maybach getMaybachProduct(String type);
}
