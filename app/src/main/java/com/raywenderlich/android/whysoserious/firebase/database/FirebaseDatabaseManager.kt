/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.whysoserious.firebase.database

import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import com.raywenderlich.android.whysoserious.model.Joke
import com.raywenderlich.android.whysoserious.model.User
import javax.inject.Inject

private const val KEY_USER = "user"
private const val KEY_JOKE = "joke"
private const val KEY_FAVORITE = "favorite"


class FirebaseDatabaseManager @Inject constructor(private val database: FirebaseDatabase) : FirebaseDatabaseInterface {

  override fun createUser(id: String, name: String, email: String, phone: String) {
    val user = User(id, name, email, phone)
Log.i("Activity", "FDM called")
    database
            .reference        // 1
            .child(KEY_USER)  // 2
            .child(id)        // 3
            .setValue(user)   // 4
  }

  override fun listenToJokes(onResult: (Joke) -> Unit) {
  }

  override fun addNewJoke(joke: Joke, onResult: (Boolean) -> Unit) {
  }

  override fun getFavoriteJokes(userId: String, onResult: (List<Joke>) -> Unit) {
  }

  override fun changeJokeFavoriteStatus(joke: Joke, userId: String) {
  }

  override fun getProfile(id: String, onResult: (User) -> Unit) {
  }
}