package mystery.anonymous.lungcancerdetection;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvResult = findViewById(R.id.tvResult);
        String result = getIntent().getStringExtra("result");

        if (result == null || result.isEmpty()) {
            tvResult.setText(" Backend didn't send any thing ");
            tvResult.setTextColor(Color.DKGRAY);
        } else {
            switch (result) {
                case "Lung Oat_cell_carcinomas":
                case "Lung squamous_cell_carcinoma":
                    tvResult.setTextColor(Color.RED);
                    tvResult.setText(result + "\n\nمحتاج تروح لدكتور فوراً");
                    break;
                case "Lung_benign_tissue":
                    tvResult.setTextColor(Color.GREEN);
                    tvResult.setText(result + "\n\nربنا يحميك ويكرمك");
                    break;
                default:
                    tvResult.setTextColor(Color.BLACK);
                    tvResult.setText(result);
            }
        }
    }
}
