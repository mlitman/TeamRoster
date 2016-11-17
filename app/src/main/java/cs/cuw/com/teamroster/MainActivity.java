package cs.cuw.com.teamroster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private LinearLayout playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.playerList = (LinearLayout)this.findViewById(R.id.playerList);
    }

    public void addPlayerButtonPressed(View v)
    {
        Intent i = new Intent(this, AddPlayerActivity.class);
        this.startActivity(i);
        TextView tv = new TextView(this);
        tv.setText("Blah");
        this.playerList.addView(tv);
    }
}
