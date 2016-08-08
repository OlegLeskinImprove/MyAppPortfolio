package leskin.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMoviesClick(View view) {
        showToast(((Button) view).getText().toString());
    }

    public void stockHawkClick(View view) {
        showToast(((Button) view).getText().toString());
    }

    public void buildItBiggerClick(View view) {
        showToast(((Button) view).getText().toString());
    }

    public void makeAppMaterialClick(View view) {
        showToast(((Button) view).getText().toString());
    }

    public void goUbiquitousClick(View view) {
        showToast(((Button) view).getText().toString());
    }

    public void capstoneClick(View view) {
        showToast(((Button) view).getText().toString());
    }

    private void showToast(String text) {
        String message = getString(R.string.toast_message_part_1) + " " + text + " " + getString(R.string.toast_message_part_2);
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
