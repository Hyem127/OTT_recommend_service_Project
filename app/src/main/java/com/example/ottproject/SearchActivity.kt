package com.example.ottproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import android.widget.SearchView
import com.example.ottproject.Fragment.Fragment_SearchResult
import com.example.ottproject.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        val fragmentSearchResult = Fragment_SearchResult()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragmentSearchResult)
            .commit()

        // 액티비티 전환 효과 적용
        overridePendingTransition(R.anim.slide_left, R.anim.slide_right)

        // 서치뷰에 포커스 주기
        val searchView = findViewById<SearchView>(R.id.searchView)
        searchView.requestFocus()

        // 키보드 자동 표시
        val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.showSoftInput(searchView, InputMethodManager.SHOW_IMPLICIT)
    }

    // 액티비티가 종료될 때 애니메이션 효과 적용 (이거 적용하니까 좀 혼란스러워서 안 쓸래.)
//    override fun onBackPressed() {
//        super.onBackPressed()
//        overridePendingTransition(R.anim.slide_right, R.anim.slide_left)
//    }
}


