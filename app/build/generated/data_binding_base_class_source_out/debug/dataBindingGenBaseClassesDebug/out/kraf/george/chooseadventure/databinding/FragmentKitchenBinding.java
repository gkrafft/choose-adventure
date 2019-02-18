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

public abstract class FragmentKitchenBinding extends ViewDataBinding {
  @NonNull
  public final Button btnNoWash;

  @NonNull
  public final Button btnWash;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView textView;

  protected FragmentKitchenBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnNoWash, Button btnWash, ImageView imageView4,
      TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNoWash = btnNoWash;
    this.btnWash = btnWash;
    this.imageView4 = imageView4;
    this.textView = textView;
  }

  @NonNull
  public static FragmentKitchenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentKitchenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentKitchenBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_kitchen, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentKitchenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentKitchenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentKitchenBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_kitchen, null, false, component);
  }

  public static FragmentKitchenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentKitchenBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentKitchenBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_kitchen);
  }
}
