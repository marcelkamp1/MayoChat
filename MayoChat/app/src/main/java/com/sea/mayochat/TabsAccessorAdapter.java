package com.sea.mayochat;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter
{

    public TabsAccessorAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        switch (i)
        {
            case 0:
                ChatFragment chatsFragment = new ChatFragment();
                return chatsFragment;

            case 1:
                GroupFragment groupsFragment = new GroupFragment();
                return groupsFragment;

            case 2:
                ContactFragment contactsFragment = new ContactFragment();
                return contactsFragment;

            case 3:
                RequestFragment requestsFragment = new RequestFragment();
                return requestsFragment;

            default:
                return null;
        }
    }


    @Override
    public int getCount()
    {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Chats";

            case 1:
                return "Groups";

            case 2:
                return "Contacts";

            case 3:
                return "Requests";

            default:
                return null;
        }
    }
}

