package com.hamaar.meetapresto.Activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hamaar.meetapresto.R;

import java.io.File;

public class InsertMenuActivity extends AppCompatActivity {

    //OPEN CAMERA
    private RadioGroup radioGroup;
    private Uri photoUri = null;
    private Uri finalPhotoUri = null;
    private File compressedImage = null;
    private File tempFile = null;
    private String photoExt = "";
    private String encodePhoto = "";
    private String fotoTimeStamp;

    private Button btnInputPrder;
    private ImageView ivCamera;
    private ImageView ivFile;
    private TextView tvPlaceholder;
    private ImageView ivDeleteImage;
    private ImageView ivImage;
    private FrameLayout framePhoto;
    private EditText txtPrice;
    private EditText txtDesc;
    private EditText txtName;
    private Spinner spinCategory;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_menu);


    }
}
