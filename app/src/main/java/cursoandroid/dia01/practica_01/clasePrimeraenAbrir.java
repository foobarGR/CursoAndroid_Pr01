package cursoandroid.dia01.practica_01;

import android.app.Application;
import android.util.Log;

/**
 * Created by juamp on 30/09/2017.
 */

public class clasePrimeraenAbrir extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("ENTRO","PRIMERA EN ABRIR");
    }
}
