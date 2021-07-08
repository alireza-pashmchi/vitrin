package com.alireza.store;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ForgotPasswordFragment extends Fragment {
    Button resetButton ;
    EditText reset_email_edit_text;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_forgot_password , container , false);
        resetButton = view.findViewById(R.id.reset_password_button);
        reset_email_edit_text = view.findViewById(R.id.reset_email_edit_text);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO send email
                Toast.makeText(getActivity() , "email sent" , Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
