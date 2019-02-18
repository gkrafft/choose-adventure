package kraf.george.chooseadventure.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class FragmentNoWashBinding extends ViewDataBinding {
  @NonNull
  public final Button btnKitchenLose;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final TextView textView;

  protected FragmentNoWashBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnKitchenLose, ImageView imageView7, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKitchenLose = btnKitchenLose;
    this.imageView7 = imageView7;
    this.textView = textView;
  }

  @NonNull
  public static FragmentNoWashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentNoWashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentNoWashBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_no_wash, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNoWashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentNoWashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentNoWashBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_no_wash, null, false, component);
  }

  public static FragmentNoWashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentNoWashBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentNoWashBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_no_wash);
  }
}
