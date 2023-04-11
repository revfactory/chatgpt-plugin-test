package com.kakao.tech.chatgptplugintest

import org.springframework.stereotype.Service

@Service
class KakaoMemoService {
    private val memos = mutableMapOf<String, String>()

    fun getMemos(): Map<String, String> {
        return memos
    }

    fun getMemo(name: String): String? {
        return memos[name]
    }

    fun addMemo(name: String, memo: String) {
        memos[name] = memo
    }

    fun deleteMemo(name: String) {
        memos.remove(name)
    }
}