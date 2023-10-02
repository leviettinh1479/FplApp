package nta.com.music.myfpl.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

import nta.com.music.myfpl.fragments.HomeFragment;

public class AdapterHome extends FragmentStateAdapter{
    private List<Fragment> fragmentList;
    public AdapterHome(@NonNull FragmentActivity fragmentActivity, List<Fragment> fragmentList) {
        super(fragmentActivity);
        this.fragmentList = fragmentList;
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position) {
            case 0: {
                fragment = fragmentList.get(0);
                break;
            }
            case 1: {
                fragment = fragmentList.get(1);
                break;
            }
            case 2: {
                fragment = fragmentList.get(2);
                break;
            }
            case 3: {
                fragment = fragmentList.get(3);
                break;
            }
            default: fragment = HomeFragment.newInstance();
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
