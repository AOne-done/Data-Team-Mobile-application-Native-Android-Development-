package com.example.datateam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText ;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.datateam.R;

public class MainActivity extends AppCompatActivity {

    public EditText store_e1_data ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // Call a method to handle the button click event
                handleButtonClick();
            }
        });
    }

    // Method to handle the button click event
    private void handleButtonClick() {
        // Perform an action when the button is clicked
        Toast.makeText(MainActivity.this,"store_e1_data" , Toast.LENGTH_SHORT).show();
    }
}



//-------------------------------------------------------
//@Override
//protected void onStart()
//{
//    super.onStart();
//    Log.d(tag ,"We are in onStart event");
//
//}
//@Override
//protected void onResume()
//{
//    super.onResume();
//    Log.d(tag , "We are in on Resume event");
//}
//@Override
//protected void onPause()
//{
//    super.onPause();
//    Log.d(tag,"We are in onPause event");
//}
//@Override
//protected void onStop()
//{
//    super.onStop();
//    Log.d(tag , "We are in onStop event");
//}
//@Override
//protected void onDestroy()
//{
//    super.onDestroy();
//    Log.d(tag , "We are in on Destroy event");
//}
//@Override
//protected void onRestart()
//{
//    super.onRestart();
//    Log.d(tag, "We are in onRestart event");
//}





//   Log.d(tag, "We are in onCreate Event");
////----------------------------create buttom to move to sconed activity----------------------------
////Button navigatebutton = findViewById(R.id.toscreen1);
////navigatebutton.setOnClickListener(new View.OnClickListener()
//        {
//@Override
//public void onClick(View v)
//{
//
//}

//-----------------------------------------------------------
//Intent intent = new Intent(MainActivity.this, screen_3.class); //(activity1_name.this,activity2_name.class)
//intent.putExtra("key", "Hello From Main Activity");
//startActivity(intent);
//-----------------------------------------------------------



//}
//----------------------------create buttom to move to sconed activity----------------------------
// create method will use in button to move to sconed activity
//});
//-------------------------------------------------------