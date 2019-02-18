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

public abstract class FragmentSodaBinding extends ViewDataBinding {
  @NonNull
  public final Button catButton;

  @NonNull
  public final Button phoneButton;

  @NonNull
  public final ImageView sodaStartImg;

  @NonNull
  public final TextView textView;

  protected FragmentSodaBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button catButton, Button phoneButton, ImageView sodaStartImg,
      TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catButton = catButton;
    this.phoneButton = phoneButton;
    this.sodaStartImg = sodaStartImg;
    this.textView = textView;
  }

  @NonNull
  public static FragmentSodaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSodaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSodaBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_soda, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSodaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSodaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSodaBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_soda, null, false, component);
  }

  public static FragmentSodaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSodaBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSodaBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_soda);
  }
}
