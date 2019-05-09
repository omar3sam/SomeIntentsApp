package com.example.someintents;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView tx;
    ImageView img ;
    private static final int SPEECH_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
    }

    public void alarm(View view) {
        // it will make an alarm after 20 seconds of taping on it's button
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "This is alarm ")
                .putExtra(AlarmClock.EXTRA_LENGTH, 20)  //Seconds
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        //permsion
    }


    public void chrome(View view) {
//it will open my facebook in the browser
        Uri uri = Uri.parse("https://www.facebook.com/omar3sam");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }



    public void mail(View view) {
        //it will type a mail to me
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, "omarreess@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subsject");
        // intent.putExtra(Intent.EXTRA_STREAM, attachment);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void map(View view) {
        //it will open the location of Rawd farag on maps
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:30.0786321,31.2367366,16z"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


    public void call(View view) {
        // action call lw call 3la tool
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01097081508"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    //*******************************************************************************************************
// VOICE
//    public void voice(View view) {
//
//        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
//                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//// Start the activity, the intent will be populated with the speech text
//        startActivityForResult(intent, SPEECH_REQUEST_CODE);
//
//    }
//    // This callback is invoked when the Speech Recognizer returns.
//// This is where you process the intent and extract the speech text from the intent.
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode,      Intent data) {
//        if (requestCode == SPEECH_REQUEST_CODE && resultCode == RESULT_OK) {
//            List<String> results = data.getStringArrayListExtra(
//                    RecognizerIntent.EXTRA_RESULTS);
//            String spokenText = results.get(0);
//            tx.setText(spokenText);
//            // Do something with spokenText
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//    }

//************************************************************************************************************



    public void sms(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
        intent.putExtra("sms_body", "kskdkd");
        //  intent.putExtra(Intent.EXTRA_STREAM, attachment);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } }

    public void search(View view) {
//it will search in google by egypt
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "Egyptt");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }

}
