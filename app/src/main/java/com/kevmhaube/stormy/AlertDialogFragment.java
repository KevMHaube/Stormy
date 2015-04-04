package com.kevmhaube.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by kevinhaube on 4/2/15.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();

        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.title_oops))
                .setMessage(context.getString(R.string.message_error))
                .setPositiveButton(android.R.string.ok, null);

        AlertDialog dialog = builder.create();

        return dialog;
    }
}
