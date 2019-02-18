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

public abstract class FragmentKitchenWinBinding extends ViewDataBinding {
  @NonNull
  public final Button btnKitchenWon;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final TextView textView;

  protected FragmentKitchenWinBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnKitchenWon, ImageView imageView6, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKitchenWon = btnKitchenWon;
    this.imageView6 = imageView6;
    this.textView = textView;
  }

  @NonNull
  public static FragmentKitchenWinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentKitchenWinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentKitchenWinBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_kitchen_win, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentKitchenWinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentKitchenWinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentKitchenWinBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_kitchen_win, null, false, component);
  }

  public static FragmentKitchenWinBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentKitchenWinBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentKitchenWinBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_kitchen_win);
  }
}
