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
        User user = new User ("XinYin", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua bfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnj.", 1, true);

        TextView name = findViewById(R.id.textView2);
        name.setText(user.name);

        TextView desc = findViewById(R.id.textView);
        desc.setText((user.description));

        Button followBtn = findViewById(R.id.button);
        followBtn.setOnClickListener(v -> {
            user.followed = !user.followed;
            followBtn.setText(user.followed ? "UNFOLLOW" : "FOLLOW");
        });
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