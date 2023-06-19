package com.example.ottproject.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ottproject.R

class Fragment_SearchResult : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.search_result, container, false)
        // 프래그먼트의 UI 초기화 및 이벤트 처리 작업을 수행합니다.
        // 예: 검색 결과를 처리하는 코드
        return rootView
    }
}
