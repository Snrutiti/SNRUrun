package snru.boonkun.titinun.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {
    //Explicit
    private EditText nameEditText, UserEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1RadioButton,choice2RadioButton,choice3RadioButton,choice4RadioButton, choice5RadioButton;
    private  String nameString,UserString,passwordString, avataString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Bind Widgt
        bindWidger();


    }   //Main Method

    private void bindWidger() {

        nameEditText = (EditText) findViewById(R.id.editText);
        UserEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void clickSihnUpSign(View view) {

        //Get Value From EdiText
        nameString = nameEditText.getText().toString().trim();
        UserString = UserEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        //check Space
        if (nameString.equals("")  || UserString.equals("") || passwordString.equals("")) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่องว่าง");

        } else {
        }


    }
}   //Main class
