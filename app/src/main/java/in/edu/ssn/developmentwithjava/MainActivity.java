package in.edu.ssn.developmentwithjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import in.edu.ssn.developmentwithjava.Helper.StringHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringHelper sh = new StringHelper();

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(sh.getStringValue());
    }
}
