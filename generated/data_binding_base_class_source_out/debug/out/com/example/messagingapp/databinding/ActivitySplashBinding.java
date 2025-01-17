// Generated by view binder compiler. Do not edit!
package com.example.messagingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.messagingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnGetStarted;

  @NonNull
  public final TextView tvSubtitle;

  @NonNull
  public final TextView tvSubtitle1;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvTitle1;

  private ActivitySplashBinding(@NonNull LinearLayout rootView, @NonNull Button btnGetStarted,
      @NonNull TextView tvSubtitle, @NonNull TextView tvSubtitle1, @NonNull TextView tvTitle,
      @NonNull TextView tvTitle1) {
    this.rootView = rootView;
    this.btnGetStarted = btnGetStarted;
    this.tvSubtitle = tvSubtitle;
    this.tvSubtitle1 = tvSubtitle1;
    this.tvTitle = tvTitle;
    this.tvTitle1 = tvTitle1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnGetStarted;
      Button btnGetStarted = ViewBindings.findChildViewById(rootView, id);
      if (btnGetStarted == null) {
        break missingId;
      }

      id = R.id.tvSubtitle;
      TextView tvSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (tvSubtitle == null) {
        break missingId;
      }

      id = R.id.tvSubtitle1;
      TextView tvSubtitle1 = ViewBindings.findChildViewById(rootView, id);
      if (tvSubtitle1 == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tvTitle1;
      TextView tvTitle1 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle1 == null) {
        break missingId;
      }

      return new ActivitySplashBinding((LinearLayout) rootView, btnGetStarted, tvSubtitle,
          tvSubtitle1, tvTitle, tvTitle1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
