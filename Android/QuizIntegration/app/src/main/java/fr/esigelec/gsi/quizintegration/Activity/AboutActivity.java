package fr.esigelec.gsi.quizintegration.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.esigelec.gsi.quizintegration.R;

public class AboutActivity extends Activity
{

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_about);
	}
}