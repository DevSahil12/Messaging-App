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
import com.google.android.material.textfield.TextInputEditText;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView loginbut;

  @NonNull
  public final CircleImageView profilerg0;

  @NonNull
  public final TextInputEditText rgemail;

  @NonNull
  public final TextInputEditText rgpassword;

  @NonNull
  public final TextInputEditText rgrepassword;

  @NonNull
  public final TextInputEditText rgusername;

  @NonNull
  public final Button signupbutton;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  private ActivitySignUpBinding(@NonNull LinearLayout rootView, @NonNull TextView loginbut,
      @NonNull CircleImageView profilerg0, @NonNull TextInputEditText rgemail,
      @NonNull TextInputEditText rgpassword, @NonNull TextInputEditText rgrepassword,
      @NonNull TextInputEditText rgusername, @NonNull Button signupbutton,
      @NonNull TextView textView4, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.loginbut = loginbut;
    this.profilerg0 = profilerg0;
    this.rgemail = rgemail;
    this.rgpassword = rgpassword;
    this.rgrepassword = rgrepassword;
    this.rgusername = rgusername;
    this.signupbutton = signupbutton;
    this.textView4 = textView4;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loginbut;
      TextView loginbut = ViewBindings.findChildViewById(rootView, id);
      if (loginbut == null) {
        break missingId;
      }

      id = R.id.profilerg0;
      CircleImageView profilerg0 = ViewBindings.findChildViewById(rootView, id);
      if (profilerg0 == null) {
        break missingId;
      }

      id = R.id.rgemail;
      TextInputEditText rgemail = ViewBindings.findChildViewById(rootView, id);
      if (rgemail == null) {
        break missingId;
      }

      id = R.id.rgpassword;
      TextInputEditText rgpassword = ViewBindings.findChildViewById(rootView, id);
      if (rgpassword == null) {
        break missingId;
      }

      id = R.id.rgrepassword;
      TextInputEditText rgrepassword = ViewBindings.findChildViewById(rootView, id);
      if (rgrepassword == null) {
        break missingId;
      }

      id = R.id.rgusername;
      TextInputEditText rgusername = ViewBindings.findChildViewById(rootView, id);
      if (rgusername == null) {
        break missingId;
      }

      id = R.id.signupbutton;
      Button signupbutton = ViewBindings.findChildViewById(rootView, id);
      if (signupbutton == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((LinearLayout) rootView, loginbut, profilerg0, rgemail,
          rgpassword, rgrepassword, rgusername, signupbutton, textView4, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
