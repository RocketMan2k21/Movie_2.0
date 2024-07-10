package com.bestdeveloper.pagingapp;

import com.bumptech.glide.RequestManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<RequestManager> requestManagerProvider;

  public MainActivity_MembersInjector(Provider<RequestManager> requestManagerProvider) {
    this.requestManagerProvider = requestManagerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<RequestManager> requestManagerProvider) {
    return new MainActivity_MembersInjector(requestManagerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectRequestManager(instance, requestManagerProvider.get());
  }

  @InjectedFieldSignature("com.bestdeveloper.pagingapp.MainActivity.requestManager")
  public static void injectRequestManager(MainActivity instance, RequestManager requestManager) {
    instance.requestManager = requestManager;
  }
}
