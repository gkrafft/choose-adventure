package kraf.george.chooseadventure;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kraf.george.chooseadventure.databinding.ActivityMainBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentCatBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentGameStartBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentKitchenBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentKitchenLoseBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentKitchenWinBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentNoWashBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentPhoneBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentSodaBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentSodaLoseBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentSodaWinBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentTitleBindingImpl;
import kraf.george.chooseadventure.databinding.FragmentWashBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCAT = 2;

  private static final int LAYOUT_FRAGMENTGAMESTART = 3;

  private static final int LAYOUT_FRAGMENTKITCHEN = 4;

  private static final int LAYOUT_FRAGMENTKITCHENLOSE = 5;

  private static final int LAYOUT_FRAGMENTKITCHENWIN = 6;

  private static final int LAYOUT_FRAGMENTNOWASH = 7;

  private static final int LAYOUT_FRAGMENTPHONE = 8;

  private static final int LAYOUT_FRAGMENTSODA = 9;

  private static final int LAYOUT_FRAGMENTSODALOSE = 10;

  private static final int LAYOUT_FRAGMENTSODAWIN = 11;

  private static final int LAYOUT_FRAGMENTTITLE = 12;

  private static final int LAYOUT_FRAGMENTWASH = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_cat, LAYOUT_FRAGMENTCAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_game_start, LAYOUT_FRAGMENTGAMESTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_kitchen, LAYOUT_FRAGMENTKITCHEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_kitchen_lose, LAYOUT_FRAGMENTKITCHENLOSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_kitchen_win, LAYOUT_FRAGMENTKITCHENWIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_no_wash, LAYOUT_FRAGMENTNOWASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_phone, LAYOUT_FRAGMENTPHONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_soda, LAYOUT_FRAGMENTSODA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_soda_lose, LAYOUT_FRAGMENTSODALOSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_soda_win, LAYOUT_FRAGMENTSODAWIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_title, LAYOUT_FRAGMENTTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kraf.george.chooseadventure.R.layout.fragment_wash, LAYOUT_FRAGMENTWASH);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCAT: {
          if ("layout/fragment_cat_0".equals(tag)) {
            return new FragmentCatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGAMESTART: {
          if ("layout/fragment_game_start_0".equals(tag)) {
            return new FragmentGameStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_game_start is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKITCHEN: {
          if ("layout/fragment_kitchen_0".equals(tag)) {
            return new FragmentKitchenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kitchen is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKITCHENLOSE: {
          if ("layout/fragment_kitchen_lose_0".equals(tag)) {
            return new FragmentKitchenLoseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kitchen_lose is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKITCHENWIN: {
          if ("layout/fragment_kitchen_win_0".equals(tag)) {
            return new FragmentKitchenWinBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kitchen_win is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOWASH: {
          if ("layout/fragment_no_wash_0".equals(tag)) {
            return new FragmentNoWashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_no_wash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPHONE: {
          if ("layout/fragment_phone_0".equals(tag)) {
            return new FragmentPhoneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_phone is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSODA: {
          if ("layout/fragment_soda_0".equals(tag)) {
            return new FragmentSodaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_soda is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSODALOSE: {
          if ("layout/fragment_soda_lose_0".equals(tag)) {
            return new FragmentSodaLoseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_soda_lose is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSODAWIN: {
          if ("layout/fragment_soda_win_0".equals(tag)) {
            return new FragmentSodaWinBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_soda_win is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTITLE: {
          if ("layout/fragment_title_0".equals(tag)) {
            return new FragmentTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_title is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWASH: {
          if ("layout/fragment_wash_0".equals(tag)) {
            return new FragmentWashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_wash is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/activity_main_0", kraf.george.chooseadventure.R.layout.activity_main);
      sKeys.put("layout/fragment_cat_0", kraf.george.chooseadventure.R.layout.fragment_cat);
      sKeys.put("layout/fragment_game_start_0", kraf.george.chooseadventure.R.layout.fragment_game_start);
      sKeys.put("layout/fragment_kitchen_0", kraf.george.chooseadventure.R.layout.fragment_kitchen);
      sKeys.put("layout/fragment_kitchen_lose_0", kraf.george.chooseadventure.R.layout.fragment_kitchen_lose);
      sKeys.put("layout/fragment_kitchen_win_0", kraf.george.chooseadventure.R.layout.fragment_kitchen_win);
      sKeys.put("layout/fragment_no_wash_0", kraf.george.chooseadventure.R.layout.fragment_no_wash);
      sKeys.put("layout/fragment_phone_0", kraf.george.chooseadventure.R.layout.fragment_phone);
      sKeys.put("layout/fragment_soda_0", kraf.george.chooseadventure.R.layout.fragment_soda);
      sKeys.put("layout/fragment_soda_lose_0", kraf.george.chooseadventure.R.layout.fragment_soda_lose);
      sKeys.put("layout/fragment_soda_win_0", kraf.george.chooseadventure.R.layout.fragment_soda_win);
      sKeys.put("layout/fragment_title_0", kraf.george.chooseadventure.R.layout.fragment_title);
      sKeys.put("layout/fragment_wash_0", kraf.george.chooseadventure.R.layout.fragment_wash);
    }
  }
}
