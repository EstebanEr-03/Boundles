package com.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ProducerActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Producer Bundle Started");
        // Logic to produce messages
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Producer Bundle Stopped");
    }
}
