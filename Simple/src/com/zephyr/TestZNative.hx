package com.zephyr;

import zephyr.app.IApplication;
import zephyr.app.ApplicationContext;

import com.zephyr.controllers.MainController;

/**
 *  Entry point for Zephyr Application
 */
@:keep
class TestZNative implements IApplication {

    /**
     *  Call when application ready
     *  @param context
     */
    public function onReady (context : ApplicationContext) : Void {
        // Register controller: 
        context.registerController (MainController);
        // Navigate to controller:
        context.navigate (MainController);
    }
}
