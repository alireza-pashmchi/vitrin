package com.alireza.store;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

public class RigesterFragment extends Fragment {
    EditText username , email , password;
    AppCompatButton rigesterbutton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate( R.layout.fragment_rigester, container , false);
       username = view.findViewById(R.id.rigester_username_edit_text);
       email = view.findViewById(R.id.rigester_email_edit_text);
       password = view.findViewById(R.id.rigester_password_edit_text);
       rigesterbutton = view.findViewById(R.id.rigester_button);
        return view;
    }
}
