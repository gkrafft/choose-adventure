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

public abstract class FragmentKitchenLoseBinding extends ViewDataBinding {
  @NonNull
  public final Button btnKitchenLose;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final TextView textView;

  protected FragmentKitchenLoseBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnKitchenLose, ImageView imageView5, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKitchenLose = btnKitchenLose;
    this.imageView5 = imageView5;
    this.textView = textView;
  }

  @NonNull
  public static FragmentKitchenLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentKitchenLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentKitchenLoseBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_kitchen_lose, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentKitchenLoseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentKitchenLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentKitchenLoseBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_kitchen_lose, null, false, component);
  }

  public static FragmentKitchenLoseBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentKitchenLoseBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentKitchenLoseBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_kitchen_lose);
  }
}
