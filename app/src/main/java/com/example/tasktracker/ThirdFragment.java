package com.example.tasktracker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class ThirdFragment extends Fragment {
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView feedback = view.findViewById(R.id.feedback);
        TextView feedbackNotifications = view.findViewById(R.id.notifications);
        String nameSafe = (String) MainActivity.myData.get("name");
        String emailSafe = (String) MainActivity.myData.get("email");

        feedback.setText(feedback.getText() + " " + nameSafe);
        feedbackNotifications.setText(feedbackNotifications.getText() + " " + emailSafe);
    }
}
