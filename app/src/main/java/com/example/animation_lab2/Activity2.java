package com.example.animation_lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ImageView light_lavender = (ImageView) findViewById(R.id.imageView);
        ImageView lavender = (ImageView) findViewById(R.id.imageView2);
        ImageView lavender_3 = (ImageView) findViewById(R.id.imageView7);
        ImageView lavender_4 = (ImageView) findViewById(R.id.imageView8);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
        light_lavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity2.this,
                        Activity3.class);

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Activity2.this, light_lavender,
                                ViewCompat.getTransitionName(light_lavender));


                Bundle b = new Bundle();
                b.putInt("imageId", R.drawable.lavender);
                b.putString("content", "The word “carnival” derives from the Latin “carnelevare” meaning “to take out the meat”. The medieval Church banished meat from the table during the whole period of Lent, as it did with sugar, ingredients containing fat, eggs and dairy products. ");
                intent.putExtras(b);
                startActivity(intent, options.toBundle());
            }
        });
    }
}