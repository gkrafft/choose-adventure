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
import android.widget.TextView;

public abstract class FragmentGameStartBinding extends ViewDataBinding {
  @NonNull
  public final Button btnKitchenStart;

  @NonNull
  public final Button btnSodaStart;

  @NonNull
  public final TextView textView;

  protected FragmentGameStartBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnKitchenStart, Button btnSodaStart, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKitchenStart = btnKitchenStart;
    this.btnSodaStart = btnSodaStart;
    this.textView = textView;
  }

  @NonNull
  public static FragmentGameStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentGameStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentGameStartBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_game_start, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGameStartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentGameStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentGameStartBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_game_start, null, false, component);
  }

  public static FragmentGameStartBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentGameStartBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentGameStartBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_game_start);
  }
}
