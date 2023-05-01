package sg.edu.np.mad.practical2;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*@Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "on start!!");
        User user = new User ("XinYin", "helloworld", 1, true);

        Button followBtn = findViewById(R.id.button);
        /*followBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Log.v(TAG,"HELLO");
                if (followBtn.getText() == "FOLLOW"){
                    Log.v(TAG,"follow");
                    followBtn.setText("UNFOLLOW");
                }
                else{
                    Log.v(TAG,"unfollow");
                    followBtn.setText("FOLLOW");
                }
            }
        });
    }*/
}