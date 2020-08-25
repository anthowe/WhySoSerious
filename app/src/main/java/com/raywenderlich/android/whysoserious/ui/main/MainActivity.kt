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

package com.raywenderlich.android.whysoserious.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.raywenderlich.android.whysoserious.R
import com.raywenderlich.android.whysoserious.common.onPageChange
import com.raywenderlich.android.whysoserious.ui.main.pager.MainPagerAdapter

import com.raywenderlich.android.whysoserious.ui.profile.ProfileFragment
import com.raywenderlich.android.whysoserious.ui.verizon.VerizonFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  companion object {
    fun getLaunchIntent(from: Context) = Intent(from, MainActivity::class.java).apply {
      addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    initUi()
    Log.e("Hi", "Main")
  }

  private fun initUi() {
    val adapter = MainPagerAdapter(supportFragmentManager)
    adapter.setPages(listOf(ProfileFragment(), VerizonFragment()))

    mainPager.adapter = adapter
    mainPager.offscreenPageLimit = 3
    bottomNavigation.setOnNavigationItemSelectedListener {
      switchNavigationTab(it.order)
      true
    }

    mainPager.onPageChange { position ->
      val item = bottomNavigation.menu.getItem(position)

      bottomNavigation.selectedItemId = item.itemId
    }


  }


  private fun switchNavigationTab(position: Int) = mainPager.setCurrentItem(position, true)
}