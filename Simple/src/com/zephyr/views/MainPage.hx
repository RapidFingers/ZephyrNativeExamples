package com.zephyr.views;

import zephyr.page.Page;
import zephyr.tags.Tag;
import zephyr.tags.TagBuilder.*;

/**
 *  Main page
 */
class MainPage extends Page {

    /**
     *  Render page
     *  @return Tag
     */
    override public function layout () : Tag {
        return vbox ({ id : "myPage", css : "myPage" },
        [
            textview ({ text : "Hello world!" })
        ]);
    }
}