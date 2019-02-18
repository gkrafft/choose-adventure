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

public abstract class FragmentCatBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSodaWin;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView;

  protected FragmentCatBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnSodaWin, ImageView imageView2, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSodaWin = btnSodaWin;
    this.imageView2 = imageView2;
    this.textView = textView;
  }

  @NonNull
  public static FragmentCatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCatBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_cat, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCatBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_cat, null, false, component);
  }

  public static FragmentCatBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCatBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCatBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_cat);
  }
}
