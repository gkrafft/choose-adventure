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

public abstract class FragmentSodaLoseBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSodaLost;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  protected FragmentSodaLoseBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnSodaLost, ImageView imageView, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSodaLost = btnSodaLost;
    this.imageView = imageView;
    this.textView = textView;
  }

  @NonNull
  public static FragmentSodaLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSodaLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSodaLoseBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_soda_lose, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSodaLoseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSodaLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSodaLoseBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_soda_lose, null, false, component);
  }

  public static FragmentSodaLoseBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSodaLoseBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSodaLoseBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_soda_lose);
  }
}
