package com.utsanonymous.profbotrobotclient.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.utsanonymous.profbotrobotclient.view.PercentFrameLayout;
import org.webrtc.SurfaceViewRenderer;

public abstract class ActivityCallBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton buttonCallSwitchCamera;

  @NonNull
  public final ImageButton buttonCallToggleMic;

  @NonNull
  public final LinearLayout buttonsCallContainer;

  @NonNull
  public final FrameLayout callFragmentContainer;

  @NonNull
  public final TextView contactNameCall;

  @NonNull
  public final PercentFrameLayout localVideoLayout;

  @NonNull
  public final SurfaceViewRenderer localVideoView;

  @NonNull
  public final PercentFrameLayout remoteVideoLayout;

  @NonNull
  public final SurfaceViewRenderer remoteVideoView;

  protected ActivityCallBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageButton buttonCallSwitchCamera, ImageButton buttonCallToggleMic,
      LinearLayout buttonsCallContainer, FrameLayout callFragmentContainer,
      TextView contactNameCall, PercentFrameLayout localVideoLayout,
      SurfaceViewRenderer localVideoView, PercentFrameLayout remoteVideoLayout,
      SurfaceViewRenderer remoteVideoView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonCallSwitchCamera = buttonCallSwitchCamera;
    this.buttonCallToggleMic = buttonCallToggleMic;
    this.buttonsCallContainer = buttonsCallContainer;
    this.callFragmentContainer = callFragmentContainer;
    this.contactNameCall = contactNameCall;
    this.localVideoLayout = localVideoLayout;
    this.localVideoView = localVideoView;
    this.remoteVideoLayout = remoteVideoLayout;
    this.remoteVideoView = remoteVideoView;
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCallBinding>inflate(inflater, com.utsanonymous.profbotrobotclient.R.layout.activity_call, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCallBinding>inflate(inflater, com.utsanonymous.profbotrobotclient.R.layout.activity_call, null, false, component);
  }

  public static ActivityCallBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCallBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCallBinding)bind(component, view, com.utsanonymous.profbotrobotclient.R.layout.activity_call);
  }
}
