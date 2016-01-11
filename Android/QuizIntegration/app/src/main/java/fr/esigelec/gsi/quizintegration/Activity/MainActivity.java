package fr.esigelec.gsi.quizintegration.Activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import fr.esigelec.gsi.quizintegration.R;
import fr.esigelec.gsi.quizintegration.adapter.CustomActionBarDrawerToggle;
import fr.esigelec.gsi.quizintegration.adapter.ExpandableListAdapter;

import java.security.MessageDigest;


public class MainActivity extends Activity implements View.OnClickListener, Toolbar.OnMenuItemClickListener
{
	public static boolean DEBUG = true;
	public static boolean DEV = true;
	private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle mDrawerToggle;
	List<String> groupList;
	private final int REQUEST_CODE_INSCRIPTION = 42;
	Map<String, List<String>> ItemCollection;
	private Dialog dialog;
	private Toolbar toolbar;

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_main);

		toolbar = (Toolbar) findViewById (R.id.tool_bar);
		toolbar.setTitle (R.string.app_name);
		toolbar.setOnMenuItemClickListener (this);
		create_expandable_list ();
		dialog = createAndManageDialog();
	}

	public void create_drawer ()
	{
		mDrawerLayout = (DrawerLayout) findViewById (R.id.drawer_layout);
		mDrawerToggle = new CustomActionBarDrawerToggle (this, mDrawerLayout,toolbar);
	}

	public void create_expandable_list ()
	{
		final ExpandableListView mDrawerExpandableList;
		ExpandableListAdapter expListAdapter;
		createGroupList ();
		createCollection ();
		mDrawerLayout = (DrawerLayout) findViewById (R.id.drawer_layout);
		mDrawerExpandableList = (ExpandableListView) findViewById (R.id.drawer_list);
		expListAdapter = new ExpandableListAdapter (this, groupList, ItemCollection);
		mDrawerExpandableList.setGroupIndicator (null);
		mDrawerExpandableList.setAdapter (expListAdapter);
		create_drawer ();
		mDrawerLayout.setDrawerListener (mDrawerToggle);
		mDrawerExpandableList.setOnGroupClickListener (new ExpandableListView.OnGroupClickListener ()
		{
			@Override
			public boolean onGroupClick (ExpandableListView parent, View v, int groupPosition, long id)
			{
				Intent t;
				switch (groupPosition)
				{
					case 0:
						mDrawerLayout.closeDrawer (mDrawerExpandableList);
						dialog.show ();
						Toast.makeText (getApplicationContext (), R.string.connexion, Toast.LENGTH_LONG).show ();
						break;
					case 1:
						t = new Intent(getApplicationContext (),InscriptionActivity.class);
						startActivityForResult (t,REQUEST_CODE_INSCRIPTION);
						Toast.makeText (getApplicationContext (), R.string.inscription, Toast.LENGTH_LONG).show ();
						break;

					case 2:
						t = new Intent(getApplicationContext (),AboutActivity.class);
						Toast.makeText (getApplicationContext (), R.string.about, Toast.LENGTH_LONG).show ();
						startActivity (t);
						break;
					case 3:
						t = new Intent (getApplicationContext (),LegalNoticeActivity.class);
						Toast.makeText (getApplicationContext (), R.string.mentionlegales, Toast.LENGTH_LONG).show ();
						startActivity (t);
						break;
					case 4:
						Toast.makeText (getApplicationContext (), R.string.bye, Toast.LENGTH_LONG).show ();
						finish ();
						break;
				}

				return true;
			}
		});
	}

	private void createCollection ()
	{
		ItemCollection = new LinkedHashMap<> ();
	}

	private void createGroupList ()
	{
		String listItem[] = getResources ().getStringArray (R.array.listMenu);
		groupList = new ArrayList<> ();

		for (int i = 0; i != listItem.length; i++)
		{
			Log.e ("DEBUG",listItem[i]);
			groupList.add (listItem[i]);
		}
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data){
		if(resultCode != RESULT_CANCELED){
			switch (requestCode){
				case REQUEST_CODE_INSCRIPTION :

					break;
			}
		}
	}


	/**
	 * When using the ActionBarDrawerToggle, you must call it during
	 * onPostCreate() and onConfigurationChanged()...
	 */

	protected void onPostCreate (Bundle savedInstanceState)
	{
		super.onPostCreate (savedInstanceState);
		mDrawerToggle.syncState ();
	}

	public void onConfigurationChanged (Configuration newConfig)
	{
		super.onConfigurationChanged (newConfig);
		mDrawerToggle.onConfigurationChanged (newConfig);
	}

	@Override
	public void onClick (View v)
	{

	}

	@Override
	public boolean onMenuItemClick (MenuItem item)
	{
		return false;
	}




	private Dialog createAndManageDialog(){
		final Dialog dialog = new Dialog (MainActivity.this);
		dialog.setContentView (R.layout.login_dialog);
		dialog.setTitle (getString (R.string.action_sign_in));
		Button subscribeButton = (Button) dialog.findViewById (R.id.Register);
		subscribeButton.setOnClickListener (new View.OnClickListener ()
		{
			@Override
			public void onClick (View v)
			{
				Intent t = new Intent (getApplicationContext (), InscriptionActivity.class);
				startActivityForResult (t,REQUEST_CODE_INSCRIPTION);
			}
		});
		Button signIn = (Button) dialog.findViewById (R.id.SignIn);
		signIn.setOnClickListener (new View.OnClickListener ()
		{
			@Override
			public void onClick (View v)
			{
				boolean isEmailValid = true;
				boolean isMdpValid = true;
				EditText emailOrPseudo = (EditText)dialog.findViewById (R.id.login);
				String loginValue = emailOrPseudo.getText ().toString ();
				if("".equals (loginValue)){
					emailOrPseudo.setError (getString (R.string.error_invalid_email));
					isEmailValid = false;
				}

				EditText password = (EditText) dialog.findViewById (R.id.password);
				String passwordValue = password.getText ().toString ();

				if("".equals (passwordValue)){
					password.setError (getString (R.string.error_invalid_password));
					isMdpValid = false;
				}
				MessageDigest digest;
				String test = "";
				try{
					 digest = MessageDigest.getInstance ("MD5");
					 byte[] arrayreturn = digest.digest (passwordValue.getBytes ());
					 test = String.format("%032X",new BigInteger (1,arrayreturn));
				}catch(Exception e){
					Log.e("Error ", e.getMessage ());
				}


				if(DEV){
					isMdpValid = true;
					isEmailValid = true;
					Toast.makeText (getApplicationContext (), getString (R.string.connexion) + " MD5 MDP : " + test ,Toast.LENGTH_LONG).show ();
				}

				if(isEmailValid && isMdpValid){
					Intent t = new Intent (getApplicationContext (), MenuActivity.class);
					startActivity (t);
				}
			}
		});


		return dialog;
	}
}
