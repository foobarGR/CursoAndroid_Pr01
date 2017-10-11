package cursoandroid.dia01.practica_01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.OnClick;

public class LogIn extends BaseActivity {

    Toolbar toolbar ;
    EditText email;
    EditText pass;



 TextInputLayout Tpass,Temail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setContentView(getLayoutResID());
        email=(EditText)findViewById(R.id.et_email);
        pass=(EditText)findViewById(R.id.et_pass);
        Tpass=(TextInputLayout)findViewById(R.id.txtPass);
        Temail=(TextInputLayout)findViewById(R.id.txtEmail);
        Button login=(Button)findViewById(R.id.btnLog);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isValidLogin()){

                }
            }
        });



    }


    @Override
    protected int getLayoutResID() {
        return R.layout.activity_log_in;
    }

    @Override
    protected void initView() {
        super.initView();
    }

    private void initConfigToolbar(){
        toolbar=getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
    }



    private boolean isValidLogin(){
        boolean valid=true;

        Temail.setError(null);
        Tpass.setError(null);

        Temail.setErrorEnabled(false);
        Tpass.setErrorEnabled(false);

        if(email.getText().toString().isEmpty()){
            valid=false;
            Temail.setError(getString(R.string.login_text_error_isEmpty));

        }

        if(pass.getText().toString().isEmpty()){
            valid=false;
            Tpass.setError(getString(R.string.login_text_error_isEmpty_pass));

        }

        if(!isEmailValid(email.getText().toString())){
            valid=false;
            Temail.setError(getString(R.string.login_textError_email_invalid));
        }

        return valid;

    }

    private boolean isEmailValid(CharSequence charS){

        if(TextUtils.isEmpty(charS)){
            return false;
        }else{
            return Patterns.EMAIL_ADDRESS.matcher(charS).matches();
        }

    }
}
