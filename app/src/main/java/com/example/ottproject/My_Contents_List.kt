package com.example.ottproject

import android.app.TabActivity
import android.os.Bundle
import com.example.ottproject.R

//package com.example.ottproject
//
//import android.app.Activity
//import android.os.Bundle
//
//class My_Contents_List : Activity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.my_contents_list)
//    }
//
//}

class My_Contents_List : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_contents_list)

        var tabHost = this.tabHost

        var tabSpecSong = tabHost.newTabSpec("ALL").setIndicator("전체보기")
        tabSpecSong.setContent(R.id.all)
        tabHost.addTab(tabSpecSong)

        var tabSpecArtist = tabHost.newTabSpec("LIKE").setIndicator("좋아요")
        tabSpecArtist.setContent(R.id.like)
        tabHost.addTab(tabSpecArtist)

        var tabSpecAlbum = tabHost.newTabSpec("HATE").setIndicator("싫어요")
        tabSpecAlbum.setContent(R.id.hate)
        tabHost.addTab(tabSpecAlbum)

        tabHost.currentTab = 0
    }
}