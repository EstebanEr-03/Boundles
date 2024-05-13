package com.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ConsumerActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Consumer Bundle Started");
        // Logic to consume messages from Producer
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Consumer Bundle Stopped");
    }
}
