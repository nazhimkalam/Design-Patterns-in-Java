package com.phone;

public class OperatingSystemFactory
{
    public OS getInstance(String name)
    {
        if(name.equals("Android"))
        {
            return new Android();
        }
        else if(name.equals("IOS"))
        {
            return new IOS();
        }
        else
        {
            return new Window();
        }
    }
}
