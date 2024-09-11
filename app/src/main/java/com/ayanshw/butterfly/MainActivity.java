package com.ayanshw.butterfly;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        int flags = decorView.getSystemUiVisibility();

        // To display dark text/icons on a light status bar (for transparency)
        flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

        // Apply changes
        decorView.setSystemUiVisibility(flags);

        // Make the status bar transparent
        getWindow().setStatusBarColor(Color.TRANSPARENT);
    }
}