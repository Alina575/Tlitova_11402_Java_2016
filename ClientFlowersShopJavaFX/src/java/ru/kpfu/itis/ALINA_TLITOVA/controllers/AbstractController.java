package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import ru.kpfu.itis.ALINA_TLITOVA.Main;

/**
 * @author Alina Tlitova
 *         11-402
 */

public abstract class AbstractController {

    protected Main app;

    public void setApp(Main app) {
        this.app = app;
    }
}
