# CalendarLibrary
Display Calendar Info in Android

## Usage
To be able to use this library your activity must implement `EventItemClickListener` and `OnSyncStateChangedListener` interfaces. Then overridind the callbacks.

Here's an example:
```java
public class MainActivity extends Activity implements EventItemClickListener,
		OnSyncStateChangedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ExtendedCalendarView calendarView = new ExtendedCalendarView(this, this);
		CalendarSyncStateView syncStateView = new CalendarSyncStateView(this,
				this);

		setContentView(calendarView);

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
```

And thats it!
