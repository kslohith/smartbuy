package codingwithmitch.com.googlemapsgoogleplaces;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by K.S.LOHITH on 25-03-2018.
 */

public class shop1 extends AppCompatActivity {
    TextView t1;
    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop1);
        t1 = (TextView) findViewById(R.id.visible);
        b1 = (Button) findViewById(R.id.but);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setVisibility(View.VISIBLE);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.indiamart.com/nithya-rice-traders/.com"));
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();
        if (id == R.id.talk) {
            Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.firebase.udacity.friendlychat");
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }


}
