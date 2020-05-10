package de.markusfisch.android.motoscore.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {
	public static final String SHARED_PREFERENCES_NAME = "MotoScoreSettings";

	private static final String USE_MEDIA_BUTTON = "use_media_button";
	private static final String HAPTIC_FEEDBACK = "haptic_feedback";
	private static final String SCORE = "score";
	private static final String NUMBER_OF_RIDES = "number_of_rides";
	private static final String SECONDS_BETWEEN_UPDATES = "seconds_between_updates";
	private static final String METERS_BETWEEN_UPDATES = "meters_between_updates";
	private static final String MINIMUM_ACCURACY = "minimum_accuracy";

	private SharedPreferences preferences;

	public void init(Context context) {
		preferences = context.getSharedPreferences(
				SHARED_PREFERENCES_NAME,
				0);
	}

	public int secondsBetweenUpdates() {
		return Integer.parseInt(preferences.getString(
				SECONDS_BETWEEN_UPDATES,
				"30"));
	}

	public int metersBetweenUpdates() {
		return Integer.parseInt(preferences.getString(
				METERS_BETWEEN_UPDATES,
				"20"));
	}

	public int minimumAccuracy() {
		return Integer.parseInt(preferences.getString(
				MINIMUM_ACCURACY,
				"100"));
	}

	public int score() {
		return Integer.parseInt(preferences.getString(
				SCORE,
				"1"));
	}

	public int numberOfRides() {
		return Integer.parseInt(preferences.getString(
				NUMBER_OF_RIDES,
				"100"));
	}

	public boolean useMediaButton() {
		return preferences.getBoolean(USE_MEDIA_BUTTON, true);
	}

	public boolean hapticFeedback() {
		return preferences.getBoolean(HAPTIC_FEEDBACK, true);
	}
}
