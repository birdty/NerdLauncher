package nerdlauncher.android.bignerdranch.com.nerdlauncher;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class SingleFragmentActivity extends AppCompatActivity {

    protected int getLayoutResId()
    {
        return R.layout.activity_fragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = this.getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(getLayoutResId());

        if ( fragment == null )
        {
            fragment = createFragment();

            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }

    protected Fragment createFragment()
    {
        return null;
    }
}
