package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new kraf.george.chooseadventure.DataBinderMapperImpl());
  }
}
