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

public abstract class FragmentTitleBinding extends ViewDataBinding {
  @NonNull
  public final Button btnStart;

  @NonNull
  public final TextView textView;

  protected FragmentTitleBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnStart, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnStart = btnStart;
    this.textView = textView;
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTitleBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_title, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTitleBinding>inflate(inflater, kraf.george.chooseadventure.R.layout.fragment_title, null, false, component);
  }

  public static FragmentTitleBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTitleBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTitleBinding)bind(component, view, kraf.george.chooseadventure.R.layout.fragment_title);
  }
}
