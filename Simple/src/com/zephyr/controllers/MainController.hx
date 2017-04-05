package com.zephyr.controllers;

import zephyr.controller.Controller;
import com.zephyr.views.MainPage;

class MainController extends Controller {

    /**
     *  On enter
     */
    override public function onEnter () : Void {
        var page = new MainPage ();        
        setPage (page);
    }

    /**
     *  On leave
     */
    override public function onLeave () : Void {

    }
}