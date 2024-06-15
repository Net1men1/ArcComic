package com.example.truyenapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapterBXH extends FragmentStateAdapter {

    public  FragmentAdapterBXH(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager,lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment result = null;
        switch (position) {
            case 1:
                result = new BXHLuotXemFragment();
                break;
        }
        if (result == null) {
            result = new BXHVoteFragment();
        }
        return result;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
