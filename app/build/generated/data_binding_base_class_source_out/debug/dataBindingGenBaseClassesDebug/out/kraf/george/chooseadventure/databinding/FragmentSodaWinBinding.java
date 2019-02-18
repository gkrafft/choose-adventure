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

public abstract class FragmentSodaWinBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSodaWon;

  @NonNull
  public final ImageView sodaWinPic;

  @NonNull
  public final TextView textView;

  protected FragmentSodaWinBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnSodaWon, ImageView sodaWinPic, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSodaWon = btnSodaWon;
    this.sodaWinPic = sodaWinPic;
    this.textView = textView;
  }

  @NonNull
  public static FragmentSodaWinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSodaWinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSodaWinBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_soda_win, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSodaWinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSodaWinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSodaWinBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_soda_win, null, false, component);
  }

  public static FragmentSodaWinBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSodaWinBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSodaWinBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_soda_win);
  }
}
