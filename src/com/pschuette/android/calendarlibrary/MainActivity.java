package com.pschuette.android.calendarlibrary;

import com.pschuette.android.calendarlibrary.CalendarSyncStateAdapter.OnSyncStateChangedListener;
import com.pschuette.android.calendarlibrary.DayAdapter.EventItemClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends Activity implements EventItemClickListener,
		OnSyncStateChangedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ExtendedCalendarView calendarView = new ExtendedCalendarView(this, this);
		CalendarSyncStateView syncStateView = new CalendarSyncStateView(this,
				this);

		setContentView(syncStateView);

	}

	@Override
	public void OnEventItemClicked(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSyncStateChanged(CalendarData data, Switch switchView) {
		// TODO Auto-generated method stub

	}

}
