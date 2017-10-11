//TODOS LOS METODOS DE ESTA CLASE SERAN HEREDADOS

package cursoandroid.dia01.practica_01;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        bindButterKnife();
        initView();
        onPrepareToobar();



    }

    @LayoutRes
    protected abstract int getLayoutResID();


    public Toolbar getToolbar() {
        return toolbar;
    }

    //Aqui se configura el toolbarsi es que existe
    private void onPrepareToobar(){
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");

        if(toolbar!=null){
            setSupportActionBar(toolbar);
        }


    }





     //Aqui la vista ya fue creada


    protected void initView(){

    }
    private void bindButterKnife(){
        ButterKnife.bind(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
