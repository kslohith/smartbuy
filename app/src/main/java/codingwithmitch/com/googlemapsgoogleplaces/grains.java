package codingwithmitch.com.googlemapsgoogleplaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by K.S.LOHITH on 25-03-2018.
 */

public class grains extends AppCompatActivity {
    TextView t1 , t2 , t3 , t4 , t5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gr);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);

        t1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent intent = new Intent(grains.this, shop1.class);
                                      startActivity(intent);
                                  }
                              });


    }
}
