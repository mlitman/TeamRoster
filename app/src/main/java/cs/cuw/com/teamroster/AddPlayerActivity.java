package cs.cuw.com.teamroster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddPlayerActivity extends AppCompatActivity
{
    private EditText jerseyNumberET;
    private EditText skillLevelET;
    private TextView errorTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        this.jerseyNumberET = (EditText)this.findViewById(R.id.jerseyNumberET);
        this.skillLevelET = (EditText)this.findViewById(R.id.skillLevelET);
        this.errorTV = (TextView)this.findViewById(R.id.errorTV);
        this.errorTV.setText("");
    }

    public void addPlayerButtonPressed(View v)
    {
        if(this.jerseyNumberET.getText().toString().length() == 0)
        {
            this.errorTV.setText("You must enter a jersey number!");
        }
        else if(this.skillLevelET.getText().toString().length() == 0)
        {
            this.errorTV.setText("You must enter a skill level!");
        }
        else
        {
            //everything is cool, we should create our Player and add it
            this.errorTV.setText("");
            int jerseyNumber = Integer.parseInt(this.jerseyNumberET.getText().toString());
            int skillLevel = Integer.parseInt(this.skillLevelET.getText().toString());
            Player p = new Player(jerseyNumber, skillLevel);
            Core.thePlayers.add(p);
            this.finish();
        }
    }
}
