package ga.uprising.desklancer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ga.uprising.desklancer.Categories.Art_Design;
import ga.uprising.desklancer.Categories.SoftDev;
import ga.uprising.desklancer.R;

public class Post_Job extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post__job);
    }

    public void art(View view) {
        Intent art = new Intent(getApplicationContext(), Art_Design.class);
        startActivity(art);
    }

    public void soft(View view) {
        Intent art = new Intent(getApplicationContext(), SoftDev.class);
        startActivity(art);
    }
}
