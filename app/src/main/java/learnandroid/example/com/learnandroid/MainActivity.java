package learnandroid.example.com.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import learnandroid.example.com.learnandroid.utilities.MyDemo1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMyInfo();

        for (int counter = 0; counter < 10; counter++) {

            Log.i("MainActivity", "value: " + counter);
        }



    }

    private void getMyInfo() {
        // show my define string
        MyDemo1 mystr1 = new MyDemo1();

        TextView tv = (TextView) findViewById(R.id.myTextView);

        tv.setText(mystr1.getValue());
    }
}
