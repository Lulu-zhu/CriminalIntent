package com.opensource.lulu.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Lulu_ on 2016/11/15.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
