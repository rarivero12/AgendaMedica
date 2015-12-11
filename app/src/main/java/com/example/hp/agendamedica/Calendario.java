package com.example.hp.agendamedica;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;

import java.util.Calendar;

public class Calendario extends Activity  {
    CalendarView calendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        calendario= (CalendarView)  findViewById(R.id.calendario);
    //    calendario.setOnDateChangeListener(new CalendarView.onDateChangeListener(){
      //      public void onSelectedDayChange(CalendarView vista, int ano, int mes, int diames){
                // Toast.makeText(); aqui se hace lo que quieras cuando seleccione un dia
        //    }
        //});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calendario, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
