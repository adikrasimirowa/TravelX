package inc0n3ck.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button secondActivity = (Button) findViewById(R.id.mapActivityBtn);
        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(startIntent);
            }
        });
        
        
         ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(MainActivity.this)
                .load(R.drawable.bg)
                .asGif()
                .placeholder(R.drawable.bg)
                .crossFade()
                .into(imageView);

    }

}
