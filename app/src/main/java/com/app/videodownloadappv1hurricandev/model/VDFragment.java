/*
 * Copyright (c) 2021.  Hurricane Development Studios
 */

package com.app.videodownloadappv1hurricandev.model;

import androidx.fragment.app.Fragment;

import com.app.videodownloadappv1hurricandev.VDApp;
import com.app.videodownloadappv1hurricandev.activity.MainActivity;

public class VDFragment extends Fragment {

    public MainActivity getVDActivity() {
        return (MainActivity) getActivity();
    }

    public VDApp getVDApp() {
        return (VDApp) getActivity().getApplication();
    }
}
