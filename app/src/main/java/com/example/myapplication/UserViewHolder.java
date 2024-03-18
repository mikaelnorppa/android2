package com.example.myapplication;

import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView FirstName, LastName, Email, DegreeProgram;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        FirstName = itemView.findViewById(R.id.textFirstName);
        LastName = itemView.findViewById(R.id.textLastName);
        Email = itemView.findViewById(R.id.textEmail);
        DegreeProgram = itemView.findViewById(R.id.textDegreeProgram);
    }
}
