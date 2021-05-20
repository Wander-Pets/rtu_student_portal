package com.example.rtu_student_portal.ui.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rtu_student_portal.R;

public class dashboard_home extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Student Master \n File Maintenance",
            "Student Ledger \n Of Accounts",
            "Enrollment / \n Registration",
            "Deposit Slip \n Upload",
            "Student \n Accountabilities",
            "Individual Evaluation \n Report",
            "Faculty Performance \n Evaluation",
            "Request for Subject \n Grade Completion",
            "Online Clearance \n Request",
            "Display Own \n Grades",
            "Apply for \n Graduation",
            "Change Own \n Password"};

    String mDescription[] = {"", "", "", "", "", "", "", "", "", "", "", ""};
    int images[] = {R.drawable.smf,
            R.drawable.sla,
            R.drawable.e_r,
            R.drawable.dsu,
            R.drawable.sa,
            R.drawable.ier,
            R.drawable.fpe,
            R.drawable.rfsgc,
            R.drawable.ocr,
            R.drawable.dog,
            R.drawable.afg,
            R.drawable.cop,};
    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(dashboard_home.this, "Student Master File", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(dashboard_home.this,
                            com.example.rtu_student_portal.ui.login.student_master_file1.class);
                    startActivity(intent);
                }
                if (position ==  1) {
                    Toast.makeText(dashboard_home.this, "Student Ledger Of Accounts", Toast.LENGTH_SHORT).show();
                }
                if (position ==  2) {
                    Toast.makeText(dashboard_home.this, "Enrollment / Registration", Toast.LENGTH_SHORT).show();
                }
                if (position ==  3) {
                    Toast.makeText(dashboard_home.this, "Deposit Slip Upload", Toast.LENGTH_SHORT).show();
                }
                if (position ==  4) {
                    Toast.makeText(dashboard_home.this, "Student Accountabilities", Toast.LENGTH_SHORT).show();
                }
                if (position ==  5) {
                    Toast.makeText(dashboard_home.this, "Individual Evaluation Report", Toast.LENGTH_SHORT).show();
                }
                if (position ==  6) {
                    Toast.makeText(dashboard_home.this, "Faculty Performance Evaluation", Toast.LENGTH_SHORT).show();
                }
                if (position ==  7) {
                    Toast.makeText(dashboard_home.this, "Request for Subject Grade Completion", Toast.LENGTH_SHORT).show();
                }
                if (position ==  8) {
                    Toast.makeText(dashboard_home.this, "Online Clearance Request", Toast.LENGTH_SHORT).show();
                }
                if (position ==  9) {
                    Toast.makeText(dashboard_home.this, "Display Own Grades", Toast.LENGTH_SHORT).show();
                }
                if (position ==  10) {
                    Toast.makeText(dashboard_home.this, "Apply for Graduation", Toast.LENGTH_SHORT).show();
                }
                if (position ==  11) {
                    Toast.makeText(dashboard_home.this, "Change Own Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.etSIN, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.etSIN);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);




            return row;
        }
    }
}