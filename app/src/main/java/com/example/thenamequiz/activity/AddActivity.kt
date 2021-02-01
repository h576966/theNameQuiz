package com.example.thenamequiz.activity

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thenamequiz.databinding.ActivityAddBinding

import android.widget.ImageView;


import android.provider.MediaStore;
import android.view.View;

import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import com.example.thenamequiz.model.Person
import com.example.thenamequiz.model.PersonList


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
        val PersonList = PersonList(this)
        personList =  PersonList.getPersonList()  // Get the full list from data structure

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
                    PersonList.addPerson(name!!, image!!)
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
                val selectedImage = data?.getData()
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



