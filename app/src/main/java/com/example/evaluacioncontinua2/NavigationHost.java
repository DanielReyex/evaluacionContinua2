package com.example.evaluacioncontinua2;

import androidx.fragment.app.Fragment;

public interface NavigationHost {

    void navigateTo(Fragment fragment,boolean addToBackstack);
}
