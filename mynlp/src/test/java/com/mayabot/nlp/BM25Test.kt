package com.mayabot.nlp

import com.mayabot.nlp.similarity.BM25ModelBuilder

class BM25Test {
}

fun main() {
    val doc = listOf<String>(
            "黄浦区人民政府在哪",
            "黄浦区人民政府要怎么去",
            "区政府在哪？",
            "区政府怎么走？",
            "区人民政府在哪儿",
            "黄浦区人民政府的工作地址",
            "黄浦区政府在哪",
            "人民政府要怎么去",
            "人民政府的工作地址",
            "黄浦区人民政府的电话是多少",
            "黄浦区人民政府的电话号码是多少",
            "区政府电话",
            "区政府的联系方式",
            "黄浦区行政服务中心在哪",
            "黄浦区行政服务中心要怎么去",
            "行政服务中心在哪",
            "行政服务中心要怎么去",
            "行政服务中心的工作地址",
            "区行政服务中心在哪？",
            "黄浦区金融发展服务中心都几点有人",
            "黄浦区金融发展服务中心都几点有人在工作",
            "我什么时候去金融发展服务中心比较合适",
            "金融发展服务中心的工作时间是几点",
            "我几点去金融发展服务中心比较合适",
            "金融发展服务中心的工作时间是几点",
            "金融发展服务中心一周的工作时间都是几点到几点",
            "区金融发展服务中心上班时间",
            "请问一下金融发展服务中心电话",
            "请给我金融发展服务中心的电话",
            "请把金融发展服务中心的电话给我",
            "区金融发展服务中心的电话",
            "区金融发展服务中心的联系方式",
            "黄浦区金融发展服务中心在哪",
            "黄浦区金融发展服务中心要怎么去",
            "区金融发展服务中心在哪？",
            "黄浦区金融发展服务中心的工作地址",
            "金融发展服务中心在哪",
            "金融发展服务中心要怎么去",
            "金融发展服务中心的工作地址",
            "怎么去",
//            "请问一下行政服务的电话"
    )

    val bm25 = BM25ModelBuilder(doc).b(0.75f).build()

    bm25.search("怎么去").forEach {
        println(" ${doc[it.docId]}   $it")
    }

}