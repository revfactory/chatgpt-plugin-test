package com.kakao.tech.chatgptplugintest

import org.springframework.web.bind.annotation.*

@RestController
class KakaoMemoController(private val kakaoMemoService: KakaoMemoService) {

    @GetMapping("/memos")
    fun getMemos(): Map<String, String> {
        return kakaoMemoService.getMemos()
    }

    @GetMapping("/memos/{name}")
    fun getMemo(@PathVariable name: String): String? {
        return kakaoMemoService.getMemo(name)
    }

    @PostMapping("/memos")
    fun addMemo(@RequestParam name: String, @RequestParam memo: String) {
        kakaoMemoService.addMemo(name, memo)
    }

    @DeleteMapping("/memos/{name}")
    fun deleteMemo(@PathVariable name: String) {
        kakaoMemoService.deleteMemo(name)
    }
}