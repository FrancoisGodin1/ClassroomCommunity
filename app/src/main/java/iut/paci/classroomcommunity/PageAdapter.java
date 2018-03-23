package iut.paci.classroomcommunity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by godin on 23/03/2018.
 */

public class PageAdapter extends FragmentPagerAdapter{

    private int[] colors;

    public PageAdapter(FragmentManager fm, int[] colors) {
        super(fm);
        this.colors = colors;
    }

    @Override
    public Fragment getItem(int position) {
        return(FirstFragment.newInstance(position, this.colors[position]));
    }

    @Override
    public int getCount() { return(5); }
}
