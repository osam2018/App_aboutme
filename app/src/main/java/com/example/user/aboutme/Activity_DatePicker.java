package com.example.user.aboutme;

import java.util.Calendar;
import java.util.GregorianCalendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class Activity_DatePicker extends Activity {

    int mYear, mMonth, mDay;
    TextView mTxtDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_writing);

        mTxtDate = (TextView)findViewById(R.id.txtdate);

        //현재 날짜와 시간을 가져오기위한 Calendar 인스턴스 선언
        Calendar cal = new GregorianCalendar();
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);
        UpdateNow();
    }



    //텍스트뷰의 값을 업데이트 하는 메소드
    void UpdateNow(){
        mTxtDate.setText(String.format("%d/%d/%d", mYear, mMonth + 1, mDay));
    }
}
