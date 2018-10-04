package timothy.hernandez.com.hernandeztimothyexam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button3){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
