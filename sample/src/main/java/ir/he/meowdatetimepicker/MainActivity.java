package ir.he.meowdatetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;
import java.util.TimeZone;

import ir.he.meowdatetimepicker.date.DatePickerDialog;
import ir.he.meowdatetimepicker.time.RadialPickerLayout;
import ir.he.meowdatetimepicker.time.TimePickerDialog;
import ir.he.meowdatetimepicker.utils.PersianCalendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    private Button bt_date;
    private Button bt_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_date = findViewById(R.id.Button_main_date);
        bt_time = findViewById(R.id.Button_main_time);

        bt_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PersianCalendar calendar = new PersianCalendar(Calendar.getInstance().getTimeInMillis());
                DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                        MainActivity.this,
                        calendar.getPersianYear(),
                        calendar.getPersianMonth(),
                        calendar.getPersianDay()
                );
                datePickerDialog.setThemeDark(true);
                datePickerDialog.show(getFragmentManager(), "date");
            }
        });

        bt_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PersianCalendar calendar = new PersianCalendar(Calendar.getInstance().getTimeInMillis());
                DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                        MainActivity.this,
                        calendar.getPersianYear(),
                        calendar.getPersianMonth(),
                        calendar.getPersianDay()
                );
//                datePickerDialog.setThemeDark(true);
                datePickerDialog.show(getFragmentManager(), "date");
//                PersianCalendar calendar = new PersianCalendar(Calendar.getInstance().getTimeInMillis());
//                calendar.setTimeZone(TimeZone.getDefault());
//                TimePickerDialog timePickerDialog = TimePickerDialog.newInstance(
//                        MainActivity.this,
//                        calendar.get(PersianCalendar.HOUR_OF_DAY),
//                        calendar.get(PersianCalendar.MINUTE),
//                        false
//                );
////                timePickerDialog.setThemeDark(true);
//                timePickerDialog.show(getFragmentManager(), "timePickerDialog");
            }
        });
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

    }

    @Override
    public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {

    }
}
