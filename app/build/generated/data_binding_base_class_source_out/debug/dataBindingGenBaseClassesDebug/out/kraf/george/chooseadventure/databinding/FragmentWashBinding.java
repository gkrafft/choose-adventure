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

public abstract class FragmentWashBinding extends ViewDataBinding {
  @NonNull
  public final Button btnKitchenWin;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final TextView textView;

  protected FragmentWashBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnKitchenWin, ImageView imageView8, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKitchenWin = btnKitchenWin;
    this.imageView8 = imageView8;
    this.textView = textView;
  }

  @NonNull
  public static FragmentWashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWashBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_wash, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWashBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_wash, null, false, component);
  }

  public static FragmentWashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentWashBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentWashBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_wash);
  }
}
