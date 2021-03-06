// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.raywenderlich.android.whysoserious.firebase.database;

import com.google.firebase.database.FirebaseDatabase;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FirebaseDatabaseManager_Factory implements Factory<FirebaseDatabaseManager> {
  private final Provider<FirebaseDatabase> databaseProvider;

  public FirebaseDatabaseManager_Factory(Provider<FirebaseDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public FirebaseDatabaseManager get() {
    return new FirebaseDatabaseManager(databaseProvider.get());
  }

  public static Factory<FirebaseDatabaseManager> create(
      Provider<FirebaseDatabase> databaseProvider) {
    return new FirebaseDatabaseManager_Factory(databaseProvider);
  }
}
