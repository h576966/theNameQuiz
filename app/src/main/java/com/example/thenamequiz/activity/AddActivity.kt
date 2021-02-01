package com.example.thenamequiz.activity

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thenamequiz.databinding.ActivityAddBinding
import com.example.thenamequiz.model.Person
import com.example.thenamequiz.model.Shared
import com.example.thenamequiz.R
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.*
import java.io.IOException


class AddActivity : AppCompatActivity() {
    private var personList // A list to store the photos in
            : ArrayList<Person>? = null
    private val PICK_IMAGE_REQUEST = 100 // the request code defined as an instance variable

    private var iv: ImageView? = null
    private var name: String? = null
    private var image: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iv = binding.imageView

        personList = Shared.getPersonList(); // Get the full list from data structure

        binding.imageBtn.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_GET_CONTENT
            shareIntent.type = "image/*"
            startActivityForResult(intent, PICK_IMAGE_REQUEST)


        }
        /* Button btn = (Button)findViewById(R.id.imageBtn);       //The button is created´"Velg bilde"
        btn.setOnClickListener(new View.OnClickListener() {            //The action is created
            public void onClick(View v) {                         //Make it possible for the user to add an image
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_REQUEST);
            }
        });
        */
        */
        binding.addBtn.setOnClickListener {
            fun onClick(view: View) {

                var editText = binding.editTextName
               name = binding.editTextName.text.toString()

                var text = ""
                var added = false

                if (!name.equals("")&& image != null){
                    PersonList.addPerson(name, image)
                    added = true
                    text = "Picture was added"
                }else { text = "Add text or image" }

                var context = applicationContext //might be wrong
                var duration = Toast.LENGTH_SHORT
                var toast = Toast.makeText(context, text, duration);  //creating the Toast

                toast.show()

                if(added){                                                  //If image is not added
                    editText.getText().clear();                              //empty the editText
                    iv!!.setImageResource(0);                                   //remove image
                }
            }

        }

         fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)

            when(requestCode) {

                PICK_IMAGE_REQUEST-> if (resultCode == RESULT_OK){
                val selectedImage = data.getData()
                try{
                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedImage)

                    image = bitmap
                    iv!!.setImageBitmap(bitmap)
                } catch (e:IOException){
                    e.printStackTrace()
                }

                }
            }}
        }
        }




           /* Button btn2 = (Button)findViewById(R.id.addBtn);       //The button is created´"Legg til"
        btn2.setOnClickListener(new View.OnClickListener() {      //The action is created

            public void onClick(View v) {

                EditText editText = (EditText)findViewById(R.id.editTextName);
                name = editText.getText().toString();

                String text;
                boolean added = false;

                if(!name.equals("") && image != null) {                   //Checking that name and image have values
                    PersonList.addPerson(name, image);                      //Adding image and name of person to the arrayList
                    added = true;
                    text = "Picture was added";                       //Toast-text if image is added

                }else{
                    text = "Add text or image";                    //Toast-text if name or image is missing
                }
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;                      //Says how long the Toast should last
                Toast toast = Toast.makeText(context, text, duration);  //creating the Toast

                toast.show();

                if(added){                                                  //If image is not added
                    editText.getText().clear();                              //empty the editText
                    iv.setImageResource(0);                                   //remove image
                }
            }

        });

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            switch (requestCode) {
                case PICK_IMAGE_REQUEST:
                if (resultCode == RESULT_OK) {
                    Uri selectedImage = data.getData();

                    // method 1
                    try {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImage);
                        image = bitmap;
                        iv.setImageBitmap(bitmap);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }}



    }
    // Gammel
    /*private val person: Person = Person(null)
    private val shared: Shared? = null
    private val image1: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
*/


    }
}