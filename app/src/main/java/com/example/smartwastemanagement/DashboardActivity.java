package com.example.smartwastemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button viewWasteManagementButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize buttons
        viewWasteManagementButton = findViewById(R.id.viewWasteManagementButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Set up button listeners
        viewWasteManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to waste management features (you can add another activity for it)
                Intent intent = new Intent(DashboardActivity.this, WasteManagementActivity.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Log out (could navigate back to login screen)
                Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Close DashboardActivity
            }
        });
    }
}
