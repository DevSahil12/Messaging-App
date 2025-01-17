// Generated by view binder compiler. Do not edit!
package com.example.messagingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.messagingapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReciverLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView pro;

  @NonNull
  public final TextView recivertextset;

  private ReciverLayoutBinding(@NonNull RelativeLayout rootView, @NonNull CircleImageView pro,
      @NonNull TextView recivertextset) {
    this.rootView = rootView;
    this.pro = pro;
    this.recivertextset = recivertextset;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReciverLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReciverLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reciver_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReciverLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pro;
      CircleImageView pro = ViewBindings.findChildViewById(rootView, id);
      if (pro == null) {
        break missingId;
      }

      id = R.id.recivertextset;
      TextView recivertextset = ViewBindings.findChildViewById(rootView, id);
      if (recivertextset == null) {
        break missingId;
      }

      return new ReciverLayoutBinding((RelativeLayout) rootView, pro, recivertextset);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
