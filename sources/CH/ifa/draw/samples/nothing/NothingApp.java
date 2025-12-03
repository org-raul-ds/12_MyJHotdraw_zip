/*
 * @(#)NothingApp.java 5.1
 *
 */

package CH.ifa.draw.samples.nothing;

import CH.ifa.draw.application.DrawApplication;

public class NothingApp extends DrawApplication {

    NothingApp() {
        super("Nothing");
    }

    //-- main -----------------------------------------------------------

    public static void main(String[] args) {
        DrawApplication window = new NothingApp();
        window.open();
    }
}
